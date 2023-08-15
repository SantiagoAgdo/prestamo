package com.mibanco.prestamo.es.utils.validator;

import com.mibanco.prestamo.es.QueryPrestamo;
import com.mibanco.prestamo.es.constans.Constans;
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

    public static final Logger logger = LoggerFactory.getLogger(PrestamoValidator.class);

    private String msmError = "";

    public void verificarPrestamo(PrestamoType prestamoType) throws ApplicationExceptionValidation {

        if (validarObjeto(prestamoType)) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constans.SERVICIO_INTERNAL + msmError + " obligatorios"
            );
        }
    }

    public boolean validarObjeto(Object obj) {
        boolean isValidateSuccess = true;
        try {
            BeanInfo bean = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] descripcionDePropiedades = bean.getPropertyDescriptors();

            for (PropertyDescriptor atr : descripcionDePropiedades) {
                Object valor = atr.getReadMethod().invoke(obj);
                if (valor == null) {
                    isValidateSuccess = false;
                }
            }
        } catch (IntrospectionException | ReflectiveOperationException e) {
            logger.error(e.getMessage());
        }

        if (!isValidateSuccess) {
            msmError = "Se encontro datos nulos o vacios, verifique los datos";
        }

        return !isValidateSuccess;
    }

    public void validarPrestamoQuery(QueryPrestamo numeroPrestamo) {
        if (numeroPrestamo == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constans.SERVICIO_INTERNAL + "numeroCliente no puede ser nulo"
            );
        }
    }

    public void validarPrestamoQueryCiente(QueryCliente numeroCliente) {
        if (numeroCliente == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constans.SERVICIO_INTERNAL + "numeroCliente no puede ser nulo"
            );
        }
    }

    public void validarConsulta(Integer numeroCliente) {
        if (numeroCliente == null) {
            throw new ApplicationExceptionValidation(
                    Response.Status.BAD_REQUEST.getStatusCode(), Constans.VALIDACION + " numero de Cliente, valor no debe ser nulo."
            );
        }
    }
}
