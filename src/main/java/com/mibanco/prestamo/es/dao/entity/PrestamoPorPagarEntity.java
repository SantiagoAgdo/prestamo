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
public class PrestamoPorPagarEntity {

    public Integer numeroCuota;
    public Date fechaAPagar;
    public Float abonoACapital;
    public Float interesesCteBalance;
    public Float interesesCteContingente;
    public Float interesesMoraBalance;
    public Float interesesMoraContingente;
    public Float seguroVida;
    public Float seguroAdicional;
    public Float leyMipymeLeyMipymeIVA;
    public Float comisionComisionIVA;
    public Float GACGACIVA;
    public Float gastoExtraJudicialGastoExtraJudicialIVA;
    public Float gastoExtraDiferidoGastoExtraDiferidoIVA;
    public Float totalCuota;
    public String estado;
    public Date fechaPago;
    public Integer diasVencidos;
    public String numeroPrestamo;
}
