package com.mibanco.prestamo.es.utils.validator;

import com.mibanco.prestamo.es.QueryPrestamo;
import com.mibanco.prestamo.es.constants.Constants;
import com.mibanco.prestamo.es.gen.type.PrestamoType;
import com.mibanco.prestamo.es.QueryCliente;
import com.mibanco.prestamo.es.utils.exceptions.ApplicationExceptionValidation;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

@ApplicationScoped
public class PrestamoValidator {

    public void validarPrestamoQuery(QueryPrestamo numeroPrestamo) {
        if (numeroPrestamo == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.SERVICIO_INTERNAL + "número Cliente no puede ser nulo"
            );
        }
    }

    public void validarPrestamoQueryCliente(QueryCliente numeroCliente) {
        if (numeroCliente == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.SERVICIO_INTERNAL + "número Cliente no puede ser nulo"
            );
        }
    }

    public void validarConsulta(Integer numeroCliente) {
        if (numeroCliente == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constants.VALIDACION + " número de Cliente, valor no debe ser nulo."
            );
        }
    }
}
