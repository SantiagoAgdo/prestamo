package com.mibanco.prestamofic.es.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanDePagosOtroCargoOutput {

    private  int totalRegistros;
    private List<PrestamoPlanDePagosOtroCargoEntity> prestamoPlanDePagosOtroCargo;
}
