package com.mibanco.prestamo.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PrestamoCondonadoType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-09T17:27:24.039318-05:00[America/Bogota]")
public class PrestamoCondonadoType {
    private @Valid Integer abonoACapital;
    private @Valid Integer comisionComisionIVA;
    private @Valid Integer diasVencidos;
    private @Valid String estado;
    private @Valid String fechaAPagar;
    private @Valid String fechaPago;
    private @Valid Integer GACGACIVA;
    private @Valid Integer gastoExtraDiferidoGastoExtraDiferidoIVA;
    private @Valid Integer gastoExtraJudicialGastoExtraJudicialIVA;
    private @Valid Integer interesesCteBalance;
    private @Valid Integer interesesCteContingente;
    private @Valid Integer interesesMoraBalance;
    private @Valid Integer interesesMoraContingente;
    private @Valid Integer leyMipymeLeyMipymeIVA;
    private @Valid Integer numeroCuota;
    private @Valid String numeroPrestamo;
    private @Valid Integer otrosGastos;
    private @Valid Integer otrosGastosIVA;
    private @Valid Integer seguroAdicional;
    private @Valid Integer seguroVida;
    private @Valid Integer totalCuota;

    /**
     *
     **/
    public PrestamoCondonadoType abonoACapital(Integer abonoACapital) {
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
    public PrestamoCondonadoType comisionComisionIVA(Integer comisionComisionIVA) {
        this.comisionComisionIVA = comisionComisionIVA;
        return this;
    }


    @JsonProperty("comisionComisionIVA")
    public Integer getComisionComisionIVA() {
        return comisionComisionIVA;
    }

    @JsonProperty("comisionComisionIVA")
    public void setComisionComisionIVA(Integer comisionComisionIVA) {
        this.comisionComisionIVA = comisionComisionIVA;
    }

    /**
   **/
  public PrestamoCondonadoType diasVencidos(Integer diasVencidos) {
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
  public PrestamoCondonadoType estado(String estado) {
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
     *
     **/
    public PrestamoCondonadoType fechaAPagar(String fechaAPagar) {
        this.fechaAPagar = fechaAPagar;
        return this;
    }


    @JsonProperty("fechaAPagar")
    public String getFechaAPagar() {
        return fechaAPagar;
    }

    @JsonProperty("fechaAPagar")
    public void setFechaAPagar(String fechaAPagar) {
        this.fechaAPagar = fechaAPagar;
    }

    /**
     *
     **/
    public PrestamoCondonadoType fechaPago(String fechaPago) {
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
    public PrestamoCondonadoType GACGACIVA(Integer GACGACIVA) {
        this.GACGACIVA = GACGACIVA;
        return this;
    }


    @JsonProperty("GACGACIVA")
    public Integer getGACGACIVA() {
        return GACGACIVA;
    }

    @JsonProperty("GACGACIVA")
    public void setGACGACIVA(Integer GACGACIVA) {
        this.GACGACIVA = GACGACIVA;
    }

    /**
     *
     **/
    public PrestamoCondonadoType gastoExtraDiferidoGastoExtraDiferidoIVA(Integer gastoExtraDiferidoGastoExtraDiferidoIVA) {
        this.gastoExtraDiferidoGastoExtraDiferidoIVA = gastoExtraDiferidoGastoExtraDiferidoIVA;
        return this;
    }


    @JsonProperty("gastoExtraDiferidoGastoExtraDiferidoIVA")
    public Integer getGastoExtraDiferidoGastoExtraDiferidoIVA() {
        return gastoExtraDiferidoGastoExtraDiferidoIVA;
    }

    @JsonProperty("gastoExtraDiferidoGastoExtraDiferidoIVA")
    public void setGastoExtraDiferidoGastoExtraDiferidoIVA(Integer gastoExtraDiferidoGastoExtraDiferidoIVA) {
        this.gastoExtraDiferidoGastoExtraDiferidoIVA = gastoExtraDiferidoGastoExtraDiferidoIVA;
    }

    /**
     *
     **/
    public PrestamoCondonadoType gastoExtraJudicialGastoExtraJudicialIVA(Integer gastoExtraJudicialGastoExtraJudicialIVA) {
        this.gastoExtraJudicialGastoExtraJudicialIVA = gastoExtraJudicialGastoExtraJudicialIVA;
        return this;
    }


    @JsonProperty("gastoExtraJudicialGastoExtraJudicialIVA")
    public Integer getGastoExtraJudicialGastoExtraJudicialIVA() {
        return gastoExtraJudicialGastoExtraJudicialIVA;
    }

    @JsonProperty("gastoExtraJudicialGastoExtraJudicialIVA")
    public void setGastoExtraJudicialGastoExtraJudicialIVA(Integer gastoExtraJudicialGastoExtraJudicialIVA) {
        this.gastoExtraJudicialGastoExtraJudicialIVA = gastoExtraJudicialGastoExtraJudicialIVA;
    }

    /**
     *
     **/
    public PrestamoCondonadoType interesesCteBalance(Integer interesesCteBalance) {
        this.interesesCteBalance = interesesCteBalance;
        return this;
    }


    @JsonProperty("interesesCteBalance")
    public Integer getInteresesCteBalance() {
        return interesesCteBalance;
    }

    @JsonProperty("interesesCteBalance")
    public void setInteresesCteBalance(Integer interesesCteBalance) {
        this.interesesCteBalance = interesesCteBalance;
    }

    /**
     *
     **/
    public PrestamoCondonadoType interesesCteContingente(Integer interesesCteContingente) {
        this.interesesCteContingente = interesesCteContingente;
        return this;
    }


    @JsonProperty("InteresesCteContingente")
    public Integer getInteresesCteContingente() {
        return interesesCteContingente;
    }

    @JsonProperty("InteresesCteContingente")
    public void setInteresesCteContingente(Integer interesesCteContingente) {
        this.interesesCteContingente = interesesCteContingente;
    }

    /**
     *
     **/
    public PrestamoCondonadoType interesesMoraBalance(Integer interesesMoraBalance) {
        this.interesesMoraBalance = interesesMoraBalance;
        return this;
    }


    @JsonProperty("interesesMoraBalance")
    public Integer getInteresesMoraBalance() {
        return interesesMoraBalance;
    }

    @JsonProperty("interesesMoraBalance")
    public void setInteresesMoraBalance(Integer interesesMoraBalance) {
        this.interesesMoraBalance = interesesMoraBalance;
    }

    /**
     *
     **/
    public PrestamoCondonadoType interesesMoraContingente(Integer interesesMoraContingente) {
        this.interesesMoraContingente = interesesMoraContingente;
        return this;
    }


    @JsonProperty("interesesMoraContingente")
    public Integer getInteresesMoraContingente() {
        return interesesMoraContingente;
    }

    @JsonProperty("interesesMoraContingente")
    public void setInteresesMoraContingente(Integer interesesMoraContingente) {
        this.interesesMoraContingente = interesesMoraContingente;
    }

    /**
     *
     **/
    public PrestamoCondonadoType leyMipymeLeyMipymeIVA(Integer leyMipymeLeyMipymeIVA) {
        this.leyMipymeLeyMipymeIVA = leyMipymeLeyMipymeIVA;
        return this;
    }


    @JsonProperty("leyMipymeLeyMipymeIVA")
    public Integer getLeyMipymeLeyMipymeIVA() {
        return leyMipymeLeyMipymeIVA;
    }

    @JsonProperty("leyMipymeLeyMipymeIVA")
    public void setLeyMipymeLeyMipymeIVA(Integer leyMipymeLeyMipymeIVA) {
        this.leyMipymeLeyMipymeIVA = leyMipymeLeyMipymeIVA;
  }

  /**
   **/
  public PrestamoCondonadoType numeroCuota(Integer numeroCuota) {
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
  public PrestamoCondonadoType numeroPrestamo(String numeroPrestamo) {
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
    public PrestamoCondonadoType otrosGastos(Integer otrosGastos) {
        this.otrosGastos = otrosGastos;
        return this;
    }


    @JsonProperty("otrosGastos")
    public Integer getOtrosGastos() {
        return otrosGastos;
    }

    @JsonProperty("otrosGastos")
    public void setOtrosGastos(Integer otrosGastos) {
        this.otrosGastos = otrosGastos;
    }

    /**
     *
     **/
    public PrestamoCondonadoType otrosGastosIVA(Integer otrosGastosIVA) {
        this.otrosGastosIVA = otrosGastosIVA;
        return this;
    }


    @JsonProperty("otrosGastosIVA")
    public Integer getOtrosGastosIVA() {
        return otrosGastosIVA;
    }

    @JsonProperty("otrosGastosIVA")
    public void setOtrosGastosIVA(Integer otrosGastosIVA) {
        this.otrosGastosIVA = otrosGastosIVA;
    }

    /**
     *
     **/
    public PrestamoCondonadoType seguroAdicional(Integer seguroAdicional) {
        this.seguroAdicional = seguroAdicional;
        return this;
    }


    @JsonProperty("seguroAdicional")
    public Integer getSeguroAdicional() {
        return seguroAdicional;
    }

    @JsonProperty("seguroAdicional")
    public void setSeguroAdicional(Integer seguroAdicional) {
        this.seguroAdicional = seguroAdicional;
    }

    /**
     *
     **/
    public PrestamoCondonadoType seguroVida(Integer seguroVida) {
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
    public PrestamoCondonadoType totalCuota(Integer totalCuota) {
        this.totalCuota = totalCuota;
        return this;
    }


    @JsonProperty("totalCuota")
    public Integer getTotalCuota() {
        return totalCuota;
    }

    @JsonProperty("totalCuota")
  public void setTotalCuota(Integer totalCuota) {
    this.totalCuota = totalCuota;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
      PrestamoCondonadoType prestamoCondonadoType = (PrestamoCondonadoType) o;
      return Objects.equals(this.abonoACapital, prestamoCondonadoType.abonoACapital) &&
              Objects.equals(this.comisionComisionIVA, prestamoCondonadoType.comisionComisionIVA) &&
              Objects.equals(this.diasVencidos, prestamoCondonadoType.diasVencidos) &&
              Objects.equals(this.estado, prestamoCondonadoType.estado) &&
              Objects.equals(this.fechaAPagar, prestamoCondonadoType.fechaAPagar) &&
              Objects.equals(this.fechaPago, prestamoCondonadoType.fechaPago) &&
              Objects.equals(this.GACGACIVA, prestamoCondonadoType.GACGACIVA) &&
              Objects.equals(this.gastoExtraDiferidoGastoExtraDiferidoIVA, prestamoCondonadoType.gastoExtraDiferidoGastoExtraDiferidoIVA) &&
              Objects.equals(this.gastoExtraJudicialGastoExtraJudicialIVA, prestamoCondonadoType.gastoExtraJudicialGastoExtraJudicialIVA) &&
              Objects.equals(this.interesesCteBalance, prestamoCondonadoType.interesesCteBalance) &&
              Objects.equals(this.interesesCteContingente, prestamoCondonadoType.interesesCteContingente) &&
              Objects.equals(this.interesesMoraBalance, prestamoCondonadoType.interesesMoraBalance) &&
              Objects.equals(this.interesesMoraContingente, prestamoCondonadoType.interesesMoraContingente) &&
              Objects.equals(this.leyMipymeLeyMipymeIVA, prestamoCondonadoType.leyMipymeLeyMipymeIVA) &&
              Objects.equals(this.numeroCuota, prestamoCondonadoType.numeroCuota) &&
              Objects.equals(this.numeroPrestamo, prestamoCondonadoType.numeroPrestamo) &&
              Objects.equals(this.otrosGastos, prestamoCondonadoType.otrosGastos) &&
              Objects.equals(this.otrosGastosIVA, prestamoCondonadoType.otrosGastosIVA) &&
              Objects.equals(this.seguroAdicional, prestamoCondonadoType.seguroAdicional) &&
        Objects.equals(this.seguroVida, prestamoCondonadoType.seguroVida) &&
        Objects.equals(this.totalCuota, prestamoCondonadoType.totalCuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abonoACapital, comisionComisionIVA, diasVencidos, estado, fechaAPagar, fechaPago, GACGACIVA, gastoExtraDiferidoGastoExtraDiferidoIVA, gastoExtraJudicialGastoExtraJudicialIVA, interesesCteBalance, interesesCteContingente, interesesMoraBalance, interesesMoraContingente, leyMipymeLeyMipymeIVA, numeroCuota, numeroPrestamo, otrosGastos, otrosGastosIVA, seguroAdicional, seguroVida, totalCuota);
  }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrestamoCondonadoType {\n");

        sb.append("    abonoACapital: ").append(toIndentedString(abonoACapital)).append("\n");
        sb.append("    comisionComisionIVA: ").append(toIndentedString(comisionComisionIVA)).append("\n");
        sb.append("    diasVencidos: ").append(toIndentedString(diasVencidos)).append("\n");
        sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
        sb.append("    fechaAPagar: ").append(toIndentedString(fechaAPagar)).append("\n");
        sb.append("    fechaPago: ").append(toIndentedString(fechaPago)).append("\n");
        sb.append("    GACGACIVA: ").append(toIndentedString(GACGACIVA)).append("\n");
        sb.append("    gastoExtraDiferidoGastoExtraDiferidoIVA: ").append(toIndentedString(gastoExtraDiferidoGastoExtraDiferidoIVA)).append("\n");
        sb.append("    gastoExtraJudicialGastoExtraJudicialIVA: ").append(toIndentedString(gastoExtraJudicialGastoExtraJudicialIVA)).append("\n");
        sb.append("    interesesCteBalance: ").append(toIndentedString(interesesCteBalance)).append("\n");
    sb.append("    interesesCteContingente: ").append(toIndentedString(interesesCteContingente)).append("\n");
    sb.append("    interesesMoraBalance: ").append(toIndentedString(interesesMoraBalance)).append("\n");
    sb.append("    interesesMoraContingente: ").append(toIndentedString(interesesMoraContingente)).append("\n");
    sb.append("    leyMipymeLeyMipymeIVA: ").append(toIndentedString(leyMipymeLeyMipymeIVA)).append("\n");
    sb.append("    numeroCuota: ").append(toIndentedString(numeroCuota)).append("\n");
    sb.append("    numeroPrestamo: ").append(toIndentedString(numeroPrestamo)).append("\n");
    sb.append("    otrosGastos: ").append(toIndentedString(otrosGastos)).append("\n");
    sb.append("    otrosGastosIVA: ").append(toIndentedString(otrosGastosIVA)).append("\n");
    sb.append("    seguroAdicional: ").append(toIndentedString(seguroAdicional)).append("\n");
    sb.append("    seguroVida: ").append(toIndentedString(seguroVida)).append("\n");
    sb.append("    totalCuota: ").append(toIndentedString(totalCuota)).append("\n");
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

