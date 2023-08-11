package com.mibanco.prestamo.es.dao.contract.impl;

import com.mibanco.prestamo.es.dao.contract.IPrestamoDao;
import com.mibanco.prestamo.es.dao.entity.*;
import com.mibanco.prestamo.es.gen.type.*;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class PrestamoDaoImpl implements IPrestamoDao {

    List<PrestamoEntity> listPrestamo = new ArrayList<>();

    public PrestamoDaoImpl() {
        PrestamoEntity prestamo = new PrestamoEntity("", 0, 0, 0,
                "",
                new Date(),
                new Date(),
                0f,
                10002,
                "10002",
                12,
                "",
                "",
                "",
                "",
                "",
                "",
                1000000f,
                SubProductoEnum.GRFG_ASDI_GARANTIA_ASDI);

        listPrestamo.add(prestamo);
    }

    @Override
    public List<PrestamoEntity> consultarPrestamo(Integer numeroCliente) {

        List<PrestamoEntity> cliente = listPrestamo.stream()
                .filter(x -> x.getNumeroCliente().equals(numeroCliente))
                .toList();

        return cliente;
    }

    @Override
    public List<PrestamoCondonadoEntity> consultarPrestamoCondonado(Integer numeroCliente) {

        List<PrestamoCondonadoEntity> prestamoCondonadoList = new ArrayList<>();
        PrestamoCondonadoEntity p = new PrestamoCondonadoEntity(0f, 0f, 0, "", new Date(), new Date(), 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0, "", 0f, 0f, 0f, 0f, 0f);
        prestamoCondonadoList.add(p);

        return prestamoCondonadoList;
    }

    @Override
    public List<PrestamoDetallePagosEntity> consultarPrestamoDetallePagos(Integer numeroCliente) {
        List<PrestamoDetallePagosEntity> prestamoDetallePagosList = new ArrayList<>();
        PrestamoDetallePagosEntity p = new PrestamoDetallePagosEntity(new Date(),
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                "");

        prestamoDetallePagosList.add(p);

        return prestamoDetallePagosList;
    }

    @Override
    public List<PrestamoGarantiaEntity> consultarPrestamoGarantiaOutput(Integer numeroCliente) {
        List<PrestamoGarantiaEntity> prestamoGarantiaList = new ArrayList<>();
        PrestamoGarantiaEntity p = new PrestamoGarantiaEntity(TipoGarantiaEnum._1,
                "",
                0f,
                "",
                "");

        prestamoGarantiaList.add(p);
        return prestamoGarantiaList;
    }

    @Override
    public List<PrestamoOtroTitularEntity> consultarPrestamoOtroTitular(Integer numeroCliente) {
        List<PrestamoOtroTitularEntity> prestamoOtroTitularList = new ArrayList<>();
        PrestamoOtroTitularEntity p = new PrestamoOtroTitularEntity(TipoDocumentoEnum.CC,
                "",
                "",
                "",
                "",
                "",
                TipoTitularEnum.SINDATAMODELING,
                "");

        prestamoOtroTitularList.add(p);
        return prestamoOtroTitularList;
    }

    @Override
    public List<PrestamoPlanDePagosEntity> consultarPrestamoPlanDePagos(Integer numeroCliente) {
        List<PrestamoPlanDePagosEntity> prestamoPlanDePagosList = new ArrayList<>();
        PrestamoPlanDePagosEntity p = new PrestamoPlanDePagosEntity(0,
                new Date(),
                0f,
                0f,
                0f,
                0f,
                0f,
                "",
                0,
                new Date(),
                0f,
                "",
                "");

        prestamoPlanDePagosList.add(p);
        return prestamoPlanDePagosList;
    }

    @Override
    public List<PrestamoPlanDePagosOtroCargoEntity> consultarPrestamoPlanDePagosOtroCargo(Integer numeroCliente) {
        List<PrestamoPlanDePagosOtroCargoEntity> prestamoPlanDePagosOtroCargoList = new ArrayList<>();
        PrestamoPlanDePagosOtroCargoEntity p = new PrestamoPlanDePagosOtroCargoEntity("",
        0f,
        "",
        0);

        prestamoPlanDePagosOtroCargoList.add(p);
        return prestamoPlanDePagosOtroCargoList;
    }

    @Override
    public List<PrestamoPorPagarEntity> consultarPrestamoPorPagar(Integer numeroCliente) {
        List<PrestamoPorPagarEntity> prestamoPorPagarList = new ArrayList<>();
        PrestamoPorPagarEntity p = new PrestamoPorPagarEntity(0,
                new Date(),
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                0f,
                "",
                new Date(),
                0,
                "");

        prestamoPorPagarList.add(p);
        return prestamoPorPagarList;
    }
}
