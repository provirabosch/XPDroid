package com.funebunny.xpdroid.gastos.business.service;

import com.funebunny.xpdroid.gastos.business.model.Objetivo;

import java.util.List;

/**
 * Created by provirabosch on 22/08/2015.
 */
public interface IServicioObjetivosBusiness {

    public void guardarObjetivo(String periodo, String importe);

    public List<Objetivo> obtenerObjetivos();

    public void eliminarObjetivo(Long id);

    public void actualizarObjetivo(Objetivo obj);

    boolean isLimiteObjetivosAlcanzado();

    boolean tipoObjetivoExiste(String periodo);

}
