package com.mibanco.prestamo.es.dao.entity;

import com.mibanco.prestamo.es.gen.type.SubProductoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    public Float saldoActual;
    public SubProductoEnum subProducto;
}
