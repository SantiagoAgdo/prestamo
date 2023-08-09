package com.mibanco.prestamo.es.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoPlanDePagosEntity {

    public Integer numeroCuota;
    public Date fechaAPagar;
    public Float abonoACapital;
    public Float intereses;
    public Float otrosCargos;
    public Float totalCuota;
    public Float saldo;
    public String estado;
    public Integer diasVencidos;
    public Date fechaPago;
    public Float montoPagado;
    public String prestamoPlanDePagosOtroCargo;
    public String numeroPrestamo;
}
