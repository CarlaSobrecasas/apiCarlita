package com.apicarlita.carlitaApi.Services;

import com.apicarlita.carlitaApi.entity.Genero;
import com.apicarlita.carlitaApi.repository.IGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroImpl implements IGeneroServices {

    @Autowired
    IGenero iGenero;

    @Override
    public List<Genero> listarGenero() {
        return iGenero.findAll();
    }

    @Override
    public Genero guardarGenero(Genero tipoGenero) {
        return iGenero.save(tipoGenero);
    }

    @Override
    public Genero buscarPorId(Integer id) {
        return iGenero.findById(id).get();
    }

    @Override
    public Genero modificacionGenero(Genero tipoGenero) {
        return iGenero.save(tipoGenero);
    }

    @Override
    public void eliminarGenero(Integer id) {
        iGenero.deleteById(id);
    }


}
