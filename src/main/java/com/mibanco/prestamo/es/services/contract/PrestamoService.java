package com.mibanco.prestamo.es.services.contract;

import com.mibanco.prestamo.es.gen.type.*;

import java.util.List;

public interface PrestamoService {

    List<PrestamoType> consultarPrestamo(Integer numeroCliente);
    List<PrestamoCondonadoType> consultarPrestamoCondonado(Integer numeroCliente);
    List<PrestamoDetallePagosType> consultarPrestamoDetallePagos(Integer numeroCliente);
    List<PrestamoGarantiaType> consultarPrestamoGarantiaOutput(Integer numeroCliente);
    List<PrestamoOtroTitularType> consultarPrestamoOtroTitular(Integer numeroCliente);
    List<PrestamoPlanDePagosType> consultarPrestamoPlanDePagos(Integer numeroCliente);
    List<PrestamoPlanDePagosOtroCargoType> consultarPrestamoPlanDePagosOtroCargo(Integer numeroCliente);
    List<PrestamoPorPagarType> consultarPrestamoPorPagar(Integer numeroCliente);

}
