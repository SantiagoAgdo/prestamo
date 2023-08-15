package com.mibanco.prestamo.es.gen.contract;

import com.mibanco.prestamo.es.gen.type.Error;
import com.mibanco.prestamo.es.gen.type.PrestamoCondonadoType;
import com.mibanco.prestamo.es.gen.type.PrestamoDetallePagosType;
import com.mibanco.prestamo.es.gen.type.PrestamoGarantiaType;
import com.mibanco.prestamo.es.gen.type.PrestamoOtroTitularType;
import com.mibanco.prestamo.es.gen.type.PrestamoPlanDePagosOtroCargoType;
import com.mibanco.prestamo.es.gen.type.PrestamoPlanDePagosType;
import com.mibanco.prestamo.es.gen.type.PrestamoPorPagarType;
import com.mibanco.prestamo.es.gen.type.PrestamoType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/es/Cliente")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-15T17:12:32.457853-05:00[America/Bogota]")
public interface V1Prestamo {

    @GET
    @Path("/prestamo/{numeroCliente}")
    @Produces({ "application/json" })
    Response consultarPrestamo(@PathParam("numeroCliente") Integer numeroCliente);

    @GET
    @Path("/prestamoCondonado/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoCondonado(@PathParam("numeroPrestamo") Integer numeroPrestamo);

    @GET
    @Path("/prestamoGarantia/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoGarantia(@PathParam("numeroPrestamo") Integer numeroPrestamo);

    @GET
    @Path("/prestamoOtroTitular/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoOtroTitular(@PathParam("numeroPrestamo") Integer numeroPrestamo);

    @GET
    @Path("/PrestamoPlanDePagos/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoPlanDePagos(@PathParam("numeroPrestamo") Integer numeroPrestamo);

    @GET
    @Path("/PrestamoPlanDePagosOtroCargo/{numeroPrestamo}/{numeroCuota}")
    @Produces({ "application/json" })
    Response consultarPrestamoPlanDePagosOtroCargo(@PathParam("numeroPrestamo") Integer numeroPrestamo,@PathParam("numeroCuota") Integer numeroCuota);

    @GET
    @Path("/prestamoPorPagar/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoPorPagar(@PathParam("numeroPrestamo") Integer numeroPrestamo);

    @GET
    @Path("/PrestamoDetallePagos/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response prestamoDetallePagos(@PathParam("numeroPrestamo") Integer numeroPrestamo);
}
