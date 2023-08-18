//package com.mibanco.prestamo.es.grpc;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.mibanco.prestamo.es.Prestamo;
//import com.mibanco.prestamo.es.PrestamoServiceGrpc;
//import com.mibanco.prestamo.es.QueryCliente;
//import com.mibanco.prestamo.es.gen.type.PrestamoType;
//import com.mibanco.prestamo.es.utils.mappers.PrestamoGrpcMapper;
//import io.grpc.stub.StreamObserver;
//import io.quarkus.grpc.GrpcClient;
//import io.quarkus.test.junit.QuarkusTest;
//import jakarta.inject.Inject;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeoutException;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@QuarkusTest
//public class PrestamoControllerGrpcTest {
//
//    @GrpcClient
//    PrestamoServiceGrpc client;
//
//    @Inject
//    ObjectMapper objectMapper;
//
//    @Mock
//    private ObjectMapper mockObjectMapper;
//
//    @Inject
//    PrestamoGrpcMapper mapper;
//
//    PrestamoServiceGrpc getClient() {
//        return client;
//    }
//
//    @BeforeEach
//    public void setup() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    public void consultaAlertaGRPCTest() {
//
//        List<Prestamo> resp = new ArrayList<>();
//        resp.add(com.mibanco.prestamo.es.Prestamo.newBuilder()
//                .setCondicionPrestamo("")
//                .setDiasMoraActual(0)
//                .setDiasMoraMaxima(0)
//                .setDiasMoraPromedio(0)
//                .setEstadoActualPrestamo("")
//                .setFechaDesembolso("2023-08-18T14:33:35.294+00:00")
//                .setFechaUltimoPago("2023-08-18T14:33:35.294+00:00")
//                .setMontoDesembolsado(0f)
//                .setNumeroCliente(10002)
//                .setNumeroPrestamo("10002")
//                .setPlazo(12)
//                .setPrestamoCondonado("")
//                .setPrestamoDetallePagos("")
//                .setPrestamoGarantia("")
//                .setPrestamoOtroTitular("")
//                .setPrestamoPlanDePagos("")
//                .setPrestamoPorPagar("")
//                .setSaldoActual(1000000f)
//                .setSubProducto("a")
//                        .build()
//                );
//        ResponseAlerta expectedResponse = ResponseAlerta.newBuilder().addAllObj(alertaResponse).build();
//
//        ClienteFICControllerGrpc clienteGrpcController = Mockito.mock(ClienteFICControllerGrpc.class);
//        StreamObserver<ResponseAlerta> responseObserverMock = Mockito.mock(StreamObserver.class);
//
//        Mockito.doAnswer(invocation -> {
//
//            StreamObserver<ResponseAlerta> actualResponseObserver = invocation.getArgument(1);
//            actualResponseObserver.onNext(expectedResponse);
//            actualResponseObserver.onCompleted();
//
//            return null;
//        }).when(clienteGrpcController).consultarAlerta(request, responseObserverMock);
//
//        clienteGrpcController.consultarAlerta(request, responseObserverMock);
//
//        Mockito.verify(responseObserverMock).onNext(expectedResponse);
//        Mockito.verify(responseObserverMock).onCompleted();
//    }
//
//
//
////    public Prestamo getClienteCdtDigitalGrpc() throws IOException {
////        // Configurar el mock del ObjectMapper
////        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new PrestamoType());
////
////        // Preparación de datos
////        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/json/es-Prestamo.json")), StandardCharsets.UTF_8);
////        PrestamoType clienteType = objectMapper.readValue(jsonString, PrestamoType.class);
////
////        //Se retorna la data dataType a protobuf
////        return mapper.clienteCdtToGrpc(clienteType);
////    }
////
////    @Test
////    public void testObtenerClienteCDT() throws IOException, ExecutionException, InterruptedException, TimeoutException {
////
////        Prestamo clienteCdtDigitalGrpc = this.getClienteCdtDigitalGrpc();
////
////        //Variable para guargar la respuesta de gRPC
////        CompletableFuture<List<Prestamo>> message = new CompletableFuture<>();
////        QueryCliente x = QueryCliente.newBuilder().setNumeroCliente("10002").build();
////        //Llamado del servicio
////        client.consultarPrestamo(x)
////                .subscribe()
////                .with(reply -> message.complete(reply.getObjList()));
////
////        //Test del servicio
////        Assertions.assertThat(message.get(5, TimeUnit.SECONDS)).asList();
////
////    }
//
//}
