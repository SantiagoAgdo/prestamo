package com.mibanco.prestamofic.es.dao.entity;


import io.quarkus.arc.All;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetallePagosOutput {

    private  int totalRegistros;
    private List<PrestamoDetallePagosEntity> prestamoDetallePagos;
}
