package com.apicarlita.carlitaApi.Services;

import com.apicarlita.carlitaApi.entity.Usuario;

import java.util.List;

public interface IUsuarios {

    public List<Usuario> listaUsuarios();
    public Usuario guardarUsuario(Usuario usuario);
    public Usuario buscarPorIdUsuario(Integer usuarioId);
    public Usuario modificarUsuario(Usuario usuario);
    public void eliminarUsario(Integer usuarioId);
}
