package com.mibanco.prestamo.es.graphql;

import com.mibanco.prestamo.es.gen.type.*;
import com.mibanco.prestamo.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamo.es.utils.exceptions.ApplicationException;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@GraphQLApi
public class PrestamoGraphQLController {

    public static final Logger logger = LoggerFactory.getLogger(PrestamoGraphQLController.class);

    @Inject
    PrestamoServiceImpl service;

    @Query("consultarPrestamo")
    @Description("Consulta de Prestamos")
    public List<PrestamoType> consultarPrestamo(@Name("numeroCliente") Integer numeroCliente) {

        logger.info("Inicia consultarPrestamo en Graphql");
        try {
            List<PrestamoType> prestamo = service.consultarPrestamo(numeroCliente);
            logger.info("Termina consultarPrestamo en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamo Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoCondonado")
    @Description("Consulta de Prestamos condonados")
    public List<PrestamoCondonadoType> consultarPrestamoCondonado(@Name("numeroPrestamo") Integer numeroPrestamo) {

        logger.info("Inicia consultarPrestamoCondonado en Graphql");
        try {
            List<PrestamoCondonadoType> prestamo = service.consultarPrestamoCondonado(numeroPrestamo);
            logger.info("Termina consultarPrestamoCondonado en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamoCondonado Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoDetallePagos")
    @Description("Consulta de Prestamos con detalle de pagos")
    public List<PrestamoDetallePagosType> consultarPrestamoDetallePagos(@Name("numeroPrestamo") Integer numeroPrestamo) {

        logger.info("Inicia consultarPrestamoDetallePagos en Graphql");
        try {
            List<PrestamoDetallePagosType> prestamo = service.consultarPrestamoDetallePagos(numeroPrestamo);
            logger.info("Termina consultarPrestamoDetallePagos en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamoDetallePagos Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoGarantiaOutput")
    @Description("Consulta de Prestamos Garantia")
    public List<PrestamoGarantiaType> consultarPrestamoGarantiaOutput(@Name("numeroPrestamo") Integer numeroPrestamo) {

        logger.info("Inicia consultarPrestamoGarantiaOutput en Graphql");

        try {
            List<PrestamoGarantiaType> prestamo = service.consultarPrestamoGarantiaOutput(numeroPrestamo);
            logger.info("Termina consultarPrestamoGarantiaOutput en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamoGarantiaOutput Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoOtroTitular")
    @Description("Consulta de Prestamos de otro titular")
    public List<PrestamoOtroTitularType> consultarPrestamoOtroTitular(@Name("numeroPrestamo") Integer numeroPrestamo) {

        logger.info("Inicia consultarPrestamoOtroTitular en Graphql");
        try {
            List<PrestamoOtroTitularType> prestamo = service.consultarPrestamoOtroTitular(numeroPrestamo);
            logger.info("Termina consultarPrestamoOtroTitular en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamoOtroTitular Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPlanDePagos")
    @Description("Consulta de Prestamos con plan de pagos")
    public List<PrestamoPlanDePagosType> consultarPrestamoPlanDePagos(@Name("numeroPrestamo") Integer numeroPrestamo) {

        logger.info("Inicia consultarPrestamoPlanDePagos en Graphql");

        try {
            List<PrestamoPlanDePagosType> prestamo = service.consultarPrestamoPlanDePagos(numeroPrestamo);
            logger.info("Termina consultarPrestamoPlanDePagos en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamoPlanDePagos Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPlanDePagosOtroCargo")
    @Description("Consulta de Plan de pagos prestamos otro cargo ")
    public List<PrestamoPlanDePagosOtroCargoType> consultarPrestamoPlanDePagosOtroCargo(@Name("numeroPrestamo") Integer numeroPrestamo, @Name("numeroCuota") Integer numeroCuota) {

        logger.info("Inicia consultarPrestamoPlanDePagosOtroCargo en Graphql");

        try {
            List<PrestamoPlanDePagosOtroCargoType> prestamo = service.consultarPrestamoPlanDePagosOtroCargo(numeroPrestamo, numeroCuota);
            logger.info("Termina consultarPrestamoPlanDePagosOtroCargo en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamoPlanDePagosOtroCargo Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPorPagar")
    @Description("Consulta de Prestamos por pagar")
    public List<PrestamoPorPagarType> consultarPrestamoPorPagar(@Name("numeroPrestamo") Integer numeroPrestamo) {

        logger.info("Inicia consultarPrestamoPorPagar en Graphql");

        try {
            List<PrestamoPorPagarType> prestamo = service.consultarPrestamoPorPagar(numeroPrestamo);
            logger.info("Termina consultarPrestamoPorPagar en Graphql");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrio un error en consultarPrestamoPorPagar Graphql");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }


}
