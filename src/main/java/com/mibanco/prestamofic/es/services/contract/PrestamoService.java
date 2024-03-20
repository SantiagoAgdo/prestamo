package com.mibanco.prestamofic.es.services.contract;

import com.mibanco.prestamofic.es.dao.entity.*;

import java.math.BigDecimal;
import java.util.List;

public interface PrestamoService {

    ConsultarPrestamoOutput consultarPrestamo(Integer pagina, Integer tamanoPagina, Integer numeroCliente);

    CondonadoOutput consultarPrestamoCondonado(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo);

    DetallePagosOutput consultarPrestamoDetallePagos(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo);

    GarantiaOutput consultarPrestamoGarantiaOutput(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo);

    OtroTitularOutput consultarPrestamoOtroTitular(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo);

    PlanDePagosOutput consultarPrestamoPlanDePagos(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo);

    PlanDePagosOtroCargoOutput consultarPrestamoPlanDePagosOtroCargo(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo);

    PrestamoPorPagarOutput consultarPrestamoPorPagar(Integer pagina, Integer tamanoPagina, BigDecimal numeroPrestamo);

}
