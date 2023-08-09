package com.mibanco.prestamo.es.dao.entity;

import com.mibanco.prestamo.es.gen.type.TipoGarantiaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoGarantiaEntity {

    public TipoGarantiaEnum tipoGarantia;
    public String subtipoGarantia;
    public Float avaluo;
    public String referencia;
    public String numeroPrestamo;
}
