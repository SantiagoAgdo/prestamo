package com.mibanco.prestamo.es.dao.entity;

import com.mibanco.prestamo.es.gen.type.TipoDocumentoEnum;
import com.mibanco.prestamo.es.gen.type.TipoTitularEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class PrestamoOtroTitularEntity {

    public TipoDocumentoEnum tipoDocumento;
    public String numeroDocumento;
    public String primerNombre;
    public String segundoNombre;
    public String primerApellido;
    public String segundoApellido;
    public TipoTitularEnum tipoTitular;
    public String numeroPrestamo;
}
