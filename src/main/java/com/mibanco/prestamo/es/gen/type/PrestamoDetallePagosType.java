package com.mibanco.prestamo.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoDetallePagosType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-10-13T10:47:48.102674-05:00[America/Bogota]")
public class PrestamoDetallePagosType {
  private @Valid String fechaPago;
  private @Valid Integer valorPagado;
  private @Valid Integer abonoACapital;
  private @Valid Integer interesesCorrientes;
  private @Valid Integer interesesMora;
  private @Valid Integer seguroVida;
  private @Valid Integer leyMipyme;
  private @Valid Integer leyMipymeIVA;
  private @Valid Integer cargoCobranza;
  private @Valid Integer cobranzaIVA;
  private @Valid Integer otros;
  private @Valid String numeroPrestamo;

  /**
   *
   **/
  public PrestamoDetallePagosType fechaPago(String fechaPago) {
    this.fechaPago = fechaPago;
    return this;
  }


  @JsonProperty("fechaPago")
  public String getFechaPago() {
    return fechaPago;
  }

  @JsonProperty("fechaPago")
  public void setFechaPago(String fechaPago) {
    this.fechaPago = fechaPago;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType valorPagado(Integer valorPagado) {
    this.valorPagado = valorPagado;
    return this;
  }


  @JsonProperty("valorPagado")
  public Integer getValorPagado() {
    return valorPagado;
  }

  @JsonProperty("valorPagado")
  public void setValorPagado(Integer valorPagado) {
    this.valorPagado = valorPagado;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType abonoACapital(Integer abonoACapital) {
    this.abonoACapital = abonoACapital;
    return this;
  }


  @JsonProperty("abonoACapital")
  public Integer getAbonoACapital() {
    return abonoACapital;
  }

  @JsonProperty("abonoACapital")
  public void setAbonoACapital(Integer abonoACapital) {
    this.abonoACapital = abonoACapital;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType interesesCorrientes(Integer interesesCorrientes) {
    this.interesesCorrientes = interesesCorrientes;
    return this;
  }


  @JsonProperty("interesesCorrientes")
  public Integer getInteresesCorrientes() {
    return interesesCorrientes;
  }

  @JsonProperty("interesesCorrientes")
  public void setInteresesCorrientes(Integer interesesCorrientes) {
    this.interesesCorrientes = interesesCorrientes;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType interesesMora(Integer interesesMora) {
    this.interesesMora = interesesMora;
    return this;
  }


  @JsonProperty("interesesMora")
  public Integer getInteresesMora() {
    return interesesMora;
  }

  @JsonProperty("interesesMora")
  public void setInteresesMora(Integer interesesMora) {
    this.interesesMora = interesesMora;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType seguroVida(Integer seguroVida) {
    this.seguroVida = seguroVida;
    return this;
  }


  @JsonProperty("seguroVida")
  public Integer getSeguroVida() {
    return seguroVida;
  }

  @JsonProperty("seguroVida")
  public void setSeguroVida(Integer seguroVida) {
    this.seguroVida = seguroVida;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType leyMipyme(Integer leyMipyme) {
    this.leyMipyme = leyMipyme;
    return this;
  }


  @JsonProperty("leyMipyme")
  public Integer getLeyMipyme() {
    return leyMipyme;
  }

  @JsonProperty("leyMipyme")
  public void setLeyMipyme(Integer leyMipyme) {
    this.leyMipyme = leyMipyme;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType leyMipymeIVA(Integer leyMipymeIVA) {
    this.leyMipymeIVA = leyMipymeIVA;
    return this;
  }


  @JsonProperty("leyMipymeIVA")
  public Integer getLeyMipymeIVA() {
    return leyMipymeIVA;
  }

  @JsonProperty("leyMipymeIVA")
  public void setLeyMipymeIVA(Integer leyMipymeIVA) {
    this.leyMipymeIVA = leyMipymeIVA;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType cargoCobranza(Integer cargoCobranza) {
    this.cargoCobranza = cargoCobranza;
    return this;
  }


  @JsonProperty("cargoCobranza")
  public Integer getCargoCobranza() {
    return cargoCobranza;
  }

  @JsonProperty("cargoCobranza")
  public void setCargoCobranza(Integer cargoCobranza) {
    this.cargoCobranza = cargoCobranza;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType cobranzaIVA(Integer cobranzaIVA) {
    this.cobranzaIVA = cobranzaIVA;
    return this;
  }


  @JsonProperty("cobranzaIVA")
  public Integer getCobranzaIVA() {
    return cobranzaIVA;
  }

  @JsonProperty("cobranzaIVA")
  public void setCobranzaIVA(Integer cobranzaIVA) {
    this.cobranzaIVA = cobranzaIVA;
  }

  /**
   *
   **/
  public PrestamoDetallePagosType otros(Integer otros) {
    this.otros = otros;
    return this;
  }


  @JsonProperty("otros")
  public Integer getOtros() {
    return otros;
  }

  @JsonProperty("otros")
  public void setOtros(Integer otros) {
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

