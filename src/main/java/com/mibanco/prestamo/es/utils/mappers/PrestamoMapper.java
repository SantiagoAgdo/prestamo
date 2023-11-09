package com.mibanco.prestamo.es.utils.mappers;

import com.mibanco.prestamo.es.dao.entity.*;
import com.mibanco.prestamo.es.gen.type.*;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class PrestamoMapper {

    public PrestamoType prestamoToType(PrestamoEntity entity) {
        return new ModelMapper().map(entity, PrestamoType.class);
    }

    public PrestamoDetallePagosType prestamoDetallePagosToType(PrestamoDetallePagosEntity entity) {
        return new ModelMapper().map(entity, PrestamoDetallePagosType.class);
    }

    public PrestamoCondonadoType prestamoCondonadoToType(PrestamoCondonadoEntity entity) {
        return new ModelMapper().map(entity, PrestamoCondonadoType.class);
    }

    public PrestamoGarantiaType prestamoGarantiaToType(PrestamoGarantiaEntity entity) {
        return new ModelMapper().map(entity, PrestamoGarantiaType.class);
    }

    public PrestamoOtroTitularType prestamoOtroTitularToType(PrestamoOtroTitularEntity entity) {
        return new ModelMapper().map(entity, PrestamoOtroTitularType.class);
    }

    public PrestamoPlanDePagosType prestamoPlanDePagosToType(PrestamoPlanDePagosEntity entity) {
        return new ModelMapper().map(entity, PrestamoPlanDePagosType.class);
    }

    public PrestamoPlanDePagosOtroCargoType prestamoPlanDePagosOtroToType(PrestamoPlanDePagosOtroCargoEntity entity) {
        return new ModelMapper().map(entity, PrestamoPlanDePagosOtroCargoType.class);
    }

    public PrestamoPorPagarType prestamoPorPagarToType(PrestamoPorPagarEntity entity) {
        return new ModelMapper().map(entity, PrestamoPorPagarType.class);
    }


}
