package com.mibanco.prestamofic.es.services.impl;

import com.mibanco.prestamofic.es.dao.impl.PrestamoDaoImpl;
import com.mibanco.prestamofic.es.dao.entity.*;
import com.mibanco.prestamofic.es.services.contract.PrestamoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

@ApplicationScoped
public class PrestamoServiceImpl implements PrestamoService {

    public static final Logger LOG = LoggerFactory.getLogger(PrestamoServiceImpl.class);

    @Inject
    PrestamoDaoImpl prestamoDao;

    @Override
    public ConsultarPrestamoOutput consultarPrestamo(Integer pagina, Integer tamanoPagina, Integer numeroCliente) {
        LOG.info("Inicia consulta de Préstamo");
        ConsultarPrestamoOutput prestamoEntityList = prestamoDao.consultarPrestamo(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo");
        return prestamoEntityList;
    }

    @Override
    @Transactional
    public CondonadoOutput consultarPrestamoCondonado(Integer pagina, Integer tamanoPagina, BigDecimal numeroCliente) {
        LOG.info("Inicia consulta de Préstamo Condonado");
        CondonadoOutput prestamoCondonadoEntityList = prestamoDao.consultarPrestamoCondonado(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo Condonado");
        return prestamoCondonadoEntityList;
    }

    @Override
    @Transactional
    public DetallePagosOutput consultarPrestamoDetallePagos(Integer pagina, Integer tamanoPagina, BigDecimal numeroCliente) {
        LOG.info("Inicia consulta de Préstamo Detalle Pagos");
        DetallePagosOutput prestamoDetallePagosEntityList = prestamoDao.consultarPrestamoDetallePagos(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo Detalle Pagos");
        return prestamoDetallePagosEntityList;
    }

    @Override
    @Transactional
    public GarantiaOutput consultarPrestamoGarantiaOutput(Integer pagina, Integer tamanoPagina, BigDecimal numeroCliente) {
        LOG.info("Inicia consulta de Préstamo garantias");
        GarantiaOutput prestamoGarantiaEntityList = prestamoDao.consultarPrestamoGarantiaOutput(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo garantias");
        return prestamoGarantiaEntityList;
    }

    @Override
    @Transactional
    public OtroTitularOutput consultarPrestamoOtroTitular(Integer pagina, Integer tamanoPagina, BigDecimal numeroCliente) {
        LOG.info("Inicia consulta de Préstamo otro titular");
        OtroTitularOutput prestamoOtroTitularEntityList = prestamoDao.consultarPrestamoOtroTitular(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo otro titular");
        return prestamoOtroTitularEntityList;
    }

    @Override
    @Transactional
    public PlanDePagosOutput consultarPrestamoPlanDePagos(Integer pagina, Integer tamanoPagina, BigDecimal numeroCliente) {
        LOG.info("Inicia consulta de Préstamo plan de pagos");
        PlanDePagosOutput prestamoPlanDePagosEntityList = prestamoDao.consultarPrestamoPlanDePagos(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo plan de pagos");
        return prestamoPlanDePagosEntityList;
    }

    @Override
    @Transactional
    public PlanDePagosOtroCargoOutput consultarPrestamoPlanDePagosOtroCargo(Integer pagina, Integer tamanoPagina, BigDecimal numeroCliente) {
        LOG.info("Inicia consulta de Préstamo plan de pagos otro cargo");
        PlanDePagosOtroCargoOutput prestamoPlanDePagosOtroCargoEntityList = prestamoDao.consultarPrestamoPlanDePagosOtroCargo(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo plan de pagos otro cargo");
        return prestamoPlanDePagosOtroCargoEntityList;
    }

    @Override
    @Transactional
    public PrestamoPorPagarOutput consultarPrestamoPorPagar(Integer pagina, Integer tamanoPagina, BigDecimal numeroCliente) {
        LOG.info("Inicia consulta de Préstamo por pagar");
        PrestamoPorPagarOutput prestamoPorPagarEntityList = prestamoDao.consultarPrestamoPorPagar(pagina, tamanoPagina, numeroCliente);

        LOG.info("Termina consulta de Préstamo");
        return prestamoPorPagarEntityList;
    }
}
