package com.mibanco.prestamo.es.graphql;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PrestamoGraphqltest {

    @Test
    public void consultaPrestamoTest() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamo { consultarPrestamo(numeroCliente: 10002) { /* campos de la respuesta */ } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);
    }

    @Test
    public void testConsultarPrestamoPlanDePagosOtroCargo() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamoPlanDePagosOtroCargo { consultarPrestamoPlanDePagosOtroCargo(numeroPrestamo: 10002) { descripcionCargo numeroCuota numeroPrestamo valor } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);

    }

    @Test
    public void testConsultarPrestamoPlanDePagos() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamoPlanDePagos { consultarPrestamoPlanDePagos(numeroPrestamo: 10002) { abonoACapital diasVencidos estado fechaAPagar fechaPago intereses montoPagado numeroCuota numeroPrestamo otrosCargos prestamoPlanDePagosOtroCargo saldo totalCuota } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);
    }

    @Test
    public void testConsultarPrestamoCondonado() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamoCondonado { consultarPrestamoCondonado(numeroPrestamo: 10002) { abonoACapital comisionComisionIVA diasVencidos estado fechaAPagar fechaPago GACGACIVA gastoExtraDiferidoGastoExtraDiferidoIVA gastoExtraJudicialGastoExtraJudicialIVA interesesCteBalance InteresesCteContingente interesesMoraBalance interesesMoraContingente leyMipymeLeyMipymeIVA numeroCuota numeroPrestamo otrosGastos otrosGastosIVA seguroAdicional seguroVida totalCuota } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);
    }

    @Test
    public void testConsultarPrestamoOtroTitular() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamoOtroTitular { consultarPrestamoOtroTitular(numeroPrestamo: 10002) { numeroDocumento numeroPrestamo primerApellido primerNombre segundoApellido segundoNombre tipoDocumento tipoTitular } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);
    }

    @Test
    public void testConsultarPrestamoPorPagar() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamoPorPagar { consultarPrestamoPorPagar(numeroPrestamo: 10002) { abonoACapital comisionComisionIVA diasVencidos estado fechaAPagar fechaPago GACGACIVA gastoExtraDiferidoGastoExtraDiferidoIVA gastoExtraJudicialGastoExtraJudicialIVA interesesCteBalance interesesCteContingente interesesMoraBalance interesesMoraContingente leyMipymeLeyMipymeIVA numeroCuota numeroPrestamo seguroAdicional seguroVida totalCuota } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);
    }

    @Test
    public void testConsultarPrestamoDetallePagos() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamoDetallePagos { consultarPrestamoDetallePagos(numeroPrestamo: 10002) { abonoACapital cargoCobranza cobranzaIVA fechaPago interesesCorrientes interesesMora leyMipyme leyMipymeIVA numeroPrestamo otros seguroVida valorPagado } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);
    }

    @Test
    public void testConsultarPrestamoGarantia() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\"query\": \"query ConsultarPrestamoGarantiaOutput { consultarPrestamoGarantiaOutput(numeroPrestamo: 10002) { avaluo numeroPrestamo referencia SubtipoGarantia tipoGarantia } }\"}")
                .post("/graphql")
                .then()
                .statusCode(200);
    }
}
