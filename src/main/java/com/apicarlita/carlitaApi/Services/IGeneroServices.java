package com.apicarlita.carlitaApi.Services;

import com.apicarlita.carlitaApi.entity.Genero;

import java.util.List;

public interface IGeneroServices {

    public List<Genero> listarGenero();
    public Genero guardarGenero(Genero tipoGenero);
    public Genero buscarPorId(Integer id);
    public Genero modificacionGenero(Genero tipoGenero);
    public void eliminarGenero(Integer id);
}
