package com.mibanco.prestamo.es.services.impl;

import com.mibanco.prestamo.es.gen.type.*;
import com.mibanco.prestamo.es.services.contract.PrestamoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@ApplicationScoped
public class PrestamoServiceImpl implements PrestamoService {

    public static final Logger LOG = LoggerFactory.getLogger(PrestamoServiceImpl.class);

    @Inject



    @Override
    public List<PrestamoType> consultarPrestamo(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoCondonadoType> consultarPrestamoCondonado(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoDetallePagosType> consultarPrestamoDetallePagos(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoGarantiaType> consultarPrestamoGarantiaOutput(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoOtroTitularType> consultarPrestamoOtroTitular(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoPlanDePagosType> consultarPrestamoPlanDePagos(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoPlanDePagosOtroCargoType> consultarPrestamoPlanDePagosOtroCargo(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoPorPagarType> consultarPrestamoPorPagar(Integer numeroCliente) {
        return null;
    }
}
