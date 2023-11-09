package com.mibanco.prestamo.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class PrestamoCondonadoEntity {
    public Float abonoACapital;
    public Float comisiónComisiónIVA;
    public Integer diasVencidos;
    public String estado;
    public Date fechaAPagar;
    public Date fechaPago;
    public Float GACGACIVA;
    public Float gastoExtraDiferidoGastoExtraDiferidoIVA;
    public Float gastoExtraJudicialGastoExtraJudicialIVA;
    public Float interesesCteBalance;
    public Float interesesCteContingente;
    public Float interesesMoraBalance;
    public Float interesesMoraContingente;
    public Float leyMipymeLeyMipymeIVA;
    public Integer numeroCuota;
    public String numeroPrestamo;
    public Float otrosGastos;
    public Float otrosGastosIVA;
    public Float seguroAdicional;
    public Float seguroVida;
    public Float totalCuota;

}
