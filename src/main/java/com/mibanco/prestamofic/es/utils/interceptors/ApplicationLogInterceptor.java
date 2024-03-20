package com.mibanco.prestamofic.es.utils.interceptors;


import com.mibanco.prestamofic.es.LogAuditoriaTypeGrpc;
import com.mibanco.prestamofic.es.LogRendimientoTypeGrpc;
import com.mibanco.prestamofic.es.RegistrarLogGrpc;
import com.mibanco.prestamofic.es.dto.LogAuditoriaDTO;
import com.mibanco.prestamofic.es.dto.LogRendimientoDTO;
import com.mibanco.prestamofic.es.utils.mappers.PrestamoGrpcMapper;
import io.quarkus.grpc.GrpcClient;
import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

//@Provider
public class ApplicationLogInterceptor implements ContainerRequestFilter, ContainerResponseFilter {

    @GrpcClient("registrarlog")
    jakarta.inject.Provider<RegistrarLogGrpc.RegistrarLogBlockingStub> registrarLog;

    @Inject
    PrestamoGrpcMapper mapper;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        LogRendimientoDTO logRendimiento = createLogRendimiento(requestContext);
        requestContext.setProperty("logRendimiento", logRendimiento);
        LogAuditoriaDTO logAuditoria = createLogAuditoria(requestContext);
        requestContext.setProperty("logAuditoria", logAuditoria);

        invokeAuditoriaLog(logAuditoria);
    }

    private String readEntityStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }
        return new String(baos.toByteArray(), StandardCharsets.UTF_8);
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        LogRendimientoDTO logRendimiento = (LogRendimientoDTO) requestContext.getProperty("logRendimiento");
        updateLogRendimiento(logRendimiento);

        LogAuditoriaDTO logAuditoria = (LogAuditoriaDTO) requestContext.getProperty("logAuditoria");
        updateLogAuditoria(logAuditoria, responseContext);

        invokeRendimientoLog(logRendimiento);
        invokeAuditoriaLog(logAuditoria);
    }

    private void invokeRendimientoLog(LogRendimientoDTO logRendimiento) throws IOException {
        LogRendimientoTypeGrpc grpcRendimiento = mapper.logRendimientoDTOToGrpc(logRendimiento);
        registrarLog.get().registrarLogRendimiento(grpcRendimiento);
    }

    private void invokeAuditoriaLog(LogAuditoriaDTO logAuditoria) throws IOException {
        LogAuditoriaTypeGrpc grpcAuditoria = mapper.logAuditoriaDTOToGrpc(logAuditoria);
        registrarLog.get().registrarLogAuditoria(grpcAuditoria);
    }

    private LogRendimientoDTO createLogRendimiento(ContainerRequestContext requestContext) {
        LogRendimientoDTO logRendimiento = new LogRendimientoDTO();
        logRendimiento.setCorrelationId(generateCorrelationId());
        logRendimiento.setRecurso(requestContext.getUriInfo().getRequestUri().toString());
        logRendimiento.setHoraFechaInicio(new Date());
        return logRendimiento;
    }

    private LogAuditoriaDTO createLogAuditoria(ContainerRequestContext requestContext) {
        String direccionIP = requestContext.getHeaderString("ip");
        Date currentDate = new Date();

        LogAuditoriaDTO logAuditoria = new LogAuditoriaDTO();
        logAuditoria.setCorrelationId(generateCorrelationId());
        logAuditoria.setDireccionIP(direccionIP);
        logAuditoria.setRecurso(requestContext.getUriInfo().getRequestUri().toString());
        logAuditoria.setFecha(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        logAuditoria.setHora(timeFormat.format(currentDate));

        return logAuditoria;
    }

    private void updateLogRendimiento(LogRendimientoDTO logRendimiento) {
        logRendimiento.setHoraFechaFin(new Date());
        logRendimiento.setDuracionTotal(calculateDuration(logRendimiento.getHoraFechaInicio(), logRendimiento.getHoraFechaFin()));
    }

    private void updateLogAuditoria(LogAuditoriaDTO logAuditoria, ContainerResponseContext responseContext) {
        Date currentDate = new Date();
        logAuditoria.setFecha(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        logAuditoria.setHora(timeFormat.format(currentDate));

        logAuditoria.setAccion(responseContext.getStatus() == 200 ? "Accion Realizada" : "Accion No Realizada");
        logAuditoria.setResultadoAccion(responseContext.getStatus() == 200 ? "Éxito" : "No Exitoso - Error");
    }

    private int calculateDuration(Date startTime, Date endTime) {
        return (int) (endTime.getTime() - startTime.getTime());
    }

    private String generateCorrelationId() {
        return UUID.randomUUID().toString();
    }

}