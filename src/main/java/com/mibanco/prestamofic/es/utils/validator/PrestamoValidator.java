package com.mibanco.prestamofic.es.utils.validator;

import com.mibanco.prestamofic.es.QueryCliente;
import com.mibanco.prestamofic.es.QueryPrestamo;
import com.mibanco.prestamofic.es.constants.Constants;
import com.mibanco.prestamofic.es.utils.exceptions.ApplicationException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

import java.math.BigDecimal;

@ApplicationScoped
public class PrestamoValidator {

    public void validarPrestamoQuery(QueryPrestamo numeroPrestamo) {
        if (numeroPrestamo == null) {
            throw new ApplicationException(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.SERVICIO_INTERNAL + "número Prestamo no puede ser nulo"
            );
        }
    }

    public void validarPrestamoQueryCliente(QueryCliente numeroCliente) {
        if (numeroCliente == null) {
            throw new ApplicationException(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.SERVICIO_INTERNAL + "número Cliente no puede ser nulo"
            );
        }
    }

    public void validarConsulta(BigDecimal numeroCliente) {
        if (numeroCliente == null) {
            throw new ApplicationException(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.VALIDACION + " número de Cliente, valor no debe ser nulo."
            );
        }
    }

    public void validarNumeroCLiente(Integer numeroCliente) {
        if (numeroCliente == null) {
            throw new ApplicationException(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.VALIDACION + " número de Cliente, valor no debe ser nulo."
            );
        }
    }
}
