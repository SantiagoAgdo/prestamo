package com.mibanco.prestamo.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class PrestamoPlanDePagosOtroCargoEntity {

    public String descripcionCargo;
    public Float valor;
    public String numeroPrestamo;
    public Integer numeroCuota;
}
