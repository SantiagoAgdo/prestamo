package com.mibanco.prestamofic.es.gen.contract;

import java.math.BigDecimal;
import com.mibanco.prestamofic.es.gen.type.Error;
import com.mibanco.prestamofic.es.gen.type.PrestamoCondonadoType;
import com.mibanco.prestamofic.es.gen.type.PrestamoDetallePagosType;
import com.mibanco.prestamofic.es.gen.type.PrestamoGarantiaType;
import com.mibanco.prestamofic.es.gen.type.PrestamoOtroTitularType;
import com.mibanco.prestamofic.es.gen.type.PrestamoPlanDePagosOtroCargoType;
import com.mibanco.prestamofic.es.gen.type.PrestamoPlanDePagosType;
import com.mibanco.prestamofic.es.gen.type.PrestamoPorPagarType;
import com.mibanco.prestamofic.es.gen.type.PrestamoType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/es/prestamo-fic")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-02-29T15:14:27.555253800-05:00[America/Bogota]")
public interface V1Prestamo {

    @GET
    @Path("/{numeroCliente}")
    @Produces({ "application/json" })
    Response consultarPrestamo(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("3000")   Integer pageSize,@PathParam("numeroCliente") Integer numeroCliente);

    @GET
    @Path("/condonado/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoCondonado(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("1000")   Integer pageSize,@PathParam("numeroPrestamo") BigDecimal numeroPrestamo);

    @GET
    @Path("/detalle-pagos/cliente/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoDetallePagos(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("1000")   Integer pageSize,@PathParam("numeroPrestamo") BigDecimal numeroPrestamo);

    @GET
    @Path("/garantia/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoGarantia(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("1000")   Integer pageSize,@PathParam("numeroPrestamo") BigDecimal numeroPrestamo);

    @GET
    @Path("/otro-titular/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoOtroTitular(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("1000")   Integer pageSize,@PathParam("numeroPrestamo") BigDecimal numeroPrestamo);

    @GET
    @Path("/plan-pagos/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoPlanDePagos(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("1000")   Integer pageSize,@PathParam("numeroPrestamo") BigDecimal numeroPrestamo);

    @GET
    @Path("/plan-pagos/otro-cargo/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoPlanDePagosOtroCargo(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("1000")   Integer pageSize,@PathParam("numeroPrestamo") BigDecimal numeroPrestamo);

    @GET
    @Path("/pendiente/pago/{numeroPrestamo}")
    @Produces({ "application/json" })
    Response consultarPrestamoPorPagar(@HeaderParam("jwt") @NotNull   String jwt,@QueryParam("page") @NotNull @Min(1) @Max(10000) @DefaultValue("1")   Integer page,@QueryParam("pageSize") @NotNull @Min(1) @Max(10000) @DefaultValue("1000")   Integer pageSize,@PathParam("numeroPrestamo") BigDecimal numeroPrestamo);
}
