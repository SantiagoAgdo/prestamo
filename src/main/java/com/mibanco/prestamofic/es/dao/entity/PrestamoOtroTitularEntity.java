package com.mibanco.prestamofic.es.dao.entity;

import com.mibanco.prestamofic.es.gen.type.TipoDocumentoEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class PrestamoOtroTitularEntity {

    public String numeroPrestamo;
    public TipoDocumentoEnum tipoDocumento;
    public String numeroDocumento;
    public String nombre;
    public String tipoTitular;

}
