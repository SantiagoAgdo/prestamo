package com.mibanco.prestamo.es.gen.type;

import com.mibanco.prestamo.es.gen.type.SubProductoEnum;
import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-18T12:43:29.415064-05:00[America/Bogota]")
public class PrestamoType   {
  private @Valid String condicionPrestamo;
  private @Valid Integer diasMoraActual;
  private @Valid Integer diasMoraMaxima;
  private @Valid Integer diasMoraPromedio;
  private @Valid String estadoActualPrestamo;
  private @Valid Date fechaDesembolso = null;
  private @Valid Date fechaUltimoPago = null;
  private @Valid Float montoDesembolsado = null;
  private @Valid Integer numeroCliente;
  private @Valid String numeroPrestamo;
  private @Valid Integer plazo;
  private @Valid String prestamoCondonado;
  private @Valid String prestamoDetallePagos;
  private @Valid String prestamoGarantia;
  private @Valid String prestamoOtroTitular;
  private @Valid String prestamoPlanDePagos;
  private @Valid String prestamoPorPagar;
  private @Valid Float saldoActual = null;
  private @Valid SubProductoEnum subProducto;

  /**
   **/
  public PrestamoType condicionPrestamo(String condicionPrestamo) {
    this.condicionPrestamo = condicionPrestamo;
    return this;
  }

  
  @JsonProperty("condicionPrestamo")
  public String getCondicionPrestamo() {
    return condicionPrestamo;
  }

  @JsonProperty("condicionPrestamo")
  public void setCondicionPrestamo(String condicionPrestamo) {
    this.condicionPrestamo = condicionPrestamo;
  }

  /**
   **/
  public PrestamoType diasMoraActual(Integer diasMoraActual) {
    this.diasMoraActual = diasMoraActual;
    return this;
  }

  
  @JsonProperty("diasMoraActual")
  public Integer getDiasMoraActual() {
    return diasMoraActual;
  }

  @JsonProperty("diasMoraActual")
  public void setDiasMoraActual(Integer diasMoraActual) {
    this.diasMoraActual = diasMoraActual;
  }

  /**
   **/
  public PrestamoType diasMoraMaxima(Integer diasMoraMaxima) {
    this.diasMoraMaxima = diasMoraMaxima;
    return this;
  }

  
  @JsonProperty("diasMoraMaxima")
  public Integer getDiasMoraMaxima() {
    return diasMoraMaxima;
  }

  @JsonProperty("diasMoraMaxima")
  public void setDiasMoraMaxima(Integer diasMoraMaxima) {
    this.diasMoraMaxima = diasMoraMaxima;
  }

  /**
   **/
  public PrestamoType diasMoraPromedio(Integer diasMoraPromedio) {
    this.diasMoraPromedio = diasMoraPromedio;
    return this;
  }

  
  @JsonProperty("diasMoraPromedio")
  public Integer getDiasMoraPromedio() {
    return diasMoraPromedio;
  }

  @JsonProperty("diasMoraPromedio")
  public void setDiasMoraPromedio(Integer diasMoraPromedio) {
    this.diasMoraPromedio = diasMoraPromedio;
  }

  /**
   **/
  public PrestamoType estadoActualPrestamo(String estadoActualPrestamo) {
    this.estadoActualPrestamo = estadoActualPrestamo;
    return this;
  }

  
  @JsonProperty("estadoActualPrestamo")
  public String getEstadoActualPrestamo() {
    return estadoActualPrestamo;
  }

  @JsonProperty("estadoActualPrestamo")
  public void setEstadoActualPrestamo(String estadoActualPrestamo) {
    this.estadoActualPrestamo = estadoActualPrestamo;
  }

  /**
   **/
  public PrestamoType fechaDesembolso(Date fechaDesembolso) {
    this.fechaDesembolso = fechaDesembolso;
    return this;
  }

  
  @JsonProperty("fechaDesembolso")
  public Date getFechaDesembolso() {
    return fechaDesembolso;
  }

  @JsonProperty("fechaDesembolso")
  public void setFechaDesembolso(Date fechaDesembolso) {
    this.fechaDesembolso = fechaDesembolso;
  }

  /**
   **/
  public PrestamoType fechaUltimoPago(Date fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
    return this;
  }

  
  @JsonProperty("fechaUltimoPago")
  public Date getFechaUltimoPago() {
    return fechaUltimoPago;
  }

  @JsonProperty("fechaUltimoPago")
  public void setFechaUltimoPago(Date fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
  }

  /**
   **/
  public PrestamoType montoDesembolsado(Float montoDesembolsado) {
    this.montoDesembolsado = montoDesembolsado;
    return this;
  }

  
  @JsonProperty("montoDesembolsado")
  public Float getMontoDesembolsado() {
    return montoDesembolsado;
  }

  @JsonProperty("montoDesembolsado")
  public void setMontoDesembolsado(Float montoDesembolsado) {
    this.montoDesembolsado = montoDesembolsado;
  }

  /**
   **/
  public PrestamoType numeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
    return this;
  }

  
  @JsonProperty("numeroCliente")
  public Integer getNumeroCliente() {
    return numeroCliente;
  }

  @JsonProperty("numeroCliente")
  public void setNumeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
  }

  /**
   **/
  public PrestamoType numeroPrestamo(String numeroPrestamo) {
    this.numeroPrestamo = numeroPrestamo;
    return this;
  }

  
  @JsonProperty("numeroPrestamo")
  public String getNumeroPrestamo() {
    return numeroPrestamo;
  }

  @JsonProperty("numeroPrestamo")
  public void setNumeroPrestamo(String numeroPrestamo) {
    this.numeroPrestamo = numeroPrestamo;
  }

  /**
   **/
  public PrestamoType plazo(Integer plazo) {
    this.plazo = plazo;
    return this;
  }

  
  @JsonProperty("plazo")
  public Integer getPlazo() {
    return plazo;
  }

  @JsonProperty("plazo")
  public void setPlazo(Integer plazo) {
    this.plazo = plazo;
  }

  /**
   **/
  public PrestamoType prestamoCondonado(String prestamoCondonado) {
    this.prestamoCondonado = prestamoCondonado;
    return this;
  }

  
  @JsonProperty("prestamoCondonado")
  public String getPrestamoCondonado() {
    return prestamoCondonado;
  }

  @JsonProperty("prestamoCondonado")
  public void setPrestamoCondonado(String prestamoCondonado) {
    this.prestamoCondonado = prestamoCondonado;
  }

  /**
   **/
  public PrestamoType prestamoDetallePagos(String prestamoDetallePagos) {
    this.prestamoDetallePagos = prestamoDetallePagos;
    return this;
  }

  
  @JsonProperty("prestamoDetallePagos")
  public String getPrestamoDetallePagos() {
    return prestamoDetallePagos;
  }

  @JsonProperty("prestamoDetallePagos")
  public void setPrestamoDetallePagos(String prestamoDetallePagos) {
    this.prestamoDetallePagos = prestamoDetallePagos;
  }

  /**
   **/
  public PrestamoType prestamoGarantia(String prestamoGarantia) {
    this.prestamoGarantia = prestamoGarantia;
    return this;
  }

  
  @JsonProperty("prestamoGarantia")
  public String getPrestamoGarantia() {
    return prestamoGarantia;
  }

  @JsonProperty("prestamoGarantia")
  public void setPrestamoGarantia(String prestamoGarantia) {
    this.prestamoGarantia = prestamoGarantia;
  }

  /**
   **/
  public PrestamoType prestamoOtroTitular(String prestamoOtroTitular) {
    this.prestamoOtroTitular = prestamoOtroTitular;
    return this;
  }

  
  @JsonProperty("prestamoOtroTitular")
  public String getPrestamoOtroTitular() {
    return prestamoOtroTitular;
  }

  @JsonProperty("prestamoOtroTitular")
  public void setPrestamoOtroTitular(String prestamoOtroTitular) {
    this.prestamoOtroTitular = prestamoOtroTitular;
  }

  /**
   **/
  public PrestamoType prestamoPlanDePagos(String prestamoPlanDePagos) {
    this.prestamoPlanDePagos = prestamoPlanDePagos;
    return this;
  }

  
  @JsonProperty("prestamoPlanDePagos")
  public String getPrestamoPlanDePagos() {
    return prestamoPlanDePagos;
  }

  @JsonProperty("prestamoPlanDePagos")
  public void setPrestamoPlanDePagos(String prestamoPlanDePagos) {
    this.prestamoPlanDePagos = prestamoPlanDePagos;
  }

  /**
   **/
  public PrestamoType prestamoPorPagar(String prestamoPorPagar) {
    this.prestamoPorPagar = prestamoPorPagar;
    return this;
  }

  
  @JsonProperty("prestamoPorPagar")
  public String getPrestamoPorPagar() {
    return prestamoPorPagar;
  }

  @JsonProperty("prestamoPorPagar")
  public void setPrestamoPorPagar(String prestamoPorPagar) {
    this.prestamoPorPagar = prestamoPorPagar;
  }

  /**
   **/
  public PrestamoType saldoActual(Float saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }

  
  @JsonProperty("saldoActual")
  public Float getSaldoActual() {
    return saldoActual;
  }

  @JsonProperty("saldoActual")
  public void setSaldoActual(Float saldoActual) {
    this.saldoActual = saldoActual;
  }

  /**
   **/
  public PrestamoType subProducto(SubProductoEnum subProducto) {
    this.subProducto = subProducto;
    return this;
  }

  
  @JsonProperty("subProducto")
  public SubProductoEnum getSubProducto() {
    return subProducto;
  }

  @JsonProperty("subProducto")
  public void setSubProducto(SubProductoEnum subProducto) {
    this.subProducto = subProducto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrestamoType prestamoType = (PrestamoType) o;
    return Objects.equals(this.condicionPrestamo, prestamoType.condicionPrestamo) &&
        Objects.equals(this.diasMoraActual, prestamoType.diasMoraActual) &&
        Objects.equals(this.diasMoraMaxima, prestamoType.diasMoraMaxima) &&
        Objects.equals(this.diasMoraPromedio, prestamoType.diasMoraPromedio) &&
        Objects.equals(this.estadoActualPrestamo, prestamoType.estadoActualPrestamo) &&
        Objects.equals(this.fechaDesembolso, prestamoType.fechaDesembolso) &&
        Objects.equals(this.fechaUltimoPago, prestamoType.fechaUltimoPago) &&
        Objects.equals(this.montoDesembolsado, prestamoType.montoDesembolsado) &&
        Objects.equals(this.numeroCliente, prestamoType.numeroCliente) &&
        Objects.equals(this.numeroPrestamo, prestamoType.numeroPrestamo) &&
        Objects.equals(this.plazo, prestamoType.plazo) &&
        Objects.equals(this.prestamoCondonado, prestamoType.prestamoCondonado) &&
        Objects.equals(this.prestamoDetallePagos, prestamoType.prestamoDetallePagos) &&
        Objects.equals(this.prestamoGarantia, prestamoType.prestamoGarantia) &&
        Objects.equals(this.prestamoOtroTitular, prestamoType.prestamoOtroTitular) &&
        Objects.equals(this.prestamoPlanDePagos, prestamoType.prestamoPlanDePagos) &&
        Objects.equals(this.prestamoPorPagar, prestamoType.prestamoPorPagar) &&
        Objects.equals(this.saldoActual, prestamoType.saldoActual) &&
        Objects.equals(this.subProducto, prestamoType.subProducto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condicionPrestamo, diasMoraActual, diasMoraMaxima, diasMoraPromedio, estadoActualPrestamo, fechaDesembolso, fechaUltimoPago, montoDesembolsado, numeroCliente, numeroPrestamo, plazo, prestamoCondonado, prestamoDetallePagos, prestamoGarantia, prestamoOtroTitular, prestamoPlanDePagos, prestamoPorPagar, saldoActual, subProducto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoType {\n");
    
    sb.append("    condicionPrestamo: ").append(toIndentedString(condicionPrestamo)).append("\n");
    sb.append("    diasMoraActual: ").append(toIndentedString(diasMoraActual)).append("\n");
    sb.append("    diasMoraMaxima: ").append(toIndentedString(diasMoraMaxima)).append("\n");
    sb.append("    diasMoraPromedio: ").append(toIndentedString(diasMoraPromedio)).append("\n");
    sb.append("    estadoActualPrestamo: ").append(toIndentedString(estadoActualPrestamo)).append("\n");
    sb.append("    fechaDesembolso: ").append(toIndentedString(fechaDesembolso)).append("\n");
    sb.append("    fechaUltimoPago: ").append(toIndentedString(fechaUltimoPago)).append("\n");
    sb.append("    montoDesembolsado: ").append(toIndentedString(montoDesembolsado)).append("\n");
    sb.append("    numeroCliente: ").append(toIndentedString(numeroCliente)).append("\n");
    sb.append("    numeroPrestamo: ").append(toIndentedString(numeroPrestamo)).append("\n");
    sb.append("    plazo: ").append(toIndentedString(plazo)).append("\n");
    sb.append("    prestamoCondonado: ").append(toIndentedString(prestamoCondonado)).append("\n");
    sb.append("    prestamoDetallePagos: ").append(toIndentedString(prestamoDetallePagos)).append("\n");
    sb.append("    prestamoGarantia: ").append(toIndentedString(prestamoGarantia)).append("\n");
    sb.append("    prestamoOtroTitular: ").append(toIndentedString(prestamoOtroTitular)).append("\n");
    sb.append("    prestamoPlanDePagos: ").append(toIndentedString(prestamoPlanDePagos)).append("\n");
    sb.append("    prestamoPorPagar: ").append(toIndentedString(prestamoPorPagar)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    subProducto: ").append(toIndentedString(subProducto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

