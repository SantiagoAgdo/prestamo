package com.mibanco.prestamo.es.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoDetallePagosEntity {
    public Date fechaPago;
    public Float valorPagado;
    public Float abonoACapital;
    public Float interesesCorrientes;
    public Float interesesMora;
    public Float seguroVida;
    public Float leyMipyme;
    public Float leyMipymeIVA;
    public Float cargoCobranza;
    public Float cobranzaIVA;
    public Float otros;
    public String numeroPrestamo;
}
