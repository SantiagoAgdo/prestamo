package com.mibanco.prestamo.es.gen.type;

import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoPorPagarType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-09-18T16:26:03.810482-05:00[America/Bogota]")
public class PrestamoPorPagarType   {
  private @Valid Integer numeroCuota;
  private @Valid Date fechaAPagar = null;
  private @Valid Float abonoACapital = null;
  private @Valid Float interesesCteBalance = null;
  private @Valid Float interesesCteContingente = null;
  private @Valid Float interesesMoraBalance = null;
  private @Valid Float interesesMoraContingente = null;
  private @Valid Float seguroVida = null;
  private @Valid Float seguroAdicional = null;
  private @Valid Float leyMipymeLeyMipymeIVA = null;
  private @Valid Float comisionComisionIVA = null;
  private @Valid Float GACGACIVA = null;
  private @Valid Float gastoExtraJudicialGastoExtraJudicialIVA = null;
  private @Valid Float gastoExtraDiferidoGastoExtraDiferidoIVA = null;
  private @Valid Float totalCuota = null;
  private @Valid String estado;
  private @Valid Date fechaPago = null;
  private @Valid Integer diasVencidos;
  private @Valid String numeroPrestamo;

  /**
   **/
  public PrestamoPorPagarType numeroCuota(Integer numeroCuota) {
    this.numeroCuota = numeroCuota;
    return this;
  }

  
  @JsonProperty("numeroCuota")
  public Integer getNumeroCuota() {
    return numeroCuota;
  }

  @JsonProperty("numeroCuota")
  public void setNumeroCuota(Integer numeroCuota) {
    this.numeroCuota = numeroCuota;
  }

  /**
   **/
  public PrestamoPorPagarType fechaAPagar(Date fechaAPagar) {
    this.fechaAPagar = fechaAPagar;
    return this;
  }

  
  @JsonProperty("fechaAPagar")
  public Date getFechaAPagar() {
    return fechaAPagar;
  }

  @JsonProperty("fechaAPagar")
  public void setFechaAPagar(Date fechaAPagar) {
    this.fechaAPagar = fechaAPagar;
  }

  /**
   **/
  public PrestamoPorPagarType abonoACapital(Float abonoACapital) {
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
  public PrestamoPorPagarType interesesCteBalance(Float interesesCteBalance) {
    this.interesesCteBalance = interesesCteBalance;
    return this;
  }

  
  @JsonProperty("interesesCteBalance")
  public Float getInteresesCteBalance() {
    return interesesCteBalance;
  }

  @JsonProperty("interesesCteBalance")
  public void setInteresesCteBalance(Float interesesCteBalance) {
    this.interesesCteBalance = interesesCteBalance;
  }

  /**
   **/
  public PrestamoPorPagarType interesesCteContingente(Float interesesCteContingente) {
    this.interesesCteContingente = interesesCteContingente;
    return this;
  }

  
  @JsonProperty("interesesCteContingente")
  public Float getInteresesCteContingente() {
    return interesesCteContingente;
  }

  @JsonProperty("interesesCteContingente")
  public void setInteresesCteContingente(Float interesesCteContingente) {
    this.interesesCteContingente = interesesCteContingente;
  }

  /**
   **/
  public PrestamoPorPagarType interesesMoraBalance(Float interesesMoraBalance) {
    this.interesesMoraBalance = interesesMoraBalance;
    return this;
  }

  
  @JsonProperty("interesesMoraBalance")
  public Float getInteresesMoraBalance() {
    return interesesMoraBalance;
  }

  @JsonProperty("interesesMoraBalance")
  public void setInteresesMoraBalance(Float interesesMoraBalance) {
    this.interesesMoraBalance = interesesMoraBalance;
  }

  /**
   **/
  public PrestamoPorPagarType interesesMoraContingente(Float interesesMoraContingente) {
    this.interesesMoraContingente = interesesMoraContingente;
    return this;
  }

  
  @JsonProperty("interesesMoraContingente")
  public Float getInteresesMoraContingente() {
    return interesesMoraContingente;
  }

  @JsonProperty("interesesMoraContingente")
  public void setInteresesMoraContingente(Float interesesMoraContingente) {
    this.interesesMoraContingente = interesesMoraContingente;
  }

  /**
   **/
  public PrestamoPorPagarType seguroVida(Float seguroVida) {
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
  public PrestamoPorPagarType seguroAdicional(Float seguroAdicional) {
    this.seguroAdicional = seguroAdicional;
    return this;
  }

  
  @JsonProperty("seguroAdicional")
  public Float getSeguroAdicional() {
    return seguroAdicional;
  }

  @JsonProperty("seguroAdicional")
  public void setSeguroAdicional(Float seguroAdicional) {
    this.seguroAdicional = seguroAdicional;
  }

  /**
   **/
  public PrestamoPorPagarType leyMipymeLeyMipymeIVA(Float leyMipymeLeyMipymeIVA) {
    this.leyMipymeLeyMipymeIVA = leyMipymeLeyMipymeIVA;
    return this;
  }

  
  @JsonProperty("leyMipymeLeyMipymeIVA")
  public Float getLeyMipymeLeyMipymeIVA() {
    return leyMipymeLeyMipymeIVA;
  }

  @JsonProperty("leyMipymeLeyMipymeIVA")
  public void setLeyMipymeLeyMipymeIVA(Float leyMipymeLeyMipymeIVA) {
    this.leyMipymeLeyMipymeIVA = leyMipymeLeyMipymeIVA;
  }

  /**
   **/
  public PrestamoPorPagarType comisionComisionIVA(Float comisionComisionIVA) {
    this.comisionComisionIVA = comisionComisionIVA;
    return this;
  }


    @JsonProperty("comisionComisionIVA")
  public Float getComisionComisionIVA() {
    return comisionComisionIVA;
  }

  @JsonProperty("comisionComisionIVA")
  public void setComisionComisionIVA(Float comisionComisionIVA) {
    this.comisionComisionIVA = comisionComisionIVA;
  }

  /**
   **/
  public PrestamoPorPagarType GACGACIVA(Float GACGACIVA) {
    this.GACGACIVA = GACGACIVA;
    return this;
  }

  
  @JsonProperty("GACGACIVA")
  public Float getGACGACIVA() {
    return GACGACIVA;
  }

  @JsonProperty("GACGACIVA")
  public void setGACGACIVA(Float GACGACIVA) {
    this.GACGACIVA = GACGACIVA;
  }

  /**
   **/
  public PrestamoPorPagarType gastoExtraJudicialGastoExtraJudicialIVA(Float gastoExtraJudicialGastoExtraJudicialIVA) {
    this.gastoExtraJudicialGastoExtraJudicialIVA = gastoExtraJudicialGastoExtraJudicialIVA;
    return this;
  }

  
  @JsonProperty("gastoExtraJudicialGastoExtraJudicialIVA")
  public Float getGastoExtraJudicialGastoExtraJudicialIVA() {
    return gastoExtraJudicialGastoExtraJudicialIVA;
  }

  @JsonProperty("gastoExtraJudicialGastoExtraJudicialIVA")
  public void setGastoExtraJudicialGastoExtraJudicialIVA(Float gastoExtraJudicialGastoExtraJudicialIVA) {
    this.gastoExtraJudicialGastoExtraJudicialIVA = gastoExtraJudicialGastoExtraJudicialIVA;
  }

  /**
   **/
  public PrestamoPorPagarType gastoExtraDiferidoGastoExtraDiferidoIVA(Float gastoExtraDiferidoGastoExtraDiferidoIVA) {
    this.gastoExtraDiferidoGastoExtraDiferidoIVA = gastoExtraDiferidoGastoExtraDiferidoIVA;
    return this;
  }

  
  @JsonProperty("gastoExtraDiferidoGastoExtraDiferidoIVA")
  public Float getGastoExtraDiferidoGastoExtraDiferidoIVA() {
    return gastoExtraDiferidoGastoExtraDiferidoIVA;
  }

  @JsonProperty("gastoExtraDiferidoGastoExtraDiferidoIVA")
  public void setGastoExtraDiferidoGastoExtraDiferidoIVA(Float gastoExtraDiferidoGastoExtraDiferidoIVA) {
    this.gastoExtraDiferidoGastoExtraDiferidoIVA = gastoExtraDiferidoGastoExtraDiferidoIVA;
  }

  /**
   **/
  public PrestamoPorPagarType totalCuota(Float totalCuota) {
    this.totalCuota = totalCuota;
    return this;
  }

  
  @JsonProperty("totalCuota")
  public Float getTotalCuota() {
    return totalCuota;
  }

  @JsonProperty("totalCuota")
  public void setTotalCuota(Float totalCuota) {
    this.totalCuota = totalCuota;
  }

  /**
   **/
  public PrestamoPorPagarType estado(String estado) {
    this.estado = estado;
    return this;
  }

  
  @JsonProperty("estado")
  public String getEstado() {
    return estado;
  }

  @JsonProperty("estado")
  public void setEstado(String estado) {
    this.estado = estado;
  }

  /**
   **/
  public PrestamoPorPagarType fechaPago(Date fechaPago) {
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
  public PrestamoPorPagarType diasVencidos(Integer diasVencidos) {
    this.diasVencidos = diasVencidos;
    return this;
  }

  
  @JsonProperty("diasVencidos")
  public Integer getDiasVencidos() {
    return diasVencidos;
  }

  @JsonProperty("diasVencidos")
  public void setDiasVencidos(Integer diasVencidos) {
    this.diasVencidos = diasVencidos;
  }

  /**
   **/
  public PrestamoPorPagarType numeroPrestamo(String numeroPrestamo) {
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
    PrestamoPorPagarType prestamoPorPagarType = (PrestamoPorPagarType) o;
      return Objects.equals(this.numeroCuota, prestamoPorPagarType.numeroCuota) &&
              Objects.equals(this.fechaAPagar, prestamoPorPagarType.fechaAPagar) &&
              Objects.equals(this.abonoACapital, prestamoPorPagarType.abonoACapital) &&
              Objects.equals(this.interesesCteBalance, prestamoPorPagarType.interesesCteBalance) &&
              Objects.equals(this.interesesCteContingente, prestamoPorPagarType.interesesCteContingente) &&
              Objects.equals(this.interesesMoraBalance, prestamoPorPagarType.interesesMoraBalance) &&
              Objects.equals(this.interesesMoraContingente, prestamoPorPagarType.interesesMoraContingente) &&
              Objects.equals(this.seguroVida, prestamoPorPagarType.seguroVida) &&
              Objects.equals(this.seguroAdicional, prestamoPorPagarType.seguroAdicional) &&
              Objects.equals(this.leyMipymeLeyMipymeIVA, prestamoPorPagarType.leyMipymeLeyMipymeIVA) &&
              Objects.equals(this.comisionComisionIVA, prestamoPorPagarType.comisionComisionIVA) &&
              Objects.equals(this.GACGACIVA, prestamoPorPagarType.GACGACIVA) &&
              Objects.equals(this.gastoExtraJudicialGastoExtraJudicialIVA, prestamoPorPagarType.gastoExtraJudicialGastoExtraJudicialIVA) &&
              Objects.equals(this.gastoExtraDiferidoGastoExtraDiferidoIVA, prestamoPorPagarType.gastoExtraDiferidoGastoExtraDiferidoIVA) &&
              Objects.equals(this.totalCuota, prestamoPorPagarType.totalCuota) &&
              Objects.equals(this.estado, prestamoPorPagarType.estado) &&
              Objects.equals(this.fechaPago, prestamoPorPagarType.fechaPago) &&
              Objects.equals(this.diasVencidos, prestamoPorPagarType.diasVencidos) &&
              Objects.equals(this.numeroPrestamo, prestamoPorPagarType.numeroPrestamo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCuota, fechaAPagar, abonoACapital, interesesCteBalance, interesesCteContingente, interesesMoraBalance, interesesMoraContingente, seguroVida, seguroAdicional, leyMipymeLeyMipymeIVA, comisionComisionIVA, GACGACIVA, gastoExtraJudicialGastoExtraJudicialIVA, gastoExtraDiferidoGastoExtraDiferidoIVA, totalCuota, estado, fechaPago, diasVencidos, numeroPrestamo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoPorPagarType {\n");
    
    sb.append("    numeroCuota: ").append(toIndentedString(numeroCuota)).append("\n");
    sb.append("    fechaAPagar: ").append(toIndentedString(fechaAPagar)).append("\n");
    sb.append("    abonoACapital: ").append(toIndentedString(abonoACapital)).append("\n");
    sb.append("    interesesCteBalance: ").append(toIndentedString(interesesCteBalance)).append("\n");
    sb.append("    interesesCteContingente: ").append(toIndentedString(interesesCteContingente)).append("\n");
    sb.append("    interesesMoraBalance: ").append(toIndentedString(interesesMoraBalance)).append("\n");
    sb.append("    interesesMoraContingente: ").append(toIndentedString(interesesMoraContingente)).append("\n");
    sb.append("    seguroVida: ").append(toIndentedString(seguroVida)).append("\n");
    sb.append("    seguroAdicional: ").append(toIndentedString(seguroAdicional)).append("\n");
    sb.append("    leyMipymeLeyMipymeIVA: ").append(toIndentedString(leyMipymeLeyMipymeIVA)).append("\n");
    sb.append("    comisionComisionIVA: ").append(toIndentedString(comisionComisionIVA)).append("\n");
    sb.append("    GACGACIVA: ").append(toIndentedString(GACGACIVA)).append("\n");
    sb.append("    gastoExtraJudicialGastoExtraJudicialIVA: ").append(toIndentedString(gastoExtraJudicialGastoExtraJudicialIVA)).append("\n");
    sb.append("    gastoExtraDiferidoGastoExtraDiferidoIVA: ").append(toIndentedString(gastoExtraDiferidoGastoExtraDiferidoIVA)).append("\n");
    sb.append("    totalCuota: ").append(toIndentedString(totalCuota)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    fechaPago: ").append(toIndentedString(fechaPago)).append("\n");
    sb.append("    diasVencidos: ").append(toIndentedString(diasVencidos)).append("\n");
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

