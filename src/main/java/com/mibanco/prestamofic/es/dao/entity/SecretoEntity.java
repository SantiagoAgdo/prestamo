package com.mibanco.prestamofic.es.dao.entity;


import com.mibanco.prestamofic.es.services.command.IParam;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@Data
@RegisterForReflection
public class SecretoEntity implements IParam {

    public String nombreBaul;
    public String nombreSecreto;
}
