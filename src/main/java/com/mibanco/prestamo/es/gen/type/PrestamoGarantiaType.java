package com.mibanco.prestamo.es.gen.type;

import com.mibanco.prestamo.es.gen.type.TipoGarantiaEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoGarantiaType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-08-15T17:12:32.457853-05:00[America/Bogota]")
public class PrestamoGarantiaType   {
  private @Valid TipoGarantiaEnum tipoGarantia;
  private @Valid String subtipoGarantia;
  private @Valid Float avaluo = null;
  private @Valid String referencia;
  private @Valid String numeroPrestamo;

  /**
   **/
  public PrestamoGarantiaType tipoGarantia(TipoGarantiaEnum tipoGarantia) {
    this.tipoGarantia = tipoGarantia;
    return this;
  }

  
  @JsonProperty("tipoGarantia")
  public TipoGarantiaEnum getTipoGarantia() {
    return tipoGarantia;
  }

  @JsonProperty("tipoGarantia")
  public void setTipoGarantia(TipoGarantiaEnum tipoGarantia) {
    this.tipoGarantia = tipoGarantia;
  }

  /**
   **/
  public PrestamoGarantiaType subtipoGarantia(String subtipoGarantia) {
    this.subtipoGarantia = subtipoGarantia;
    return this;
  }

  
  @JsonProperty("SubtipoGarantia")
  public String getSubtipoGarantia() {
    return subtipoGarantia;
  }

  @JsonProperty("SubtipoGarantia")
  public void setSubtipoGarantia(String subtipoGarantia) {
    this.subtipoGarantia = subtipoGarantia;
  }

  /**
   **/
  public PrestamoGarantiaType avaluo(Float avaluo) {
    this.avaluo = avaluo;
    return this;
  }

  
  @JsonProperty("avaluo")
  public Float getAvaluo() {
    return avaluo;
  }

  @JsonProperty("avaluo")
  public void setAvaluo(Float avaluo) {
    this.avaluo = avaluo;
  }

  /**
   **/
  public PrestamoGarantiaType referencia(String referencia) {
    this.referencia = referencia;
    return this;
  }

  
  @JsonProperty("referencia")
  public String getReferencia() {
    return referencia;
  }

  @JsonProperty("referencia")
  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  /**
   **/
  public PrestamoGarantiaType numeroPrestamo(String numeroPrestamo) {
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
    PrestamoGarantiaType prestamoGarantiaType = (PrestamoGarantiaType) o;
    return Objects.equals(this.tipoGarantia, prestamoGarantiaType.tipoGarantia) &&
        Objects.equals(this.subtipoGarantia, prestamoGarantiaType.subtipoGarantia) &&
        Objects.equals(this.avaluo, prestamoGarantiaType.avaluo) &&
        Objects.equals(this.referencia, prestamoGarantiaType.referencia) &&
        Objects.equals(this.numeroPrestamo, prestamoGarantiaType.numeroPrestamo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoGarantia, subtipoGarantia, avaluo, referencia, numeroPrestamo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrestamoGarantiaType {\n");
    
    sb.append("    tipoGarantia: ").append(toIndentedString(tipoGarantia)).append("\n");
    sb.append("    subtipoGarantia: ").append(toIndentedString(subtipoGarantia)).append("\n");
    sb.append("    avaluo: ").append(toIndentedString(avaluo)).append("\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
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

