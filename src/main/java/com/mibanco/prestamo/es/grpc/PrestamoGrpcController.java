package com.mibanco.prestamo.es.grpc;

import com.mibanco.prestamo.es.*;
import com.mibanco.prestamo.es.gen.type.*;
import com.mibanco.prestamo.es.services.impl.PrestamoServiceImpl;
import com.mibanco.prestamo.es.utils.exceptions.ApplicationExceptionValidation;
import com.mibanco.prestamo.es.utils.mappers.PrestamoGrpcMapper;
import com.mibanco.prestamo.es.utils.validator.PrestamoValidator;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusException;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
            List<PrestamoType> prestamoListType = prestamoService.consultarPrestamo(Integer.parseInt(request.getNumeroCliente()));

            List<Prestamo> prestamoResponse = new ArrayList<>();
            for (PrestamoType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.Prestamo.newBuilder()
                        .setCondicionPrestamo(alert.getCondicionPrestamo())
                        .setDiasMoraActual(alert.getDiasMoraActual())
                        .setDiasMoraMaxima(alert.getDiasMoraMaxima())
                        .setDiasMoraPromedio(alert.getDiasMoraPromedio())
                        .setEstadoActualPrestamo(alert.getEstadoActualPrestamo())
                        .setFechaDesembolso(alert.getFechaDesembolso().toString())
                        .setFechaUltimoPago(alert.getFechaUltimoPago().toString())
                        .setMontoDesembolsado(alert.getMontoDesembolsado())
                        .setNumeroCliente(alert.getNumeroCliente())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .setPlazo(alert.getPlazo())
                        .setPrestamoCondonado(alert.getPrestamoCondonado())
                        .setPrestamoDetallePagos(alert.getPrestamoDetallePagos())
                        .setPrestamoGarantia(alert.getPrestamoGarantia())
                        .setPrestamoOtroTitular(alert.getPrestamoOtroTitular())
                        .setPrestamoPlanDePagos(alert.getPrestamoPlanDePagos())
                        .setPrestamoPorPagar(alert.getPrestamoPorPagar())
                        .setSaldoActual(alert.getSaldoActual())
                        .setSubProducto(alert.getSubProducto().toString())
                        .build());
            }

            ResponsePrestamo response = ResponsePrestamo.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamo por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {
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
            List<PrestamoPorPagarType> prestamoListType = prestamoService.consultarPrestamoPorPagar(Integer.parseInt(request.getNumeroPrestamo()));

            List<PrestamoPorPagar> prestamoResponse = new ArrayList<>();
            for (PrestamoPorPagarType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.PrestamoPorPagar.newBuilder()
                        .setNumeroCuota(alert.getNumeroCuota())
                        .setFechaAPagar(alert.getFechaAPagar().toString())
                        .setAbonoACapital(alert.getAbonoACapital())
                        .setInteresesCteBalance(alert.getInteresesCteBalance())
                        .setInteresesCteContingente(alert.getInteresesCteContingente())
                        .setInteresesMoraBalance(alert.getInteresesMoraBalance())
                        .setInteresesMoraContingente(alert.getInteresesMoraContingente())
                        .setSeguroVida(alert.getSeguroVida())
                        .setSeguroAdicional(alert.getSeguroAdicional())
                        .setLeyMipymeLeyMipymeIVA(alert.getLeyMipymeLeyMipymeIVA())
                        .setComisionComisionIVA(6f)
                        .setGACGACIVA(alert.getGACGACIVA())
                        .setGastoExtraJudicialGastoExtraJudicialIVA(alert.getGastoExtraJudicialGastoExtraJudicialIVA())
                        .setGastoExtraDiferidoGastoExtraDiferidoIVA(alert.getGastoExtraDiferidoGastoExtraDiferidoIVA())
                        .setTotalCuota(alert.getTotalCuota())
                        .setEstado(alert.getEstado())
                        .setFechaPago(alert.getFechaPago().toString())
                        .setDiasVencidos(alert.getDiasVencidos())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoPorPagar response = ResponsePrestamoPorPagar.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoPorPagar por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {
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
            List<PrestamoPlanDePagosOtroCargoType> prestamoListType = prestamoService.consultarPrestamoPlanDePagosOtroCargo(Integer.parseInt(request.getNumeroPrestamo()));

            List<PrestamoPlanDePagosOtroCargo> prestamoResponse = new ArrayList<>();
            for (PrestamoPlanDePagosOtroCargoType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.PrestamoPlanDePagosOtroCargo.newBuilder()
                        .setDescripcionCargo(alert.getDescripcionCargo())
                        .setValor(alert.getValor())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoPlanDePagosOtroCargo response = ResponsePrestamoPlanDePagosOtroCargo.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoPlanDePagosOtroCargo por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {
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
            List<PrestamoPlanDePagosType> prestamoListType = prestamoService.consultarPrestamoPlanDePagos(Integer.parseInt(request.getNumeroPrestamo()));

            List<PrestamoPlanDePagos> prestamoResponse = new ArrayList<>();
            for (PrestamoPlanDePagosType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.PrestamoPlanDePagos.newBuilder()
                        .setNumeroCuota(alert.getNumeroCuota())
                        .setFechaAPagar(alert.getFechaAPagar().toString())
                        .setAbonoACapital(alert.getAbonoACapital())
                        .setIntereses(alert.getIntereses())
                        .setOtrosCargos(alert.getOtrosCargos())
                        .setTotalCuota(alert.getTotalCuota())
                        .setSaldo(alert.getSaldo())
                        .setEstado(alert.getEstado())
                        .setDiasVencidos(alert.getDiasVencidos())
                        .setFechaPago(alert.getFechaPago().toString())
                        .setMontoPagado(alert.getMontoPagado())
                        .setPrestamoPlanDePagosOtroCargo(alert.getPrestamoPlanDePagosOtroCargo())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoPlandeDePagos response = ResponsePrestamoPlandeDePagos.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoPlanDePagos por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);
        } catch (Exception e) {
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
            List<PrestamoOtroTitularType> prestamoListType = prestamoService.consultarPrestamoOtroTitular(Integer.parseInt(request.getNumeroPrestamo()));

            List<PrestamoOtroTitular> prestamoResponse = new ArrayList<>();
            for (PrestamoOtroTitularType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.PrestamoOtroTitular.newBuilder()
                        .setTipoDocumento(alert.getTipoDocumento().toString())
                        .setNumeroDocumento(alert.getNumeroDocumento())
                        .setPrimerNombre(alert.getPrimerNombre())
                        .setSegundoNombre(alert.getSegundoNombre())
                        .setPrimerApellido(alert.getPrimerApellido())
                        .setSegundoApellido(alert.getSegundoApellido())
                        .setTipoTitular(alert.getTipoTitular().toString())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoPlanDePagosOtroTitular response = ResponsePrestamoPlanDePagosOtroTitular.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoOtroTitular por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);
        } catch (Exception e) {
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
            List<PrestamoGarantiaType> prestamoListType = prestamoService.consultarPrestamoGarantiaOutput(Integer.parseInt(request.getNumeroPrestamo()));

            List<PrestamoGarantia> prestamoResponse = new ArrayList<>();
            for (PrestamoGarantiaType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.PrestamoGarantia.newBuilder()
                        .setTipoGarantia(alert.getTipoGarantia().toString())
                        .setSubtipoGarantia(alert.getSubtipoGarantia())
                        .setAvaluo(alert.getAvaluo())
                        .setReferencia(alert.getReferencia())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoGarantia response = ResponsePrestamoGarantia.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoGarantia por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);
        } catch (Exception e) {
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
            List<PrestamoDetallePagosType> prestamoListType = prestamoService.consultarPrestamoDetallePagos(Integer.parseInt(request.getNumeroPrestamo()));

            List<PrestamoDeatellePagos> prestamoResponse = new ArrayList<>();
            for (PrestamoDetallePagosType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.PrestamoDeatellePagos.newBuilder()
                        .setFechaPago(alert.getFechaPago().toString())
                        .setValorPagado(alert.getValorPagado())
                        .setAbonoACapital(alert.getAbonoACapital())
                        .setInteresesCorrientes(alert.getInteresesCorrientes())
                        .setInteresesMora(alert.getInteresesMora())
                        .setSeguroVida(alert.getSeguroVida())
                        .setLeyMipyme(alert.getLeyMipyme())
                        .setLeyMipymeIVA(alert.getLeyMipymeIVA())
                        .setCargoCobranza(alert.getCargoCobranza())
                        .setCobranzaIVA(alert.getCobranzaIVA())
                        .setOtros(alert.getOtros())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .build());
            }

            ResponsePrestamoDetallePagos response = ResponsePrestamoDetallePagos.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoDetallePagos por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {
            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);
        } catch (Exception e) {
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
            List<PrestamoCondonadoType> prestamoListType = prestamoService.consultarPrestamoCondonado(Integer.parseInt(request.getNumeroPrestamo()));

            List<PrestamoCondonado> prestamoResponse = new ArrayList<>();
            for (PrestamoCondonadoType alert : prestamoListType) {
                prestamoResponse.add(com.mibanco.prestamo.es.PrestamoCondonado.newBuilder()
                        .setAbonoACapital(alert.getAbonoACapital())
                        .setComisionComisionIVA(6f)
                        .setDiasVencidos(alert.getDiasVencidos())
                        .setEstado(alert.getEstado())
                        .setFechaAPagar(alert.getFechaAPagar().toString())
                        .setFechaPago(alert.getFechaPago().toString())
                        .setGACGACIVA(alert.getGACGACIVA())
                        .setGastoExtraDiferidoGastoExtraDiferidoIVA(alert.getGastoExtraDiferidoGastoExtraDiferidoIVA())
                        .setGastoExtraJudicialGastoExtraJudicialIVA(alert.getGastoExtraJudicialGastoExtraJudicialIVA())
                        .setInteresesCteBalance(alert.getInteresesCteBalance())
                        .setInteresesCteContingente(alert.getInteresesCteContingente())
                        .setInteresesMoraBalance(alert.getInteresesMoraBalance())
                        .setInteresesMoraContingente(alert.getInteresesMoraContingente())
                        .setLeyMipymeLeyMipymeIVA(alert.getLeyMipymeLeyMipymeIVA())
                        .setNumeroCuota(alert.getNumeroCuota())
                        .setNumeroPrestamo(alert.getNumeroPrestamo())
                        .setOtrosGastos(alert.getOtrosGastos())
                        .setOtrosGastosIVA(alert.getOtrosGastosIVA())
                        .setSeguroAdicional(alert.getSeguroAdicional())
                        .setSeguroVida(alert.getSeguroVida())
                        .setTotalCuota(alert.getTotalCuota())
                        .build());
            }

            ResponsePrestamoCondonado response = ResponsePrestamoCondonado.newBuilder().addAllObj(prestamoResponse).build();
            LOG.info("Finaliza consultarPrestamoCondonado por GRPC");

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (ApplicationExceptionValidation e) {

            StatusException statusException = responseExceptionGrpc(Status.INVALID_ARGUMENT, e.getMessage());
            responseObserver.onError(statusException);

        } catch (Exception e) {

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
