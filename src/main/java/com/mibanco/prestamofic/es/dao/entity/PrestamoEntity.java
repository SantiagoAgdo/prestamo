package com.mibanco.prestamofic.es.dao.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class PrestamoEntity {
    public String condicionPrestamo;
    public Integer diasMoraActual;
    public Integer diasMoraMaxima;
    public Integer diasMoraPromedio;
    public String estadoActualPrestamo;
    public Date fechaDesembolso;
    public Date fechaUltimoPago;
    public Float montoDesembolsado;
    public Integer numeroCliente;
    public String numeroPrestamo;
    public Integer plazo;
    public String prestamoCondonado;
    public String prestamoDetallePagos;
    public String prestamoGarantia;
    public String prestamoOtroTitular;
    public String prestamoPlanDePagos;
    public String prestamoPorPagar;
    public String saldoActual;
    public String subProducto;
    public String tasaMNM;
    public Float tasaColocacion;

    public PrestamoEntity(String numeroPrestamo, String subProducto, Date fechaDesembolso,
                          Date fechaUltimoPago, Float montoDesembolsado, String saldoActual,
                          String estadoActualPrestamo, String condicionPrestamo, String tasaMNM,
                          Integer plazo, Integer diasMoraActual, Integer diasMoraMaxima,
                          Integer diasMoraPromedio, Float tasaColocacion) {
        this.numeroPrestamo = numeroPrestamo;
        this.subProducto = subProducto;
        this.fechaDesembolso = fechaDesembolso;
        this.fechaUltimoPago = fechaUltimoPago;
        this.montoDesembolsado = montoDesembolsado;
        this.saldoActual = saldoActual;
        this.estadoActualPrestamo = estadoActualPrestamo;
        this.condicionPrestamo = condicionPrestamo;
        this.tasaMNM = tasaMNM;
        this.plazo = plazo;
        this.diasMoraActual = diasMoraActual;
        this.diasMoraMaxima = diasMoraMaxima;
        this.diasMoraPromedio = diasMoraPromedio;
        this.tasaColocacion = tasaColocacion;
    }


}
