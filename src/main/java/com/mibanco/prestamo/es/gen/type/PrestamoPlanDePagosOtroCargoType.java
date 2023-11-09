package com.mibanco.prestamo.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoPlanDePagosOtroCargoType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-09T17:27:24.039318-05:00[America/Bogota]")
public class PrestamoPlanDePagosOtroCargoType {
    private @Valid String numeroPrestamo;
    private @Valid Integer valor;
    private @Valid String descripcionCargo;

    /**
     *
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
     *
     **/
    public PrestamoPlanDePagosOtroCargoType valor(Integer valor) {
        this.valor = valor;
        return this;
    }


    @JsonProperty("valor")
    public Integer getValor() {
        return valor;
    }

    @JsonProperty("valor")
    public void setValor(Integer valor) {
        this.valor = valor;
    }

    /**
     *
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrestamoPlanDePagosOtroCargoType prestamoPlanDePagosOtroCargoType = (PrestamoPlanDePagosOtroCargoType) o;
        return Objects.equals(this.numeroPrestamo, prestamoPlanDePagosOtroCargoType.numeroPrestamo) &&
                Objects.equals(this.valor, prestamoPlanDePagosOtroCargoType.valor) &&
                Objects.equals(this.descripcionCargo, prestamoPlanDePagosOtroCargoType.descripcionCargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPrestamo, valor, descripcionCargo);
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PrestamoPlanDePagosOtroCargoType {\n");

      sb.append("    numeroPrestamo: ").append(toIndentedString(numeroPrestamo)).append("\n");
      sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
      sb.append("    descripcionCargo: ").append(toIndentedString(descripcionCargo)).append("\n");
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

