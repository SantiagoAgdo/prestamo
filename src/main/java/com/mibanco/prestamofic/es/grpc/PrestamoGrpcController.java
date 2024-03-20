package com.mibanco.prestamofic.es.grpc;

import com.mibanco.prestamofic.es.*;
import com.mibanco.prestamofic.es.dao.entity.*;
import com.mibanco.prestamofic.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamofic.es.utils.exceptions.ApplicationException;
import com.mibanco.prestamofic.es.utils.mappers.PrestamoGrpcMapper;
import com.mibanco.prestamofic.es.utils.validator.PrestamoValidator;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusException;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@GrpcService
public class PrestamoGrpcController extends PrestamoServiceGrpcGrpc.PrestamoServiceGrpcImplBase {

    public static final Logger LOG = LoggerFactory.getLogger(PrestamoGrpcController.class);

    @Inject
    PrestamoServiceImpl prestamoService;

    @Inject
    PrestamoGrpcMapper mapper;

    @Inject
    PrestamoValidator validator;


    @Override
    @Blocking
    public void consultarPrestamo(QueryCliente request, io.grpc.stub.StreamObserver<ResponsePrestamo> responseObserver) {
        LOG.info("Inicia consultarPrestamo por GRPC");
        try {
            validator.validarPrestamoQueryCliente(request);
            ConsultarPrestamoOutput prestamoListType = prestamoService.consultarPrestamo(1, 10000, Integer.parseInt(request.getNumeroCliente()));

            List<Prestamo> prestamoResponse = new ArrayList<>();
            for (PrestamoEntity prestamoType : prestamoListType.getPrestamo()) {
                prestamoResponse.add(Prestamo.newBuilder()
                        .setCondicionPrestamo(prestamoType.getCondicionPrestamo())
                        .setDiasMoraActual(prestamoType.getDiasMoraActual())
                        .setDiasMoraMaxima(prestamoType.getDiasMoraMaxima())
                        .setDiasMoraPromedio(prestamoType.getDiasMoraPromedio())
                        .setEstadoActualPrestamo(prestamoType.getEstadoActualPrestamo())
                        .setFechaDesembolso(prestamoType.getFechaDesembolso().toString())
                        .setFechaUltimoPago(prestamoType.getFechaUltimoPago().toString())
                        .setMontoDesembolsado(prestamoType.getMontoDesembolsado())
                        .setNumeroCliente(prestamoType.getNumeroCliente())
                        .setNumeroPrestamo(prestamoType.getNumeroPrestamo())
                        .setPlazo(prestamoType.getPlazo())
                        .setPrestamoCondonado(prestamoType.getPrestamoCondonado())
                        .setPrestamoDetallePagos(prestamoType.getPrestamoDetallePagos())
                        .setPrestamoGarantia(prestamoType.getPrestamoGarantia())
                        .setPrestamoOtroTitular(prestamoType.getPrestamoOtroTitular())
                        .setPrestamoPlanDePagos(prestamoType.getPrestamoPlanDePagos())
                        .setPrestamoPorPagar(prestamoType.getPrestamoPorPagar())
                        .setSubProducto(prestamoType.getSubProducto().toString())
                        .build());
            }

            ResponsePrestamo response = ResponsePrestamo.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamo por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);
        } catch (Exception e) {
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarPrestamoPorPagar(QueryPrestamo request, io.grpc.stub.StreamObserver<ResponsePrestamoPorPagar> responseObserver) {
        LOG.info("Inicia consultarPrestamoPorPagar por GRPC");
        try {
            validator.validarPrestamoQuery(request);
            PrestamoPorPagarOutput prestamoListType = prestamoService.consultarPrestamoPorPagar(1,1000, new BigDecimal(request.getNumeroPrestamo()));

            List<PrestamoPorPagar> prestamoResponse = new ArrayList<>();
            for (PrestamoPorPagarEntity prestamoPorPagarType : prestamoListType.getPrestamoPorPagar()) {
                prestamoResponse.add(com.mibanco.prestamofic.es.PrestamoPorPagar.newBuilder()
                        .setNumeroCuota(prestamoPorPagarType.getNumeroCuota())
                        .setFechaAPagar(prestamoPorPagarType.getFechaAPagar().toString())
                        .setAbonoACapital(Float.parseFloat(prestamoPorPagarType.getAbonoACapital()))
                        .setComisionComisionIVA(6f)
                        .setTotalCuota((float) prestamoPorPagarType.getTotalCuota())
                        .setEstado(prestamoPorPagarType.getEstado())
                        .setFechaPago(prestamoPorPagarType.getFechaPago().toString())
                        .setDiasVencidos(prestamoPorPagarType.getDiasVencidos())
                        .build());
            }

            ResponsePrestamoPorPagar response = ResponsePrestamoPorPagar.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoPorPagar por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarPrestamoPlanDePagosOtroCargo(QueryPrestamoCuota request, io.grpc.stub.StreamObserver<ResponsePrestamoPlanDePagosOtroCargo> responseObserver) {
        LOG.info("Inicia consultarPrestamoPlanDePagosOtroCargo por GRPC");
        try {
            PlanDePagosOtroCargoOutput prestamoListType = prestamoService.consultarPrestamoPlanDePagosOtroCargo(1,1000, new BigDecimal(request.getNumeroPrestamo()));

            List<PrestamoPlanDePagosOtroCargo> prestamoResponse = new ArrayList<>();
            for (PrestamoPlanDePagosOtroCargoEntity alert : prestamoListType.getPrestamoPlanDePagosOtroCargo()) {
                prestamoResponse.add(com.mibanco.prestamofic.es.PrestamoPlanDePagosOtroCargo.newBuilder()
                        .setDescripcionCargo(alert.getDescripcionCargo())
                        .setValor(alert.getValor())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoPlanDePagosOtroCargo response = ResponsePrestamoPlanDePagosOtroCargo.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoPlanDePagosOtroCargo por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarPrestamoPlanDePagos(QueryPrestamo request, io.grpc.stub.StreamObserver<ResponsePrestamoPlandeDePagos> responseObserver) {
        LOG.info("Inicia consultarPrestamoPlanDePagos por GRPC");
        try {
            validator.validarPrestamoQuery(request);
            PlanDePagosOutput prestamoListType = prestamoService.consultarPrestamoPlanDePagos(1,1000, new BigDecimal(request.getNumeroPrestamo()));

            List<PrestamoPlanDePagos> prestamoResponse = new ArrayList<>();
            for (PrestamoPlanDePagosEntity alert : prestamoListType.getPrestamoPlanDePagos()) {
                prestamoResponse.add(com.mibanco.prestamofic.es.PrestamoPlanDePagos.newBuilder()
                        .setFechaAPagar(alert.getFechaAPagar().toString())
                        .setEstado(alert.getEstado())
                        .setDiasVencidos(alert.getDiasVencidos())
                        .setFechaPago(alert.getFechaPago().toString())
                        .setMontoPagado((float) alert.getMontoPagado())
                        .setPrestamoPlanDePagosOtroCargo(alert.getPrestamoPlanDePagosOtroCargo())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoPlandeDePagos responsePrestamoPlandeDePagos = ResponsePrestamoPlandeDePagos.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoPlanDePagos por GRPC");

            responseObserver.onNext(responsePrestamoPlandeDePagos);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            LOG.error("Error en consultarPrestamoPlanDePagos grpc " + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            LOG.error("Error en consultarPrestamoPlanDePagos grpc " + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarPrestamoOtroTitular(QueryPrestamo request, io.grpc.stub.StreamObserver<ResponsePrestamoPlanDePagosOtroTitular> responseObserver) {
        LOG.info("Inicia consultarPrestamoOtroTitular por GRPC");
        try {
            validator.validarPrestamoQuery(request);
            OtroTitularOutput prestamoListType = prestamoService.consultarPrestamoOtroTitular(1,1000, new BigDecimal(request.getNumeroPrestamo()));

            List<PrestamoOtroTitular> prestamoResponse = new ArrayList<>();
            for (PrestamoOtroTitularEntity prestamoOtroTitularType : prestamoListType.getPrestamoOtroTitular()) {
                prestamoResponse.add(com.mibanco.prestamofic.es.PrestamoOtroTitular.newBuilder()
                        .setTipoDocumento(prestamoOtroTitularType.getTipoDocumento().toString())
                        .setNumeroDocumento(prestamoOtroTitularType.getNumeroDocumento())
                        .setNombre(prestamoOtroTitularType.getNombre())
                        .setTipoTitular(prestamoOtroTitularType.getTipoTitular())
                        .setNumeroPrestamo(prestamoOtroTitularType.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoPlanDePagosOtroTitular responsePrestamoPlanDePagosOtroTitular = ResponsePrestamoPlanDePagosOtroTitular.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoOtroTitular por GRPC");

            responseObserver.onNext(responsePrestamoPlanDePagosOtroTitular);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            LOG.error("Error en consultarPrestamoOtroTitular grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            LOG.error("Error en consultarPrestamoOtroTitular grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarPrestamoGarantia(QueryPrestamo request, io.grpc.stub.StreamObserver<ResponsePrestamoGarantia> responseObserver) {

        LOG.info("Inicia consultarPrestamoGarantia por GRPC");
        try {
            validator.validarPrestamoQuery(request);
            GarantiaOutput prestamoListType = prestamoService.consultarPrestamoGarantiaOutput(1,1000, new BigDecimal(request.getNumeroPrestamo()));

            List<PrestamoGarantia> prestamoResponse = new ArrayList<>();
            for (PrestamoGarantiaEntity prestamoGarantiaType : prestamoListType.getPrestamoGarantia()) {
                prestamoResponse.add(com.mibanco.prestamofic.es.PrestamoGarantia.newBuilder()
                        .setTipoGarantia(prestamoGarantiaType.getTipoGarantia().toString())
                        .setSubtipoGarantia(prestamoGarantiaType.getSubtipoGarantia())
                        .setAvaluo((float) prestamoGarantiaType.getAvaluo())
                        .setReferencia(prestamoGarantiaType.getReferencia())
                        .setNumeroPrestamo(prestamoGarantiaType.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoGarantia response = ResponsePrestamoGarantia.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoGarantia por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            LOG.error("Error en consultarPrestamoGarantia grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            LOG.error("Error en consultarPrestamoGarantia grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarPrestamoDetallePagos(QueryPrestamo request, io.grpc.stub.StreamObserver<ResponsePrestamoDetallePagos> responseObserver) {
        LOG.info("Inicia consultarPrestamoDetallePagos por GRPC");
        try {
            validator.validarPrestamoQuery(request);
            DetallePagosOutput prestamoListType = prestamoService.consultarPrestamoDetallePagos(1,1000, new BigDecimal(request.getNumeroPrestamo()));

            List<PrestamoDeatellePagos> prestamoResponse = new ArrayList<>();
            for (PrestamoDetallePagosEntity prestamoDetallePagosType : prestamoListType.getPrestamoDetallePagos()) {
                prestamoResponse.add(com.mibanco.prestamofic.es.PrestamoDeatellePagos.newBuilder()
                        .setFechaPago(prestamoDetallePagosType.getFechaPago().toString())
                        .setAbonoACapital((float) prestamoDetallePagosType.getAbonoACapital())
                        .setInteresesCorrientes((float) prestamoDetallePagosType.getInteresesCorrientes())
                        .setInteresesMora((float) prestamoDetallePagosType.getInteresesMora())
                        .setSeguroVida(prestamoDetallePagosType.getSeguroVida())
                        .setLeyMipyme(prestamoDetallePagosType.getLeyMipyme())
                        .setCargoCobranza(prestamoDetallePagosType.getCargoCobranza())
                        .setOtros(prestamoDetallePagosType.getOtros())
                        .setNumeroPrestamo(prestamoDetallePagosType.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoDetallePagos responsePrestamoDetallePagos = ResponsePrestamoDetallePagos.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoDetallePagos por GRPC");

            responseObserver.onNext(responsePrestamoDetallePagos);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            LOG.error("Error en consultarPrestamoDetallePagos grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            LOG.error("Error en consultarPrestamoDetallePagos grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    @Override
    @Blocking
    public void consultarPrestamoCondonado(QueryPrestamo request, io.grpc.stub.StreamObserver<ResponsePrestamoCondonado> responseObserver) {
        LOG.info("Inicia consultarPrestamoCondonado por GRPC");
        try {
            validator.validarPrestamoQuery(request);
            CondonadoOutput prestamoListType = prestamoService.consultarPrestamoCondonado(1,1000, new BigDecimal(request.getNumeroPrestamo()));

            List<PrestamoCondonado> prestamoResponse = new ArrayList<>();
            for (PrestamoCondonadoEntity prestamoCondonadoType : prestamoListType.getPrestamoCondonado()) {
                prestamoResponse.add(com.mibanco.prestamofic.es.PrestamoCondonado.newBuilder()
                        .setAbonoACapital(Float.parseFloat(prestamoCondonadoType.getAbonoACapital()))
                        .setComisionComisionIVA(6f)
                        .setDiasVencidos(prestamoCondonadoType.getDiasVencidos())
                        .setEstado(prestamoCondonadoType.getEstado())
                        .setFechaAPagar(prestamoCondonadoType.getFechaAPagar().toString())
                        .setFechaPago(prestamoCondonadoType.getFechaPago().toString())
                        .setTotalCuota(Float.parseFloat(prestamoCondonadoType.getTotalCuota()))
                        .build());
            }

            ResponsePrestamoCondonado responsePrestamoCondonado = ResponsePrestamoCondonado.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoCondonado por GRPC");

            responseObserver.onNext(responsePrestamoCondonado);
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            LOG.error("Error en consultarPrestamoCondonado grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {
            LOG.error("Error en consultarPrestamoCondonado grpc" + e.getMessage());
            StatusException statusException = responseExceptionGrpc(Status.INTERNAL, e.getMessage());
            responseObserver.onError(statusException);
        }
    }

    private StatusException responseExceptionGrpc(Status statusCode, String exceptionMessage) {

        LOG.error(exceptionMessage + "Excepción: " + exceptionMessage);

        Metadata metadata = new Metadata();
        metadata.put(Metadata.Key.of("Error: ", Metadata.ASCII_STRING_MARSHALLER), exceptionMessage);

        return statusCode.asException(metadata);
    }

}
