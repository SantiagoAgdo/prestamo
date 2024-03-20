package com.mibanco.prestamofic.es.dao.impl;

import com.mibanco.prestamofic.es.constants.Constants;
import com.mibanco.prestamofic.es.dao.contract.IPrestamoDao;
import com.mibanco.prestamofic.es.dao.entity.*;

import com.mibanco.prestamofic.es.utils.configs.ConnectionDB;
import com.mibanco.prestamofic.es.utils.exceptions.ApplicationException;
import com.mibanco.prestamofic.es.utils.mappers.PrestamoMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PrestamoDaoImpl implements IPrestamoDao {

    private static final Logger Log = org.slf4j.LoggerFactory.getLogger(PrestamoDaoImpl.class);
    private Connection connection;

    @Inject
    PrestamoMapper mapper;
    @Inject
    ConnectionDB connectionDB;

    @Override
    public ConsultarPrestamoOutput consultarPrestamo(Integer pagina, Integer tamanoPagina, Integer numeroCliente) {

        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamo");

        List<PrestamoEntity> prestamoEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamo(?,?,?)}");
            callableStatement.setInt(1, numeroCliente);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);
            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoEntity centralRiesgoResponseSP = new PrestamoEntity(
                        resultSet.getString("i_nro_credito"),
                        resultSet.getString("s_cod_producto"),
                        resultSet.getDate("d_fecha_inicio_cre"),
                        resultSet.getDate("d_fecha_de_pago"),
                        resultSet.getFloat("m_valor_desem"),
                        String.format("%.2f", resultSet.getDouble("m_valor_total_adeudado")),
                        resultSet.getString("Estado_Prestamo"),
                        resultSet.getString("i_re_est / marca_modificado"),
                        resultSet.getString("m_tasa_colocacion"),
                        resultSet.getInt("i_plazo"),
                        resultSet.getInt("i_dias_de_mora"),
                        resultSet.getInt("i_dias_mora_maxima_credito"),
                        resultSet.getInt("i_dias_mora_promedio_credito"),
                        resultSet.getFloat("m_tasa_colocacion")
                );

                prestamoEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamo: %s".formatted(e.getMessage()));

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamo");
        }

        int arraySize = prestamoEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new ConsultarPrestamoOutput(arraySize, new ArrayList<>(prestamoEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new ConsultarPrestamoOutput(0, new ArrayList<>());
        }
    }

    @Override
    public CondonadoOutput consultarPrestamoCondonado(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo) {

        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamoCondonado");

        List<PrestamoCondonadoEntity> prestamoCondonadoEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamoCondonado(?,?,?)}");
            callableStatement.setBigDecimal(1, numeroPrestamo);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);
            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoCondonadoEntity centralRiesgoResponseSP = new PrestamoCondonadoEntity(
                        resultSet.getInt("i_nro_cuota"),
                        resultSet.getDate("d_fecha_a_pagar"),
                        String.format("%.2f", resultSet.getDouble("m_capital_condonado")),
                        String.format("%.2f", resultSet.getDouble("m_intereses_corr_condonado")),
                        resultSet.getFloat("m_intereses_mora_condonado"),
                        resultSet.getFloat("m_ley_mipyme_condonado"),
                        resultSet.getFloat("m_seguros_condonado"),
                        resultSet.getFloat("m_gastos_cobranza_condonado"),
                        resultSet.getFloat("m_int_dif_reest_modif_condonado"),
                        resultSet.getFloat("m_otros_conceptos_condonado"),
                        String.format("%.2f", resultSet.getDouble("m_valor_total_cuota_condonado")),
                        resultSet.getString("i_estado_cuota"),
                        resultSet.getDate("d_fecha_pago"),
                        resultSet.getInt("i_dias_de_mora")

                );

                prestamoCondonadoEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamoCondonado: " + e.getMessage());

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamoCondonado");
        }

        int arraySize = prestamoCondonadoEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new CondonadoOutput(arraySize, new ArrayList<>(prestamoCondonadoEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new CondonadoOutput(0, new ArrayList<>());
        }
    }

    @Override
    public DetallePagosOutput consultarPrestamoDetallePagos(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo) {

        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamoDetallePagos");

        List<PrestamoDetallePagosEntity> prestamoDetallePagosEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamoDetallePagos(?,?,?)}");
            callableStatement.setBigDecimal(1, numeroPrestamo);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);
            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoDetallePagosEntity centralRiesgoResponseSP = new PrestamoDetallePagosEntity(
                        numeroPrestamo.toString(),
                        resultSet.getString("i_nro_cuota"),
                        resultSet.getDate("d_fecha_a_pagar"),
                        resultSet.getDouble("m_capital_pagado"),
                        resultSet.getDouble("m_intereses_corr_pagado"),
                        resultSet.getDouble("m_intereses_mora_pagado"),
                        resultSet.getFloat("m_ley_mipyme_pagado"),
                        resultSet.getFloat("m_seguros_pagado"),
                        resultSet.getFloat("m_gastos_cobranza_pagado"),
                        resultSet.getFloat("m_int_dif_reest_modif_pagado"),
                        resultSet.getFloat("m_otros_conceptos_pagado"),
                        resultSet.getFloat("m_valor_total_cuota_pagado"),
                        resultSet.getString("i_estado_cuota"),
                        resultSet.getDate("d_fecha_pago"),
                        resultSet.getInt("i_dias_de_mora")
                );

                prestamoDetallePagosEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamoDetallePagos: " + e.getMessage());
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "Columna No Identificada /  Error Tipo de Dato en respuesta de SP");

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamoDetallePagos");
        }

        int arraySize = prestamoDetallePagosEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new DetallePagosOutput(arraySize, new ArrayList<>(prestamoDetallePagosEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new DetallePagosOutput(0, new ArrayList<>());
        }
    }

    @Override
    public GarantiaOutput consultarPrestamoGarantiaOutput(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamoGarantia");

        List<PrestamoGarantiaEntity> prestamoGarantiaEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamoGarantia(?,?,?)}");
            callableStatement.setBigDecimal(1, numeroPrestamo);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);
            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoGarantiaEntity centralRiesgoResponseSP = new PrestamoGarantiaEntity(
                        numeroPrestamo.toString(),
                        resultSet.getString("tipo_de_garantia"),
                        resultSet.getString("Subtipo"),
                        resultSet.getDouble("valor_avaluo_comercial"),
                        resultSet.getString("Referencia")
                );

                prestamoGarantiaEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamoGarantiaOutput: " + e.getMessage());

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamoGarantia");
        }

        int arraySize = prestamoGarantiaEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new GarantiaOutput(arraySize, new ArrayList<>(prestamoGarantiaEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new GarantiaOutput(0, new ArrayList<>());
        }
    }

    @Override
    public OtroTitularOutput consultarPrestamoOtroTitular(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamoOtroTitular");

        List<PrestamoOtroTitularEntity> prestamoOtroTitularEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamoOtroTitular(?,?,?)}");
            callableStatement.setBigDecimal(1, numeroPrestamo);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);

            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoOtroTitularEntity centralRiesgoResponseSP = new PrestamoOtroTitularEntity(
                        numeroPrestamo.toString(),
                        mapper.stringToTipoDocumentoEnum(resultSet.getString("s_codigo_tipo_ident")),
                        resultSet.getString("s_numero_identificacion"),
                        resultSet.getString("s_nombre_completo"),
                        resultSet.getString("tipoTitular")
                );

                prestamoOtroTitularEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamoOtroTitular: " + e.getMessage());
            throw new ApplicationException(
                    Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), Constants.SERVICIO_INTERNAL + "Columna no identificada"
            );
        } catch (Exception e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamoOtroTitular: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamoOtroTitular");
        }

        int arraySize = prestamoOtroTitularEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new OtroTitularOutput(arraySize, new ArrayList<>(prestamoOtroTitularEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new OtroTitularOutput(0, new ArrayList<>());
        }
    }

    @Override
    public PlanDePagosOutput consultarPrestamoPlanDePagos(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamoPlanDePagos");

        List<PrestamoPlanDePagosEntity> prestamoEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamoPlanDePagos(?,?,?)}");
            callableStatement.setBigDecimal(1, numeroPrestamo);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);
            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoPlanDePagosEntity centralRiesgoResponseSP = new PrestamoPlanDePagosEntity(
                        numeroPrestamo.toString(),
                        resultSet.getString("i_nro_cuota"),
                        resultSet.getDate("d_fecha_a_pagar"),
                        String.format("%.2f", resultSet.getDouble("m_capital_a_pagar")),
                        String.format("%.2f", resultSet.getDouble("m_intereses_corr_a_pagar")),
                        String.format("%.2f", resultSet.getDouble("OtrosCargos")),
                        String.format("%.2f", resultSet.getDouble("m_valor_total_cuota_a_pagar")),
                        String.format("%.2f", resultSet.getDouble("m_saldo_capital")),
                        resultSet.getString("i_estado_cuota"),
                        resultSet.getInt("i_dias_de_mora"),
                        resultSet.getDate("d_fecha_pago"),
                        resultSet.getDouble("m_pagado"),
                        ""
                );

                prestamoEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamo: " + e.getMessage());

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamoPlanDePagos");
        }

        int arraySize = prestamoEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new PlanDePagosOutput(arraySize, new ArrayList<>(prestamoEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new PlanDePagosOutput(0, new ArrayList<>());
        }
    }

    @Override
    public PlanDePagosOtroCargoOutput consultarPrestamoPlanDePagosOtroCargo(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo) {

        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamoPlanDePagosOtroCargo");

        List<PrestamoPlanDePagosOtroCargoEntity> prestamoPlanDePagosOtroCargoEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamoPlanDePagosOtroCargo(?,?,?)}");
            callableStatement.setBigDecimal(1, numeroPrestamo);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);
            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoPlanDePagosOtroCargoEntity centralRiesgoResponseSP = new PrestamoPlanDePagosOtroCargoEntity(
                        numeroPrestamo.toString(),
                        resultSet.getFloat("valor"),
                        resultSet.getString("descripcion_otros_cargos")
                );

                prestamoPlanDePagosOtroCargoEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamoPlanDePagosOtroCargo: " + e.getMessage());

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamoPlanDePagosOtroCargo");
        }

        int arraySize = prestamoPlanDePagosOtroCargoEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new PlanDePagosOtroCargoOutput(arraySize, new ArrayList<>(prestamoPlanDePagosOtroCargoEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new PlanDePagosOtroCargoOutput(0, new ArrayList<>());
        }
    }

    @Override
    public PrestamoPorPagarOutput consultarPrestamoPorPagar(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        Log.info("Inicia Proceso de consumo sp_fic_consultarPrestamoPorPagar");

        List<PrestamoPorPagarEntity> prestamoPorPagarEntityList = new ArrayList<>();

        try {
            connection = connectionDB.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call sp_fic_consultarPrestamoPorPagar(?,?,?)}");
            callableStatement.setBigDecimal(1, numeroPrestamo);
            callableStatement.setInt(2, pagina);
            callableStatement.setInt(3, tamanoPagina);
            //73. El sistema realiza una transformación de datos por medio de la capa DAO, cuando la consulta retorna la siguiente información
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PrestamoPorPagarEntity centralRiesgoResponseSP = new PrestamoPorPagarEntity(
                        resultSet.getInt("i_nro_cuota"),
                        resultSet.getDate("d_fecha_a_pagar"),
                        String.format("%.2f", resultSet.getDouble("m_capital_a_pagar")),
                        resultSet.getFloat("m_intereses_corr_a_pagar"),
                        resultSet.getFloat("m_intereses_mora_a_pagar"),
                        resultSet.getFloat("m_ley_mipyme_a_pagar"),
                        resultSet.getFloat("m_seguros_a_pagar"),
                        resultSet.getFloat("m_gastos_cobranza_a_pagar"),
                        resultSet.getFloat("m_int_dif_reest_modif_a_pagar"),
                        resultSet.getFloat("m_otros_conceptos_a_pagar"),
                        resultSet.getDouble("m_valor_total_cuota_a_pagar"),
                        resultSet.getString("i_estado_cuota"),
                        resultSet.getDate("d_fecha_pago"),
                        resultSet.getInt("i_dias_de_mora")
                );

                prestamoPorPagarEntityList.add(centralRiesgoResponseSP);
            }
            resultSet.close();
        } catch (SQLException e) {
            Log.error("Error al ejecutar la consulta en el método consultarPrestamo: " + e.getMessage());

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    Log.info("Conexión cerrada correctamente");
                }
            } catch (SQLException e) {
                Log.error("Error al cerrar la conexión: " + e.getMessage());
            }
            Log.info("Termina Consulta consultarPrestamoPorPagar");
        }

        int arraySize = prestamoPorPagarEntityList.size();
        if (pagina > (arraySize / tamanoPagina) + 1) {
            throw new ApplicationException(Response.Status.CONFLICT.getStatusCode(), "Limite de pagina Excedido, calcular bien maximo de paginacion");
        }

        if (arraySize != 0) {
            int inicioDeIndice = (pagina - 1) * tamanoPagina + 1;
            int finalDeIndice;

            // Si el tamaño del array es menor que el tamaño de la página, o estamos en la última página
            if (arraySize < tamanoPagina || inicioDeIndice + tamanoPagina - 1 > arraySize) {
                finalDeIndice = arraySize + 1;
            } else {
                finalDeIndice = inicioDeIndice + tamanoPagina;
            }

            return new PrestamoPorPagarOutput(arraySize, new ArrayList<>(prestamoPorPagarEntityList.subList(inicioDeIndice - 1, finalDeIndice - 1)));
        } else {
            return new PrestamoPorPagarOutput(0, new ArrayList<>());
        }
    }
}
