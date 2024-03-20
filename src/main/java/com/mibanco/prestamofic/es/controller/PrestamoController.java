package com.mibanco.prestamofic.es.controller;

import com.mibanco.prestamofic.es.constants.Constants;
import com.mibanco.prestamofic.es.dao.entity.*;
import com.mibanco.prestamofic.es.gen.contract.V1Prestamo;
import com.mibanco.prestamofic.es.gen.type.*;
import com.mibanco.prestamofic.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamofic.es.utils.exceptions.ApplicationException;
import com.mibanco.prestamofic.es.utils.validator.PrestamoValidator;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
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
    public Response consultarPrestamo(String jwt, Integer pagina, Integer tamanoPagina, Integer numeroCliente) {
        LOG.info("Inicia consulta de Préstamo");
        try {
            validator.validarNumeroCLiente(numeroCliente);
            ConsultarPrestamoOutput listaPrestamo = prestamoService.consultarPrestamo(pagina, tamanoPagina, numeroCliente);

            LOG.info("Finaliza consulta de Préstamo");
            return listaPrestamo.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Préstamo - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();

        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamo en PrestamoServiceImpl excepción: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamo, excepción: ").build();
        }
    }

    @Override
    public Response consultarPrestamoCondonado(String jwt, Integer pagna, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Condonado");
        try {
            validator.validarConsulta(numeroPrestamo);
            CondonadoOutput listaPrestamo = prestamoService.consultarPrestamoCondonado(pagna, tamanoPagina, numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Condonado");
            return listaPrestamo.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_CONDONADOS).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Préstamo Condonado - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();

        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoCondonado en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoCondonado, exception: ").build();
        }
    }

    @Override
    public Response consultarPrestamoGarantia(String jwt, Integer pagna, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Garantia");
        try {
            validator.validarConsulta(numeroPrestamo);
            GarantiaOutput listaPrestamo = prestamoService.consultarPrestamoGarantiaOutput(pagna, tamanoPagina, numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Garantia");
            return listaPrestamo.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_GARANTIA).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Préstamo Garantia - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();

        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoGarantia en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoGarantia, exception: ").build();
        }
    }


    @Override
    public Response consultarPrestamoOtroTitular(String jwt, Integer pagna, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Otro Titular");
        try {
            validator.validarConsulta(numeroPrestamo);
            OtroTitularOutput listaPrestamoOtroTitular = prestamoService.consultarPrestamoOtroTitular(pagna, tamanoPagina, numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Otro Titular");
            return listaPrestamoOtroTitular.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoOtroTitular).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_OTRO).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Préstamo Otro Titular - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();

        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoOtroTitular en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoOtroTitular, exception: ").build();
        }
    }

    @Override
    public Response consultarPrestamoPlanDePagos(String jwt, Integer pagna, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Plan de Pagos");
        try {
            validator.validarConsulta(numeroPrestamo);
            PlanDePagosOutput listaPrestamoPlanDePagos = prestamoService.consultarPrestamoPlanDePagos(pagna, tamanoPagina, numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Plan de Pagos");
            return listaPrestamoPlanDePagos.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoPlanDePagos).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_PLAN_DE_PAGOS).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Préstamo Plan de Pagos - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();

        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagos en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagos, exception: ").build();
        }
    }

    @Override
    public Response consultarPrestamoPlanDePagosOtroCargo(String jwt, Integer pagna, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo Plan de Pagos Otro Cargo");
        try {
            validator.validarConsulta(numeroPrestamo);
            PlanDePagosOtroCargoOutput listaPrestamoPlanDePagosOtroCargo = prestamoService.consultarPrestamoPlanDePagosOtroCargo(pagna, tamanoPagina, numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo Plan de Pagos Otro Cargo");
            return listaPrestamoPlanDePagosOtroCargo.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoPlanDePagosOtroCargo).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_PLAN_DE_PAGOS_OTRO).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Préstamo Plan de Pagos Otro Cargo - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();

        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagosOtroCargo en PrestamoServiceImpl exception: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoPlanDePagosOtroCargo, exception: ").build();
        }
    }


    @Override
    public Response consultarPrestamoPorPagar(String jwt, Integer pagna, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        LOG.info("Inicia consulta de Préstamo por Pagar");
        try {
            validator.validarConsulta(numeroPrestamo);
            PrestamoPorPagarOutput listaPrestamoPorPagar = prestamoService.consultarPrestamoPorPagar(pagna, tamanoPagina, numeroPrestamo);

            LOG.info("Finaliza consulta de Préstamo por Pagar");
            return listaPrestamoPorPagar.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoPorPagar).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_POR_PAGAR).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Préstamo por Pagar - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();

        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "consultarPrestamoPorPagar en PrestamoServiceImpl excepción: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "consultarPrestamoPorPagar, excepción: ").build();
        }
    }

    @Override
    public Response consultarPrestamoDetallePagos(String jwt, Integer pagna, Integer tamanoPagina, BigDecimal numeroPrestamo) {
        LOG.info("Inicia consulta de Detalle Pagos");
        try {
            validator.validarConsulta(numeroPrestamo);
            DetallePagosOutput listaPrestamoDetallePagos = prestamoService.consultarPrestamoDetallePagos(pagna, tamanoPagina, numeroPrestamo);

            LOG.info("Finaliza consulta de Detalle Pagos");
            return listaPrestamoDetallePagos.getTotalRegistros() != 0 ? Response.status(Response.Status.OK).entity(listaPrestamoDetallePagos).build() :
                    Response.status(Response.Status.OK).entity(Constants.SIN_PRESTAMOS_DETALLE).build(); // 204 No Content

        } catch (ApplicationException e) {

            LOG.error("Error en Validaciones de Detalle Pagos - PrestamoController%s".formatted(e.getMessage()));
            return Response.status(Response.Status.BAD_REQUEST).entity("Error en la solicitud").build();
        } catch (Exception e) {

            LOG.error(Constants.SERVICIO_INTERNAL + "prestamoDetallePagos en PrestamoServiceImpl excepción: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Constants.SERVICIO_INTERNAL + "prestamoDetallePagos, excepción: ").build();
        }
    }

}
