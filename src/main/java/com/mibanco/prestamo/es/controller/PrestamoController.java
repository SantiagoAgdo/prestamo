package com.mibanco.prestamo.es.controller;

import com.mibanco.prestamo.es.gen.contract.V1Prestamo;
import jakarta.ws.rs.core.Response;

public class PrestamoController implements V1Prestamo {
    @Override
    public Response consultarPrestamo(Integer numeroCliente) {
        return null;
    }

    @Override
    public Response consultarPrestamoCondonado(Integer numeroPrestamo) {
        return null;
    }

    @Override
    public Response consultarPrestamoGarantia(Integer numeroPrestamo) {
        return null;
    }

    @Override
    public Response consultarPrestamoOtroTitular(Integer numeroPrestamo) {
        return null;
    }

    @Override
    public Response consultarPrestamoPlanDePagos(Integer numeroPrestamo) {
        return null;
    }

    @Override
    public Response consultarPrestamoPlanDePagosOtroCargo(Integer numeroPrestamo, Integer numeroCuota) {
        return null;
    }

    @Override
    public Response consultarPrestamoPorPagar(Integer numeroPrestamo) {
        return null;
    }

    @Override
    public Response prestamoDetallePagos(Integer numeroPrestamo) {
        return null;
    }
}
