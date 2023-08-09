package com.mibanco.prestamo.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TipoGarantiaEnum
 */
public enum TipoGarantiaEnum {
  
  _0("0"),
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _8("8"),
  
  _9("9"),
  
  A("A"),
  
  B("B"),
  
  C("C"),
  
  D("D"),
  
  E("E"),
  
  F("F"),
  
  G("G"),
  
  H("H"),
  
  I("I"),
  
  J("J"),
  
  K("K"),
  
  L("L"),
  
  M("M"),
  
  N("N"),
  
  O("O"),
  
  P("P"),
  
  Q("Q"),
  
  R("R"),
  
  S("S"),
  
  T("T"),
  
  U("U"),
  
  V("V"),
  
  W("W"),
  
  X("X"),
  
  Y("Y"),
  
  Z("Z");

  private String value;

  TipoGarantiaEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static TipoGarantiaEnum fromString(String s) {
      for (TipoGarantiaEnum b : TipoGarantiaEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TipoGarantiaEnum fromValue(String value) {
    for (TipoGarantiaEnum b : TipoGarantiaEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


