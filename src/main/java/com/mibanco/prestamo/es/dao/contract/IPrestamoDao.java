package com.mibanco.prestamo.es.dao.contract;

import com.mibanco.prestamo.es.dao.entity.*;

import java.util.List;

public interface IPrestamoDao {

    List<PrestamoEntity> consultarPrestamo(Integer numeroCliente);
    List<PrestamoCondonadoEntity> consultarPrestamoCondonado(Integer numeroCliente);
    List<PrestamoDetallePagosEntity> consultarPrestamoDetallePagos(Integer numeroCliente);
    List<PrestamoGarantiaEntity> consultarPrestamoGarantiaOutput(Integer numeroCliente);
    List<PrestamoOtroTitularEntity> consultarPrestamoOtroTitular(Integer numeroCliente);
    List<PrestamoPlanDePagosEntity> consultarPrestamoPlanDePagos(Integer numeroCliente);

    List<PrestamoPlanDePagosOtroCargoEntity> consultarPrestamoPlanDePagosOtroCargo(Integer numeroCliente, Integer nCuota);

    List<PrestamoPorPagarEntity> consultarPrestamoPorPagar(Integer numeroCliente);
}
