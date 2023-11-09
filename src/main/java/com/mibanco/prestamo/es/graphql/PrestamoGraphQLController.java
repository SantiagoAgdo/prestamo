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
        logger.info("Inicia consultarPrestamo en GraphQL");
        try {
            List<PrestamoType> prestamo = service.consultarPrestamo(numeroCliente);
            logger.info("Termina consultarPrestamo en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamo GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoCondonado")
    @Description("Consulta de Prestamos condonados")
    public List<PrestamoCondonadoType> consultarPrestamoCondonado(@Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoCondonado en GraphQL");
        try {
            List<PrestamoCondonadoType> prestamo = service.consultarPrestamoCondonado(numeroPrestamo);
            logger.info("Termina consultarPrestamoCondonado en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoCondonado GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoDetallePagos")
    @Description("Consulta de Prestamos con detalle de pagos")
    public List<PrestamoDetallePagosType> consultarPrestamoDetallePagos(@Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoDetallePagos en GraphQL");
        try {
            List<PrestamoDetallePagosType> prestamo = service.consultarPrestamoDetallePagos(numeroPrestamo);
            logger.info("Termina consultarPrestamoDetallePagos en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoDetallePagos GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoGarantiaOutput")
    @Description("Consulta de Prestamos Garantia")
    public List<PrestamoGarantiaType> consultarPrestamoGarantiaOutput(@Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoGarantiaOutput en GraphQL");
        try {
            List<PrestamoGarantiaType> prestamo = service.consultarPrestamoGarantiaOutput(numeroPrestamo);
            logger.info("Termina consultarPrestamoGarantiaOutput en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoGarantiaOutput GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoOtroTitular")
    @Description("Consulta de Préstamos de otro titular")
    public List<PrestamoOtroTitularType> consultarPrestamoOtroTitular(@Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoOtroTitular en GraphQL");
        try {
            List<PrestamoOtroTitularType> prestamo = service.consultarPrestamoOtroTitular(numeroPrestamo);
            logger.info("Termina consultarPrestamoOtroTitular en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoOtroTitular GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPlanDePagos")
    @Description("Consulta de Préstamos con plan de pagos")
    public List<PrestamoPlanDePagosType> consultarPrestamoPlanDePagos(@Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoPlanDePagos en GraphQL");
        try {
            List<PrestamoPlanDePagosType> prestamo = service.consultarPrestamoPlanDePagos(numeroPrestamo);
            logger.info("Termina consultarPrestamoPlanDePagos en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoPlanDePagos GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPlanDePagosOtroCargo")
    @Description("Consulta de Plan de pagos préstamos otro cargo")
    public List<PrestamoPlanDePagosOtroCargoType> consultarPrestamoPlanDePagosOtroCargo(@Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoPlanDePagosOtroCargo en GraphQL");
        try {
            List<PrestamoPlanDePagosOtroCargoType> prestamo = service.consultarPrestamoPlanDePagosOtroCargo(numeroPrestamo);
            logger.info("Termina consultarPrestamoPlanDePagosOtroCargo en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoPlanDePagosOtroCargo GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }

    @Query("consultarPrestamoPorPagar")
    @Description("Consulta de Préstamos por pagar")
    public List<PrestamoPorPagarType> consultarPrestamoPorPagar(@Name("numeroPrestamo") Integer numeroPrestamo) {
        logger.info("Inicia consultarPrestamoPorPagar en GraphQL");
        try {
            List<PrestamoPorPagarType> prestamo = service.consultarPrestamoPorPagar(numeroPrestamo);
            logger.info("Termina consultarPrestamoPorPagar en GraphQL");
            return prestamo;
        } catch (ApplicationException e) {
            logger.error("Ocurrió un error en consultarPrestamoPorPagar GraphQL");
            throw new ApplicationException(Response.Status.NOT_FOUND.getStatusCode(), "ERROR_SERVICIO: " + e.getMessage() + " en PrestamoGraphQLController");
        }
    }


}
