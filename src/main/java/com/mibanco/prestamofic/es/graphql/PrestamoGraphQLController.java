package com.mibanco.prestamofic.es.graphql;

import com.mibanco.prestamofic.es.dao.entity.*;
import com.mibanco.prestamofic.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamofic.es.utils.exceptions.ApplicationException;
import com.mibanco.prestamofic.es.utils.validator.PrestamoValidator;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

@GraphQLApi
public class PrestamoGraphQLController {

    public static final Logger logger = LoggerFactory.getLogger(PrestamoGraphQLController.class);

    @Inject
    PrestamoServiceImpl service;

    @Inject
    PrestamoValidator prestamoValidator;

    @Query("consultarPrestamo")
    @Description("Consulta de Prestamos")
    public ConsultarPrestamoOutput consultarPrestamo(@Name("page") Integer page, @Name("pageSize") Integer pageSize, @Name("numeroCliente") Integer numeroCliente) {
        logger.info("Inicia consultarPrestamo en GraphQL");
        try {
            prestamoValidator.validarNumeroCLiente(numeroCliente);
            ConsultarPrestamoOutput prestamoTypeList = service.consultarPrestamo(page, pageSize, numeroCliente);
            logger.info("Termina consultarPrestamo en GraphQL");
            return prestamoTypeList;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamo GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoCondonado")
    @Description("Consulta de Prestamos condonados")
    public CondonadoOutput consultarPrestamoCondonado(@Name("pagina") Integer pagina, @Name("tamanoPagina") Integer tamanoPagina, @Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoCondonado en GraphQL");
        try {
            CondonadoOutput prestamoCondonadoTypes = service.consultarPrestamoCondonado(pagina, tamanoPagina, new BigDecimal(numeroPrestamo));
            logger.info("Termina consultarPrestamoCondonado en GraphQL");
            return prestamoCondonadoTypes;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoCondonado GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoDetallePagos")
    @Description("Consulta de Prestamos con detalle de pagos")
    public DetallePagosOutput consultarPrestamoDetallePagos(@Name("pagina") Integer pagina, @Name("tamanoPagina") Integer tamanoPagina, @Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoDetallePagos en GraphQL");
        try {
            
            prestamoValidator.validarConsulta(new BigDecimal(numeroPrestamo));
            DetallePagosOutput prestamoDetallePagosTypeList = service.consultarPrestamoDetallePagos(pagina, tamanoPagina, new BigDecimal(numeroPrestamo));
            logger.info("Termina consultarPrestamoDetallePagos en GraphQL");
            return prestamoDetallePagosTypeList;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoDetallePagos GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoGarantiaOutput")
    @Description("Consulta de Prestamos Garantia")
    public GarantiaOutput consultarPrestamoGarantiaOutput(@Name("pagina") Integer pagina, @Name("tamanoPagina") Integer tamanoPagina, @Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoGarantiaOutput en GraphQL");
        try {
            prestamoValidator.validarConsulta(new BigDecimal(numeroPrestamo));
            GarantiaOutput prestamoGarantiaTypeList = service.consultarPrestamoGarantiaOutput(pagina, tamanoPagina, new BigDecimal(numeroPrestamo));
            logger.info("Termina consultarPrestamoGarantiaOutput en GraphQL");
            return prestamoGarantiaTypeList;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoGarantiaOutput GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoOtroTitular")
    @Description("Consulta de Préstamos de otro titular")
    public OtroTitularOutput consultarPrestamoOtroTitular(@Name("pagina") Integer pagina, @Name("tamanoPagina") Integer tamanoPagina, @Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoOtroTitular en GraphQL");
        try {
            prestamoValidator.validarConsulta(new BigDecimal(numeroPrestamo));
            OtroTitularOutput prestamoOtroTitularTypeList = service.consultarPrestamoOtroTitular(pagina, tamanoPagina, new BigDecimal(numeroPrestamo));
            logger.info("Termina consultarPrestamoOtroTitular en GraphQL");
            return prestamoOtroTitularTypeList;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoOtroTitular GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPlanDePagos")
    @Description("Consulta de Préstamos con plan de pagos")
    public PlanDePagosOutput consultarPrestamoPlanDePagos(@Name("pagina") Integer pagina, @Name("tamanoPagina") Integer tamanoPagina, @Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoPlanDePagos en GraphQL");
        try {
            prestamoValidator.validarConsulta(new BigDecimal(numeroPrestamo));
            PlanDePagosOutput prestamoPlanDePagosTypeList = service.consultarPrestamoPlanDePagos(pagina, tamanoPagina, new BigDecimal(numeroPrestamo));
            logger.info("Termina consultarPrestamoPlanDePagos en GraphQL");
            return prestamoPlanDePagosTypeList;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoPlanDePagos GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPlanDePagosOtroCargo")
    @Description("Consulta de Plan de pagos préstamos otro cargo")
    public PlanDePagosOtroCargoOutput consultarPrestamoPlanDePagosOtroCargo(@Name("pagina") Integer pagina, @Name("tamanoPagina") Integer tamanoPagina, @Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoPlanDePagosOtroCargo en GraphQL");
        try {
            prestamoValidator.validarConsulta(new BigDecimal(numeroPrestamo));
            PlanDePagosOtroCargoOutput prestamoPlanDePagosOtroCargoTypeList = service.consultarPrestamoPlanDePagosOtroCargo(pagina, tamanoPagina, new BigDecimal(numeroPrestamo));
            logger.info("Termina consultarPrestamoPlanDePagosOtroCargo en GraphQL");
            return prestamoPlanDePagosOtroCargoTypeList;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoPlanDePagosOtroCargo GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPorPagar")
    @Description("Consulta de Préstamos por pagar")
    public PrestamoPorPagarOutput consultarPrestamoPorPagar(@Name("pagina") Integer pagina, @Name("tamanoPagina") Integer tamanoPagina, @Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoPorPagar en GraphQL");
        try {
            prestamoValidator.validarConsulta(new BigDecimal(numeroPrestamo));
            PrestamoPorPagarOutput prestamoPorPagarTypeList = service.consultarPrestamoPorPagar(pagina, tamanoPagina, new BigDecimal(numeroPrestamo));
            logger.info("Termina consultarPrestamoPorPagar en GraphQL");
            return prestamoPorPagarTypeList;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoPorPagar GraphQL" + e.getMessage());
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "N0_ENCONTRADO: " + e.getMessage() + " en PrestamoGraphQLController");
        } catch (Exception e) {
            throw new ApplicationException(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }


}
