package com.mibanco.prestamofic.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@RegisterForReflection
public class PrestamoGarantiaEntity {

    private String numeroPrestamo;
    private String tipoGarantia;
    private String subtipoGarantia;
    private double avaluo;
    private String referencia;

    public PrestamoGarantiaEntity(String numeroPrestamo, String tipoGarantia, String subtipoGarantia, double avaluo, String referencia) {
        this.numeroPrestamo = numeroPrestamo;
        this.tipoGarantia = tipoGarantia;
        this.subtipoGarantia = subtipoGarantia;
        this.avaluo = avaluo;
        this.referencia = referencia;
    }
}
