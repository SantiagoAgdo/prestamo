package com.mibanco.prestamo.es.gen.type;

import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoPlanDePagosType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-08T16:33:35.542898-05:00[America/Bogota]")
public class PrestamoPlanDePagosType   {
  private @Valid Integer numeroCuota;
  private @Valid Date fechaAPagar = null;
  private @Valid Float abonoACapital = null;
  private @Valid Float intereses = null;
  private @Valid Float otrosCargos = null;
  private @Valid Float totalCuota = null;
  private @Valid Float saldo = null;
  private @Valid String estado;
  private @Valid Integer diasVencidos;
  private @Valid Date fechaPago = null;
  private @Valid Float montoPagado = null;
  private @Valid String prestamoPlanDePagosOtroCargo;
  private @Valid String numeroPrestamo;

  /**
   **/
  public PrestamoPlanDePagosType numeroCuota(Integer numeroCuota) {
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
  public PrestamoPlanDePagosType fechaAPagar(Date fechaAPagar) {
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
  public PrestamoPlanDePagosType abonoACapital(Float abonoACapital) {
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
  public PrestamoPlanDePagosType intereses(Float intereses) {
    this.intereses = intereses;
    return this;
  }

  
  @JsonProperty("intereses")
  public Float getIntereses() {
    return intereses;
  }

  @JsonProperty("intereses")
  public void setIntereses(Float intereses) {
    this.intereses = intereses;
  }

  /**
   **/
  public PrestamoPlanDePagosType otrosCargos(Float otrosCargos) {
    this.otrosCargos = otrosCargos;
    return this;
  }

  
  @JsonProperty("otrosCargos")
  public Float getOtrosCargos() {
    return otrosCargos;
  }

  @JsonProperty("otrosCargos")
  public void setOtrosCargos(Float otrosCargos) {
    this.otrosCargos = otrosCargos;
  }

  /**
   **/
  public PrestamoPlanDePagosType totalCuota(Float totalCuota) {
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
  public PrestamoPlanDePagosType saldo(Float saldo) {
    this.saldo = saldo;
    return this;
  }

  
  @JsonProperty("saldo")
  public Float getSaldo() {
    return saldo;
  }

  @JsonProperty("saldo")
  public void setSaldo(Float saldo) {
    this.saldo = saldo;
  }

  /**
   **/
  public PrestamoPlanDePagosType estado(String estado) {
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
  public PrestamoPlanDePagosType diasVencidos(Integer diasVencidos) {
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
  public PrestamoPlanDePagosType fechaPago(Date fechaPago) {
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
  public PrestamoPlanDePagosType montoPagado(Float montoPagado) {
    this.montoPagado = montoPagado;
    return this;
  }

  
  @JsonProperty("montoPagado")
  public Float getMontoPagado() {
    return montoPagado;
  }

  @JsonProperty("montoPagado")
  public void setMontoPagado(Float montoPagado) {
    this.montoPagado = montoPagado;
  }

  /**
   **/
  public PrestamoPlanDePagosType prestamoPlanDePagosOtroCargo(String prestamoPlanDePagosOtroCargo) {
    this.prestamoPlanDePagosOtroCargo = prestamoPlanDePagosOtroCargo;
    return this;
  }

  
  @JsonProperty("prestamoPlanDePagosOtroCargo")
  public String getPrestamoPlanDePagosOtroCargo() {
    return prestamoPlanDePagosOtroCargo;
  }

  @JsonProperty("prestamoPlanDePagosOtroCargo")
  public void setPrestamoPlanDePagosOtroCargo(String prestamoPlanDePagosOtroCargo) {
    this.prestamoPlanDePagosOtroCargo = prestamoPlanDePagosOtroCargo;
  }

  /**
   **/
  public PrestamoPlanDePagosType numeroPrestamo(String numeroPrestamo) {
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
    PrestamoPlanDePagosType prestamoPlanDePagosType = (PrestamoPlanDePagosType) o;
    return Objects.equals(this.numeroCuota, prestamoPlanDePagosType.numeroCuota) &&
        Objects.equals(this.fechaAPagar, prestamoPlanDePagosType.fechaAPagar) &&
        Objects.equals(this.abonoACapital, prestamoPlanDePagosType.abonoACapital) &&
        Objects.equals(this.intereses, prestamoPlanDePagosType.intereses) &&
        Objects.equals(this.otrosCargos, prestamoPlanDePagosType.otrosCargos) &&
        Objects.equals(this.totalCuota, prestamoPlanDePagosType.totalCuota) &&
        Objects.equals(this.saldo, prestamoPlanDePagosType.saldo) &&
        Objects.equals(this.estado, prestamoPlanDePagosType.estado) &&
        Objects.equals(this.diasVencidos, prestamoPlanDePagosType.diasVencidos) &&
        Objects.equals(this.fechaPago, prestamoPlanDePagosType.fechaPago) &&
        Objects.equals(this.montoPagado, prestamoPlanDePagosType.montoPagado) &&
        Objects.equals(this.prestamoPlanDePagosOtroCargo, prestamoPlanDePagosType.prestamoPlanDePagosOtroCargo) &&
        Objects.equals(this.numeroPrestamo, prestamoPlanDePagosType.numeroPrestamo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCuota, fechaAPagar, abonoACapital, intereses, otrosCargos, totalCuota, saldo, estado, diasVencidos, fechaPago, montoPagado, prestamoPlanDePagosOtroCargo, numeroPrestamo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoPlanDePagosType {\n");
    
    sb.append("    numeroCuota: ").append(toIndentedString(numeroCuota)).append("\n");
    sb.append("    fechaAPagar: ").append(toIndentedString(fechaAPagar)).append("\n");
    sb.append("    abonoACapital: ").append(toIndentedString(abonoACapital)).append("\n");
    sb.append("    intereses: ").append(toIndentedString(intereses)).append("\n");
    sb.append("    otrosCargos: ").append(toIndentedString(otrosCargos)).append("\n");
    sb.append("    totalCuota: ").append(toIndentedString(totalCuota)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    diasVencidos: ").append(toIndentedString(diasVencidos)).append("\n");
    sb.append("    fechaPago: ").append(toIndentedString(fechaPago)).append("\n");
    sb.append("    montoPagado: ").append(toIndentedString(montoPagado)).append("\n");
    sb.append("    prestamoPlanDePagosOtroCargo: ").append(toIndentedString(prestamoPlanDePagosOtroCargo)).append("\n");
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

