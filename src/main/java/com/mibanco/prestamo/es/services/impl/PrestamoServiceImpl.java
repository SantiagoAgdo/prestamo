package com.mibanco.prestamo.es.services.impl;

import com.mibanco.prestamo.es.dao.contract.impl.PrestamoDaoImpl;
import com.mibanco.prestamo.es.dao.entity.*;
import com.mibanco.prestamo.es.gen.type.*;
import com.mibanco.prestamo.es.services.contract.PrestamoService;
import com.mibanco.prestamo.es.utils.mappers.PrestamoMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PrestamoServiceImpl implements PrestamoService {

    public static final Logger LOG = LoggerFactory.getLogger(PrestamoServiceImpl.class);

    @Inject
    PrestamoDaoImpl prestamoDao;

    @Inject
    PrestamoMapper mapper;

    @Override
    @Transactional
    public List<PrestamoType> consultarPrestamo(Integer numeroCliente) {
        LOG.info("Inicia consulta de Prestamo");
        List<PrestamoEntity> list = prestamoDao.consultarPrestamo(numeroCliente);

        LOG.info("Termina consulta de Prestamo");
        return list.stream().map(mapper::prestamoToType).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<PrestamoCondonadoType> consultarPrestamoCondonado(Integer numeroCliente) {
        LOG.info("Inicia consulta de Prestamo Condonado");
        List<PrestamoCondonadoEntity> list = prestamoDao.consultarPrestamoCondonado(numeroCliente);

        LOG.info("Termina consulta de Prestamo Condonado");
        return list.stream().map(mapper::prestamoCondonadoToType).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<PrestamoDetallePagosType> consultarPrestamoDetallePagos(Integer numeroCliente) {
        LOG.info("Inicia consulta de Prestamo Detalle Pagos");
        List<PrestamoDetallePagosEntity> list = prestamoDao.consultarPrestamoDetallePagos(numeroCliente);

        LOG.info("Termina consulta de Prestamo Detalle Pagos");
        return list.stream().map(mapper::prestamoDetallePagosToType).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<PrestamoGarantiaType> consultarPrestamoGarantiaOutput(Integer numeroCliente) {
        LOG.info("Inicia consulta de Prestamo garantias");
        List<PrestamoGarantiaEntity> list = prestamoDao.consultarPrestamoGarantiaOutput(numeroCliente);

        LOG.info("Termina consulta de Prestamo garantias");
        return list.stream().map(mapper::prestamoGarantiaToType).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<PrestamoOtroTitularType> consultarPrestamoOtroTitular(Integer numeroCliente) {
        LOG.info("Inicia consulta de Prestamo otro titular");
        List<PrestamoOtroTitularEntity> list = prestamoDao.consultarPrestamoOtroTitular(numeroCliente);

        LOG.info("Termina consulta de Prestamo otro titular");
        return list.stream().map(mapper::prestamoOtroTitularToType).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<PrestamoPlanDePagosType> consultarPrestamoPlanDePagos(Integer numeroCliente) {
        LOG.info("Inicia consulta de Prestamo plan de pagos");
        List<PrestamoPlanDePagosEntity> list = prestamoDao.consultarPrestamoPlanDePagos(numeroCliente);

        LOG.info("Termina consulta de Prestamo plan de pagos");
        return list.stream().map(mapper::prestamoPlanDePagosToType).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<PrestamoPlanDePagosOtroCargoType> consultarPrestamoPlanDePagosOtroCargo(Integer numeroCliente, Integer numeroCuota) {
        LOG.info("Inicia consulta de Prestamo plan de pagos otro cargo");
        List<PrestamoPlanDePagosOtroCargoEntity> list = prestamoDao.consultarPrestamoPlanDePagosOtroCargo(numeroCliente, numeroCuota);

        LOG.info("Termina consulta de Prestamo plan de pagos otro cargo");
        return list.stream().map(mapper::prestamoPlanDePagosOtroToType).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public List<PrestamoPorPagarType> consultarPrestamoPorPagar(Integer numeroCliente) {
        LOG.info("Inicia consulta de Prestamo por pagar");
        List<PrestamoPorPagarEntity> list = prestamoDao.consultarPrestamoPorPagar(numeroCliente);

        LOG.info("Termina consulta de Prestamo");
        return list.stream().map(mapper::prestamoPorPagarToType).collect(Collectors.toList());
    }
}
