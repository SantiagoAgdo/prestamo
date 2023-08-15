package com.mibanco.prestamo.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoPlanDePagosOtroCargoType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-15T17:12:32.457853-05:00[America/Bogota]")
public class PrestamoPlanDePagosOtroCargoType   {
  private @Valid String descripcionCargo;
  private @Valid Float valor = null;
  private @Valid String numeroPrestamo;
  private @Valid Integer numeroCuota;

  /**
   **/
  public PrestamoPlanDePagosOtroCargoType descripcionCargo(String descripcionCargo) {
    this.descripcionCargo = descripcionCargo;
    return this;
  }

  
  @JsonProperty("descripcionCargo")
  public String getDescripcionCargo() {
    return descripcionCargo;
  }

  @JsonProperty("descripcionCargo")
  public void setDescripcionCargo(String descripcionCargo) {
    this.descripcionCargo = descripcionCargo;
  }

  /**
   **/
  public PrestamoPlanDePagosOtroCargoType valor(Float valor) {
    this.valor = valor;
    return this;
  }

  
  @JsonProperty("valor")
  public Float getValor() {
    return valor;
  }

  @JsonProperty("valor")
  public void setValor(Float valor) {
    this.valor = valor;
  }

  /**
   **/
  public PrestamoPlanDePagosOtroCargoType numeroPrestamo(String numeroPrestamo) {
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
  public PrestamoPlanDePagosOtroCargoType numeroCuota(Integer numeroCuota) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrestamoPlanDePagosOtroCargoType prestamoPlanDePagosOtroCargoType = (PrestamoPlanDePagosOtroCargoType) o;
    return Objects.equals(this.descripcionCargo, prestamoPlanDePagosOtroCargoType.descripcionCargo) &&
        Objects.equals(this.valor, prestamoPlanDePagosOtroCargoType.valor) &&
        Objects.equals(this.numeroPrestamo, prestamoPlanDePagosOtroCargoType.numeroPrestamo) &&
        Objects.equals(this.numeroCuota, prestamoPlanDePagosOtroCargoType.numeroCuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descripcionCargo, valor, numeroPrestamo, numeroCuota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoPlanDePagosOtroCargoType {\n");
    
    sb.append("    descripcionCargo: ").append(toIndentedString(descripcionCargo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    numeroPrestamo: ").append(toIndentedString(numeroPrestamo)).append("\n");
    sb.append("    numeroCuota: ").append(toIndentedString(numeroCuota)).append("\n");
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

