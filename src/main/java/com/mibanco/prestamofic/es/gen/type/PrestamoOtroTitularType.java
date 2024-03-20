package com.mibanco.prestamofic.es.gen.type;

import com.mibanco.prestamofic.es.gen.type.TipoDocumentoEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoOtroTitularType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-02-29T15:14:27.555253800-05:00[America/Bogota]")
public class PrestamoOtroTitularType   {
  private @Valid TipoDocumentoEnum tipoDocumento;
  private @Valid String numeroDocumento;
  private @Valid String nombre;
  private @Valid String tipoTitular;
  private @Valid String numeroPrestamo;

  /**
   **/
  public PrestamoOtroTitularType tipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  
  @JsonProperty("tipoDocumento")
  public TipoDocumentoEnum getTipoDocumento() {
    return tipoDocumento;
  }

  @JsonProperty("tipoDocumento")
  public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   **/
  public PrestamoOtroTitularType numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

  
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  @JsonProperty("numeroDocumento")
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   **/
  public PrestamoOtroTitularType nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  
  @JsonProperty("nombre")
  public String getNombre() {
    return nombre;
  }

  @JsonProperty("nombre")
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   **/
  public PrestamoOtroTitularType tipoTitular(String tipoTitular) {
    this.tipoTitular = tipoTitular;
    return this;
  }

  
  @JsonProperty("tipoTitular")
  public String getTipoTitular() {
    return tipoTitular;
  }

  @JsonProperty("tipoTitular")
  public void setTipoTitular(String tipoTitular) {
    this.tipoTitular = tipoTitular;
  }

  /**
   **/
  public PrestamoOtroTitularType numeroPrestamo(String numeroPrestamo) {
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
    PrestamoOtroTitularType prestamoOtroTitularType = (PrestamoOtroTitularType) o;
    return Objects.equals(this.tipoDocumento, prestamoOtroTitularType.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, prestamoOtroTitularType.numeroDocumento) &&
        Objects.equals(this.nombre, prestamoOtroTitularType.nombre) &&
        Objects.equals(this.tipoTitular, prestamoOtroTitularType.tipoTitular) &&
        Objects.equals(this.numeroPrestamo, prestamoOtroTitularType.numeroPrestamo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, numeroDocumento, nombre, tipoTitular, numeroPrestamo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoOtroTitularType {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    tipoTitular: ").append(toIndentedString(tipoTitular)).append("\n");
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

