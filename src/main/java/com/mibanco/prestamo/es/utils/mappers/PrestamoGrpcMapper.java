package com.mibanco.prestamo.es.utils.mappers;

import com.google.gson.Gson;
import com.google.protobuf.MessageOrBuilder;
import com.mibanco.prestamo.es.Prestamo;
import com.mibanco.prestamo.es.QueryCliente;
import com.mibanco.prestamo.es.QueryPrestamo;
import com.mibanco.prestamo.es.QueryPrestamoCuota;
import com.mibanco.prestamo.es.dao.entity.PrestamoEntity;
import com.mibanco.prestamo.es.gen.type.PrestamoType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;
import com.google.protobuf.util.JsonFormat;

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
}
