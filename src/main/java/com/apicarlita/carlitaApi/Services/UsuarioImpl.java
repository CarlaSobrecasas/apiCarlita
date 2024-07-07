package com.apicarlita.carlitaApi.Services;

import com.apicarlita.carlitaApi.entity.Usuario;
import com.apicarlita.carlitaApi.repository.IRegistroUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements IUsuarios{

    @Autowired
    IRegistroUsuario iRegistroUsuario;

    @Override
    public List<Usuario> listaUsuarios() {
        return iRegistroUsuario.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return iRegistroUsuario.save(usuario);
    }

    @Override
    public Usuario buscarPorIdUsuario(Integer usuarioId) {
        return iRegistroUsuario.findById(usuarioId).get();
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        return iRegistroUsuario.save(usuario);
    }

    @Override
    public void eliminarUsario(Integer usuarioId) {
        iRegistroUsuario.deleteById(usuarioId);
    }
}
