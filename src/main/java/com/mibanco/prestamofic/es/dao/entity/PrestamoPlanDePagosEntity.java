package com.mibanco.prestamofic.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@RegisterForReflection
public class PrestamoPlanDePagosEntity {

    public String numeroPrestamo;
    public String numeroCuota;
    public Date fechaAPagar;
    public String abonoACapital;
    public String intereses;
    public String otrosCargos;
    public String totalCuota;
    public String saldo;
    public String estado;
    public Integer diasVencidos;
    public Date fechaPago;
    public double montoPagado;
    public String prestamoPlanDePagosOtroCargo;

    public PrestamoPlanDePagosEntity(String numeroPrestamo, String numeroCuota, Date fechaAPagar, String abonoACapital, String intereses, String otrosCargos, String totalCuota, String saldo, String estado, Integer diasVencidos, Date fechaPago, double montoPagado, String prestamoPlanDePagosOtroCargo) {
        this.numeroPrestamo = numeroPrestamo;
        this.numeroCuota = numeroCuota;
        this.fechaAPagar = fechaAPagar;
        this.abonoACapital = abonoACapital;
        this.intereses = intereses;
        this.otrosCargos = otrosCargos;
        this.totalCuota = totalCuota;
        this.saldo = saldo;
        this.estado = estado;
        this.diasVencidos = diasVencidos;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
        this.prestamoPlanDePagosOtroCargo = prestamoPlanDePagosOtroCargo;
    }
}
