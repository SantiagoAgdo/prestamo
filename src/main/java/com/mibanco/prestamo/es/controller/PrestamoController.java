package com.mibanco.prestamo.es.controller;

import com.mibanco.prestamo.es.constants.Constants;
import com.mibanco.prestamo.es.gen.contract.V1Prestamo;
import com.mibanco.prestamo.es.gen.type.*;
import com.mibanco.prestamo.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamo.es.utils.exceptions.ApplicationException;
import com.mibanco.prestamo.es.utils.exceptions.ApplicationExceptionValidation;
import com.mibanco.prestamo.es.utils.validator.PrestamoValidator;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RegisterForReflection(targets = {PrestamoType.class, PrestamoGarantiaType.class, PrestamoPlanDePagosType.class,
        PrestamoCondonadoType.class, PrestamoOtroTitularType.class, PrestamoPlanDePagosOtroCargoType.class,
        PrestamoPorPagarType.class, PrestamoDetallePagosType.class})
public class PrestamoController implements V1Prestamo {

    public static final Logger LOG = LoggerFactory.getLogger(PrestamoController.class);
    @Inject
    PrestamoServiceImpl prestamoService;

    @Inject
    PrestamoValidator validator;

    public PrestamoController(PrestamoServiceImpl p, PrestamoValidator v) {
        this.prestamoService = p;
        this.validator = v;
    }

    @Override
    public Response consultarPrestamo(Integer numeroCliente) {
        LOG.info("Inicia consulta de Préstamo");
        try {
            validator.validarConsulta(numeroCliente);
            List<PrestamoType> listaPrestamo = prestamoService.consultarPrestamo(numeroCliente);

            LOG.info("Finaliza consulta de Préstamo");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Préstamo - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamo en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamo, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoCondonado(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Condonado");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoCondonadoType> listaPrestamo = prestamoService.consultarPrestamoCondonado(numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Condonado");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_CONDONADOS).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Préstamo Condonado - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoCondonado en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoCondonado, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoGarantia(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Garantia");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoGarantiaType> listaPrestamo = prestamoService.consultarPrestamoGarantiaOutput(numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Garantia");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_GARANTIA).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Préstamo Garantia - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoGarantia en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoGarantia, exception: " + e.getMessage()).build();
        }
    }


    @Override
    public Response consultarPrestamoOtroTitular(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Otro Titular");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoOtroTitularType> listaPrestamoOtroTitular = prestamoService.consultarPrestamoOtroTitular(numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Otro Titular");
            return listaPrestamoOtroTitular.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoOtroTitular).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_OTRO).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Préstamo Otro Titular - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoOtroTitular en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoOtroTitular, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoPlanDePagos(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Plan de Pagos");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoPlanDePagosType> listaPrestamoPlanDePagos = prestamoService.consultarPrestamoPlanDePagos(numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Plan de Pagos");
            return listaPrestamoPlanDePagos.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoPlanDePagos).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_PLAN_DE_PAGOS).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Préstamo Plan de Pagos - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagos en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagos, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoPlanDePagosOtroCargo(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Plan de Pagos Otro Cargo");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoPlanDePagosOtroCargoType> listaPrestamoPlanDePagosOtroCargo = prestamoService.consultarPrestamoPlanDePagosOtroCargo(numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Plan de Pagos Otro Cargo");
            return listaPrestamoPlanDePagosOtroCargo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoPlanDePagosOtroCargo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_PLAN_DE_PAGOS_OTRO).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Préstamo Plan de Pagos Otro Cargo - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagosOtroCargo en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagosOtroCargo, exception: " + e.getMessage()).build();
        }
    }


    @Override
    public Response consultarPrestamoPorPagar(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo por Pagar");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoPorPagarType> listaPrestamoPorPagar = prestamoService.consultarPrestamoPorPagar(numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo por Pagar");
            return listaPrestamoPorPagar.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoPorPagar).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_POR_PAGAR).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Préstamo por Pagar - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoPorPagar en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoPorPagar, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response prestamoDetallePagos(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Detalle Pagos");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoDetallePagosType> listaPrestamoDetallePagos = prestamoService.consultarPrestamoDetallePagos(numeroPrestamo);

            LOG.info("Finaliza consulta de Detalle Pagos");
            return listaPrestamoDetallePagos.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoDetallePagos).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_DETALLE).build(); // 204 No Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Detalle Pagos - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "prestamoDetallePagos en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "prestamoDetallePagos, exception: " + e.getMessage()).build();
        }
    }

}
