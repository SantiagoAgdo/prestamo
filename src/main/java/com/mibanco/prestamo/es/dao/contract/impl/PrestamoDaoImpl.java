package com.mibanco.prestamo.es.dao.contract.impl;

import com.mibanco.prestamo.es.dao.contract.IPrestamoDao;
import com.mibanco.prestamo.es.dao.entity.*;

import java.util.List;

public class PrestamoDaoImpl implements IPrestamoDao {
    @Override
    public List<PrestamoEntity> consultarPrestamo(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoCondonadoEntity> consultarPrestamoCondonado(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoDetallePagosEntity> consultarPrestamoDetallePagos(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoGarantiaEntity> consultarPrestamoGarantiaOutput(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoOtroTitularEntity> consultarPrestamoOtroTitular(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoPlanDePagosEntity> consultarPrestamoPlanDePagos(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoPlanDePagosOtroCargoEntity> consultarPrestamoPlanDePagosOtroCargo(Integer numeroCliente) {
        return null;
    }

    @Override
    public List<PrestamoPorPagarEntity> consultarPrestamoPorPagar(Integer numeroCliente) {
        return null;
    }
}
