package com.mibanco.prestamofic.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@RegisterForReflection
public class PrestamoCondonadoEntity {
    private Integer numeroCuota;
    private Date fechaAPagar;
    private String abonoACapital;
    private String interesesCorrientes;
    private Float interesesMora;
    private Float leyMipyme;
    private Float seguros;
    private Float cargoCobranza;
    private Float interesesDiferidos;
    private Float otros;
    private String totalCuota;
    private String estado;
    private Date fechaPago;
    private Integer diasVencidos;

    public PrestamoCondonadoEntity(Integer numeroCuota, Date fechaAPagar, String abonoACapital, String interesesCorrientes, Float interesesMora, Float leyMipyme, Float seguros, Float cargoCobranza, Float interesesDiferidos, Float otros, String totalCuota, String estado, Date fechaPago, Integer diasVencidos) {
        this.numeroCuota = numeroCuota;
        this.fechaAPagar = fechaAPagar;
        this.abonoACapital = abonoACapital;
        this.interesesCorrientes = interesesCorrientes;
        this.interesesMora = interesesMora;
        this.leyMipyme = leyMipyme;
        this.seguros = seguros;
        this.cargoCobranza = cargoCobranza;
        this.interesesDiferidos = interesesDiferidos;
        this.otros = otros;
        this.totalCuota = totalCuota;
        this.estado = estado;
        this.fechaPago = fechaPago;
        this.diasVencidos = diasVencidos;
    }
}
