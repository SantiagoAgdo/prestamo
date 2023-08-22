package com.mibanco.prestamo.es.services.contract;

import com.mibanco.prestamo.es.gen.type.*;

import java.util.List;

public interface PrestamoService {

    List<PrestamoType> consultarPrestamo(Integer numeroCliente);

    List<PrestamoCondonadoType> consultarPrestamoCondonado(Integer numeroPrestamo);

    List<PrestamoDetallePagosType> consultarPrestamoDetallePagos(Integer numeroPrestamo);

    List<PrestamoGarantiaType> consultarPrestamoGarantiaOutput(Integer numeroPrestamo);

    List<PrestamoOtroTitularType> consultarPrestamoOtroTitular(Integer numeroPrestamo);

    List<PrestamoPlanDePagosType> consultarPrestamoPlanDePagos(Integer numeroPrestamo);

    List<PrestamoPlanDePagosOtroCargoType> consultarPrestamoPlanDePagosOtroCargo(Integer numeroPrestamo, Integer numeroCuota);

    List<PrestamoPorPagarType> consultarPrestamoPorPagar(Integer numeroPrestamo);

}
