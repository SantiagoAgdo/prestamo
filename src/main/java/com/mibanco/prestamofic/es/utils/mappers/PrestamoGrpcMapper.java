package com.mibanco.prestamofic.es.utils.mappers;

import com.google.gson.Gson;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import com.mibanco.prestamofic.es.LogAuditoriaTypeGrpc;
import com.mibanco.prestamofic.es.LogRendimientoTypeGrpc;
import com.mibanco.prestamofic.es.Prestamo;
import com.mibanco.prestamofic.es.dao.entity.PrestamoEntity;
import com.mibanco.prestamofic.es.dto.LogAuditoriaDTO;
import com.mibanco.prestamofic.es.dto.LogRendimientoDTO;
import com.mibanco.prestamofic.es.gen.type.PrestamoType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

import java.io.IOException;

@ApplicationScoped
public class PrestamoGrpcMapper {

    private Gson obj = new Gson();

    public PrestamoEntity clienteGrpcToEntity(Prestamo grpc) {
        return new ModelMapper().map(grpc, PrestamoEntity.class);
    }

    public String toJson(MessageOrBuilder messageOrBuilder) throws IOException {
        return JsonFormat.printer().print(messageOrBuilder);
    }

    public Prestamo clienteCdtToGrpc(PrestamoType clienteCDTDigitalType) throws IOException {
        Prestamo.Builder structBuilder = Prestamo.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(this.obj.toJson(clienteCDTDigitalType), structBuilder);
        return structBuilder.build();
    }

    public LogRendimientoTypeGrpc logRendimientoDTOToGrpc(LogRendimientoDTO logRendimientoType)  {
        return new ModelMapper().map(logRendimientoType, LogRendimientoTypeGrpc.class);
    }

    public LogAuditoriaTypeGrpc logAuditoriaDTOToGrpc(LogAuditoriaDTO logAuditoriaDTO) {
        return new ModelMapper().map(logAuditoriaDTO, LogAuditoriaTypeGrpc.class);
    }
}
