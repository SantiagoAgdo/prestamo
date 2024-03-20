package com.mibanco.prestamofic.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@RegisterForReflection
public class PrestamoDetallePagosEntity {
    private String numeroPrestamo;
    private String numeroCuota;
    private Date fechaAPagar;
    private double abonoACapital;
    private double interesesCorrientes;
    private double interesesMora;
    private Float leyMipyme;
    private Float seguroVida;
    private Float cargoCobranza;
    private Float interesesDiferidos;
    private Float otros;
    private Float totalCuota;
    private String estado;
    private Date fechaPago;
    private Integer diasVencidos;

    public PrestamoDetallePagosEntity(String numeroPrestamo, String numeroCuota, Date fechaAPagar, double abonoACapital, double interesesCorrientes, double interesesMora, Float leyMipyme, Float seguroVida, Float cargoCobranza, Float interesesDiferidos, Float otros, Float totalCuota, String estado, Date fechaPago, Integer diasVencidos) {
        this.numeroPrestamo = numeroPrestamo;
        this.numeroCuota = numeroCuota;
        this.fechaAPagar = fechaAPagar;
        this.abonoACapital = abonoACapital;
        this.interesesCorrientes = interesesCorrientes;
        this.interesesMora = interesesMora;
        this.leyMipyme = leyMipyme;
        this.seguroVida = seguroVida;
        this.cargoCobranza = cargoCobranza;
        this.interesesDiferidos = interesesDiferidos;
        this.otros = otros;
        this.totalCuota = totalCuota;
        this.estado = estado;
        this.fechaPago = fechaPago;
        this.diasVencidos = diasVencidos;
    }




}

