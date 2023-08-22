package com.mibanco.prestamo.es.controller;

import com.mibanco.prestamo.es.constans.Constans;
import com.mibanco.prestamo.es.gen.contract.V1Prestamo;
import com.mibanco.prestamo.es.gen.type.*;
import com.mibanco.prestamo.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamo.es.utils.exceptions.ApplicationException;
import com.mibanco.prestamo.es.utils.exceptions.ApplicationExceptionValidation;
import com.mibanco.prestamo.es.utils.validator.PrestamoValidator;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

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
        LOG.info("Inicia consulta de Prestamo");
        try {
            validator.validarConsulta(numeroCliente);
            List<PrestamoType> listaPrestamo = prestamoService.consultarPrestamo(numeroCliente);

            LOG.info("Finaliza consulta de Prestamo");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Prestamo - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "consultarPrestamo en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "consultarPrestamo, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoCondonado(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Prestamo Condonado");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoCondonadoType> listaPrestamo = prestamoService.consultarPrestamoCondonado(numeroPrestamo);

            LOG.info("Finaliza consulta de Prestamo Condonado");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS_CONDONADOS).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Prestamo Condonado - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "consultarPrestamoCondonado en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "consultarPrestamoCondonado, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoGarantia(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Prestamo Garantia");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoGarantiaType> listaPrestamo = prestamoService.consultarPrestamoGarantiaOutput(numeroPrestamo);

            LOG.info("Finaliza consulta de Prestamo Garantia");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS_GARANTIA).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Prestamo Garantia - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "consultarPrestamoGarantia en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "consultarPrestamoGarantia, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoOtroTitular(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Prestamo Otro Titular");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoOtroTitularType> listaPrestamo = prestamoService.consultarPrestamoOtroTitular(numeroPrestamo);

            LOG.info("Finaliza consulta de Prestamo Otro Titular");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS_OTRO).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Prestamo Otro Titular - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "consultarPrestamoOtroTitular en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "consultarPrestamoOtroTitular, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoPlanDePagos(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Prestamo Plan de pagos");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoPlanDePagosType> listaPrestamo = prestamoService.consultarPrestamoPlanDePagos(numeroPrestamo);

            LOG.info("Finaliza consulta de Prestamo  Plan de pagos");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS_PLAN_DE_PAGOS).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Prestamo Plan de pagos - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagos en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagos, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoPlanDePagosOtroCargo(Integer numeroPrestamo, Integer numeroCuota) {
        LOG.info("Inicia consulta de Prestamo Plan de pagos otro cargo");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoPlanDePagosOtroCargoType> listaPrestamo = prestamoService.consultarPrestamoPlanDePagosOtroCargo(numeroPrestamo, numeroCuota);

            LOG.info("Finaliza consulta de Prestamo  Plan de pagos otro cargo");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS_PLAN_DE_PAGOS_OTRO).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Prestamo Plan de pagos otro cargo - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagosOtroCargo en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagosOtroCargo, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response consultarPrestamoPorPagar(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Prestamo por pagar");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoPorPagarType> listaPrestamo = prestamoService.consultarPrestamoPorPagar(numeroPrestamo);

            LOG.info("Finaliza consulta de Prestamo por pagar");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS_POR_PAGAR).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de Prestamo por pagar - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "consultarPrestamoPorPagar en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "consultarPrestamoPorPagar, exception: " + e.getMessage()).build();
        }
    }

    @Override
    public Response prestamoDetallePagos(Integer numeroPrestamo) {
        LOG.info("Inicia consulta de Detalle Pagos");
        try {
            validator.validarConsulta(numeroPrestamo);
            List<PrestamoDetallePagosType> listaPrestamo = prestamoService.consultarPrestamoDetallePagos(numeroPrestamo);

            LOG.info("Finaliza consulta de  Detalle Pagos");
            return listaPrestamo.size() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constans.SIN_PRESTAMOS_DETALLE).build(); //204 Not Content

        } catch (ApplicationExceptionValidation e) {

            LOG.error("Error en Validaciones de  Detalle Pagos - PrestamoController");
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();

        } catch (ApplicationException e) {

            LOG.error(Constans.SERVICIO_INTERNAL + "prestamoDetallePagos en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constans.SERVICIO_INTERNAL + "prestamoDetallePagos, exception: " + e.getMessage()).build();
        }
    }
}
