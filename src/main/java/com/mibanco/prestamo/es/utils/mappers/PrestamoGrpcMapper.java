package com.mibanco.prestamo.es.utils.mappers;

import com.mibanco.prestamo.es.Prestamo;
import com.mibanco.prestamo.es.QueryCliente;
import com.mibanco.prestamo.es.QueryPrestamo;
import com.mibanco.prestamo.es.QueryPrestamoCuota;
import com.mibanco.prestamo.es.dao.entity.PrestamoEntity;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class PrestamoGrpcMapper {

    public PrestamoEntity clienteGrpcToEntity(Prestamo grpc) {
        return new ModelMapper().map(grpc, PrestamoEntity.class);
    }

    public Integer queryClienteGrpcToEntity(QueryCliente grpc) {
        return new ModelMapper().map(grpc, Integer.class);
    }

    public Integer queryPrestamoGrpcToEntity(QueryPrestamo grpc) {
        return new ModelMapper().map(grpc, Integer.class);
    }

    public Integer queryPrestamoCuotaGrpcToEntity(QueryPrestamoCuota grpc) {
        return new ModelMapper().map(grpc, Integer.class);
    }
}
