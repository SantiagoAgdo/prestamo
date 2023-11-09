package com.mibanco.prestamo.es.gen.type;

import com.mibanco.prestamo.es.gen.type.TipoDocumentoEnum;
import com.mibanco.prestamo.es.gen.type.TipoTitularEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoOtroTitularType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-09T17:27:24.039318-05:00[America/Bogota]")
public class PrestamoOtroTitularType   {
  private @Valid TipoDocumentoEnum tipoDocumento;
  private @Valid String numeroDocumento;
  private @Valid String primerNombre;
  private @Valid String segundoNombre;
  private @Valid String primerApellido;
  private @Valid String segundoApellido;
  private @Valid TipoTitularEnum tipoTitular;
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
  public PrestamoOtroTitularType primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

  
  @JsonProperty("primerNombre")
  public String getPrimerNombre() {
    return primerNombre;
  }

  @JsonProperty("primerNombre")
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  /**
   **/
  public PrestamoOtroTitularType segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }

  
  @JsonProperty("segundoNombre")
  public String getSegundoNombre() {
    return segundoNombre;
  }

  @JsonProperty("segundoNombre")
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  /**
   **/
  public PrestamoOtroTitularType primerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
    return this;
  }

  
  @JsonProperty("primerApellido")
  public String getPrimerApellido() {
    return primerApellido;
  }

  @JsonProperty("primerApellido")
  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  /**
   **/
  public PrestamoOtroTitularType segundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
    return this;
  }

  
  @JsonProperty("segundoApellido")
  public String getSegundoApellido() {
    return segundoApellido;
  }

  @JsonProperty("segundoApellido")
  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  /**
   **/
  public PrestamoOtroTitularType tipoTitular(TipoTitularEnum tipoTitular) {
    this.tipoTitular = tipoTitular;
    return this;
  }

  
  @JsonProperty("tipoTitular")
  public TipoTitularEnum getTipoTitular() {
    return tipoTitular;
  }

  @JsonProperty("tipoTitular")
  public void setTipoTitular(TipoTitularEnum tipoTitular) {
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
        Objects.equals(this.primerNombre, prestamoOtroTitularType.primerNombre) &&
        Objects.equals(this.segundoNombre, prestamoOtroTitularType.segundoNombre) &&
        Objects.equals(this.primerApellido, prestamoOtroTitularType.primerApellido) &&
        Objects.equals(this.segundoApellido, prestamoOtroTitularType.segundoApellido) &&
        Objects.equals(this.tipoTitular, prestamoOtroTitularType.tipoTitular) &&
        Objects.equals(this.numeroPrestamo, prestamoOtroTitularType.numeroPrestamo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido, tipoTitular, numeroPrestamo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoOtroTitularType {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    primerApellido: ").append(toIndentedString(primerApellido)).append("\n");
    sb.append("    segundoApellido: ").append(toIndentedString(segundoApellido)).append("\n");
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

