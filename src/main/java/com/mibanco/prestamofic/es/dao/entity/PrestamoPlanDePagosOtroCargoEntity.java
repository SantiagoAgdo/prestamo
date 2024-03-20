package com.mibanco.prestamofic.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class PrestamoPlanDePagosOtroCargoEntity {

    public String numeroPrestamo;
    public Float valor;
    public String descripcionCargo;
}
