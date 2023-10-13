package com.mibanco.prestamo.es.controller;


import com.mibanco.prestamo.es.gen.type.*;
import com.mibanco.prestamo.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamo.es.utils.validator.PrestamoValidator;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static io.restassured.RestAssured.given;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@QuarkusTest
public class PrestamoControllerTest {

    @Inject
    ObjectMapper objectMapper;

    @Mock
    private ObjectMapper mockObjectMapper;

    @Mock
    private PrestamoServiceImpl prestamoService;

    @Mock
    private PrestamoValidator prestamoValidator;

    private PrestamoController prestamoController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        prestamoService = mock(PrestamoServiceImpl.class);
        prestamoValidator = mock(PrestamoValidator.class);
        prestamoController = new PrestamoController(prestamoService, prestamoValidator);
    }

    @Test
    void consultarPrestamoTestError() throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/json/es-Prestamo.json"));
        String jsonString = new String(jsonData);

        PrestamoType clienteFIC = objectMapper.readValue(jsonString, PrestamoType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteFIC)
                .when()
                .post("v1/es/Cliente/prestamo/10002")
                .then()
                .statusCode(404);
    }

    @Test
    void consultarPrestamoCondonadoTestError() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoCondonadoType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-PrestamoCondonado.json")), StandardCharsets.UTF_8);
        PrestamoCondonadoType clienteType = objectMapper.readValue(jsonString, PrestamoCondonadoType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("v1/es/Cliente/prestamoCondonado/10002")
                .then()
                .statusCode(404);
    }

    @Test
    void consultarPrestamoDetallePagosTestError() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoDetallePagosType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-PrestamoDetallePagos.json")), StandardCharsets.UTF_8);
        PrestamoDetallePagosType clienteType = objectMapper.readValue(jsonString, PrestamoDetallePagosType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("v1/es/Cliente/PrestamoDetallePagos/10002")
                .then()
                .statusCode(404);
    }

    @Test
    void consultarPrestamoGarantiaTestError() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoGarantiaType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-PrestamoGarantia.json")), StandardCharsets.UTF_8);
        PrestamoGarantiaType clienteType = objectMapper.readValue(jsonString, PrestamoGarantiaType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("v1/es/Cliente/prestamoGarantia/10002")
                .then()
                .statusCode(404);
    }

    @Test
    void consultarPrestamoOtroTitularTestError() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoOtroTitularType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-PrestamoOtroTitular.json")), StandardCharsets.UTF_8);
        PrestamoOtroTitularType clienteType = objectMapper.readValue(jsonString, PrestamoOtroTitularType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("v1/es/Cliente/prestamoOtroTitular/10002")
                .then()
                .statusCode(404);
    }

    @Test
    void consultarPrestamoPlanDePagosTestError() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoPlanDePagosType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-PrestamoPlanDePagos.json")), StandardCharsets.UTF_8);
        PrestamoPlanDePagosType clienteType = objectMapper.readValue(jsonString, PrestamoPlanDePagosType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("v1/es/Cliente/PrestamoPlanDePagos/10002")
                .then()
                .statusCode(404);
    }

    @Test
    void consultarPrestamoPlanDePagosOtroCargoTestError() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoPlanDePagosOtroCargoType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-PrestamoPlanDePagosOtroCargo.json")), StandardCharsets.UTF_8);
        PrestamoPlanDePagosOtroCargoType clienteType = objectMapper.readValue(jsonString, PrestamoPlanDePagosOtroCargoType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("v1/es/Cliente/PrestamoPlanDePagosOtroCargo/10002/1")
                .then()
                .statusCode(404);
    }

    @Test
    void consultarPrestamoPorPagarTestError() throws IOException {

        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoPorPagarType());

        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-PrestamoPorPagar.json")), StandardCharsets.UTF_8);
        PrestamoPorPagarType clienteType = objectMapper.readValue(jsonString, PrestamoPorPagarType.class);

        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("v1/es/Cliente/prestamoPorPagar/10002")
                .then()
                .statusCode(404);
    }

}
