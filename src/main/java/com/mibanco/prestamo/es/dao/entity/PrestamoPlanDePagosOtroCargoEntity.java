package com.mibanco.prestamo.es.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoPlanDePagosOtroCargoEntity {

    public String descripcionCargo;
    public Float valor;
    public String numeroPrestamo;
    public Integer numeroCuota;
}
