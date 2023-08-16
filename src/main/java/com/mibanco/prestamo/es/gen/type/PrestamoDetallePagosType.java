package com.mibanco.prestamo.es.gen.type;

import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoDetallePagosType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-16T15:24:23.496083-05:00[America/Bogota]")
public class PrestamoDetallePagosType   {
  private @Valid Date fechaPago = null;
  private @Valid Float valorPagado = null;
  private @Valid Float abonoACapital = null;
  private @Valid Float interesesCorrientes = null;
  private @Valid Float interesesMora = null;
  private @Valid Float seguroVida = null;
  private @Valid Float leyMipyme = null;
  private @Valid Float leyMipymeIVA = null;
  private @Valid Float cargoCobranza = null;
  private @Valid Float cobranzaIVA = null;
  private @Valid Float otros = null;
  private @Valid String numeroPrestamo;

  /**
   **/
  public PrestamoDetallePagosType fechaPago(Date fechaPago) {
    this.fechaPago = fechaPago;
    return this;
  }

  
  @JsonProperty("fechaPago")
  public Date getFechaPago() {
    return fechaPago;
  }

  @JsonProperty("fechaPago")
  public void setFechaPago(Date fechaPago) {
    this.fechaPago = fechaPago;
  }

  /**
   **/
  public PrestamoDetallePagosType valorPagado(Float valorPagado) {
    this.valorPagado = valorPagado;
    return this;
  }

  
  @JsonProperty("valorPagado")
  public Float getValorPagado() {
    return valorPagado;
  }

  @JsonProperty("valorPagado")
  public void setValorPagado(Float valorPagado) {
    this.valorPagado = valorPagado;
  }

  /**
   **/
  public PrestamoDetallePagosType abonoACapital(Float abonoACapital) {
    this.abonoACapital = abonoACapital;
    return this;
  }

  
  @JsonProperty("abonoACapital")
  public Float getAbonoACapital() {
    return abonoACapital;
  }

  @JsonProperty("abonoACapital")
  public void setAbonoACapital(Float abonoACapital) {
    this.abonoACapital = abonoACapital;
  }

  /**
   **/
  public PrestamoDetallePagosType interesesCorrientes(Float interesesCorrientes) {
    this.interesesCorrientes = interesesCorrientes;
    return this;
  }

  
  @JsonProperty("interesesCorrientes")
  public Float getInteresesCorrientes() {
    return interesesCorrientes;
  }

  @JsonProperty("interesesCorrientes")
  public void setInteresesCorrientes(Float interesesCorrientes) {
    this.interesesCorrientes = interesesCorrientes;
  }

  /**
   **/
  public PrestamoDetallePagosType interesesMora(Float interesesMora) {
    this.interesesMora = interesesMora;
    return this;
  }

  
  @JsonProperty("interesesMora")
  public Float getInteresesMora() {
    return interesesMora;
  }

  @JsonProperty("interesesMora")
  public void setInteresesMora(Float interesesMora) {
    this.interesesMora = interesesMora;
  }

  /**
   **/
  public PrestamoDetallePagosType seguroVida(Float seguroVida) {
    this.seguroVida = seguroVida;
    return this;
  }

  
  @JsonProperty("seguroVida")
  public Float getSeguroVida() {
    return seguroVida;
  }

  @JsonProperty("seguroVida")
  public void setSeguroVida(Float seguroVida) {
    this.seguroVida = seguroVida;
  }

  /**
   **/
  public PrestamoDetallePagosType leyMipyme(Float leyMipyme) {
    this.leyMipyme = leyMipyme;
    return this;
  }

  
  @JsonProperty("leyMipyme")
  public Float getLeyMipyme() {
    return leyMipyme;
  }

  @JsonProperty("leyMipyme")
  public void setLeyMipyme(Float leyMipyme) {
    this.leyMipyme = leyMipyme;
  }

  /**
   **/
  public PrestamoDetallePagosType leyMipymeIVA(Float leyMipymeIVA) {
    this.leyMipymeIVA = leyMipymeIVA;
    return this;
  }

  
  @JsonProperty("leyMipymeIVA")
  public Float getLeyMipymeIVA() {
    return leyMipymeIVA;
  }

  @JsonProperty("leyMipymeIVA")
  public void setLeyMipymeIVA(Float leyMipymeIVA) {
    this.leyMipymeIVA = leyMipymeIVA;
  }

  /**
   **/
  public PrestamoDetallePagosType cargoCobranza(Float cargoCobranza) {
    this.cargoCobranza = cargoCobranza;
    return this;
  }

  
  @JsonProperty("cargoCobranza")
  public Float getCargoCobranza() {
    return cargoCobranza;
  }

  @JsonProperty("cargoCobranza")
  public void setCargoCobranza(Float cargoCobranza) {
    this.cargoCobranza = cargoCobranza;
  }

  /**
   **/
  public PrestamoDetallePagosType cobranzaIVA(Float cobranzaIVA) {
    this.cobranzaIVA = cobranzaIVA;
    return this;
  }

  
  @JsonProperty("cobranzaIVA")
  public Float getCobranzaIVA() {
    return cobranzaIVA;
  }

  @JsonProperty("cobranzaIVA")
  public void setCobranzaIVA(Float cobranzaIVA) {
    this.cobranzaIVA = cobranzaIVA;
  }

  /**
   **/
  public PrestamoDetallePagosType otros(Float otros) {
    this.otros = otros;
    return this;
  }

  
  @JsonProperty("otros")
  public Float getOtros() {
    return otros;
  }

  @JsonProperty("otros")
  public void setOtros(Float otros) {
    this.otros = otros;
  }

  /**
   **/
  public PrestamoDetallePagosType numeroPrestamo(String numeroPrestamo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrestamoDetallePagosType prestamoDetallePagosType = (PrestamoDetallePagosType) o;
    return Objects.equals(this.fechaPago, prestamoDetallePagosType.fechaPago) &&
        Objects.equals(this.valorPagado, prestamoDetallePagosType.valorPagado) &&
        Objects.equals(this.abonoACapital, prestamoDetallePagosType.abonoACapital) &&
        Objects.equals(this.interesesCorrientes, prestamoDetallePagosType.interesesCorrientes) &&
        Objects.equals(this.interesesMora, prestamoDetallePagosType.interesesMora) &&
        Objects.equals(this.seguroVida, prestamoDetallePagosType.seguroVida) &&
        Objects.equals(this.leyMipyme, prestamoDetallePagosType.leyMipyme) &&
        Objects.equals(this.leyMipymeIVA, prestamoDetallePagosType.leyMipymeIVA) &&
        Objects.equals(this.cargoCobranza, prestamoDetallePagosType.cargoCobranza) &&
        Objects.equals(this.cobranzaIVA, prestamoDetallePagosType.cobranzaIVA) &&
        Objects.equals(this.otros, prestamoDetallePagosType.otros) &&
        Objects.equals(this.numeroPrestamo, prestamoDetallePagosType.numeroPrestamo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaPago, valorPagado, abonoACapital, interesesCorrientes, interesesMora, seguroVida, leyMipyme, leyMipymeIVA, cargoCobranza, cobranzaIVA, otros, numeroPrestamo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoDetallePagosType {\n");
    
    sb.append("    fechaPago: ").append(toIndentedString(fechaPago)).append("\n");
    sb.append("    valorPagado: ").append(toIndentedString(valorPagado)).append("\n");
    sb.append("    abonoACapital: ").append(toIndentedString(abonoACapital)).append("\n");
    sb.append("    interesesCorrientes: ").append(toIndentedString(interesesCorrientes)).append("\n");
    sb.append("    interesesMora: ").append(toIndentedString(interesesMora)).append("\n");
    sb.append("    seguroVida: ").append(toIndentedString(seguroVida)).append("\n");
    sb.append("    leyMipyme: ").append(toIndentedString(leyMipyme)).append("\n");
    sb.append("    leyMipymeIVA: ").append(toIndentedString(leyMipymeIVA)).append("\n");
    sb.append("    cargoCobranza: ").append(toIndentedString(cargoCobranza)).append("\n");
    sb.append("    cobranzaIVA: ").append(toIndentedString(cobranzaIVA)).append("\n");
    sb.append("    otros: ").append(toIndentedString(otros)).append("\n");
    sb.append("    numeroPrestamo: ").append(toIndentedString(numeroPrestamo)).append("\n");
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

