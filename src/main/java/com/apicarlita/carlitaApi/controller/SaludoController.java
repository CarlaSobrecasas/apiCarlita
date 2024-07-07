package com.apicarlita.carlitaApi.controller;

import com.apicarlita.carlitaApi.Services.UsuarioImpl;
import com.apicarlita.carlitaApi.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaludoController {

    @Autowired
    UsuarioImpl usuarioImpl;

    //creamos un Endpoint y agregamos un path= /...(agregamos la anotation)
    @GetMapping("/saludo")
    public String holaCarlita() {
        return "hola que tal Carlita";
    }


    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return usuarioImpl.listaUsuarios();
    }

    @PostMapping("/guardar")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return usuarioImpl.guardarUsuario(usuario);
    }

    @GetMapping("/buscar/{id}")
    public Usuario buscarPorIdUsuario(@PathVariable(name= "id") Integer usuarioId){
        return usuarioImpl.buscarPorIdUsuario(usuarioId);
    }

    @PutMapping("/modificar/{id}")
    private Usuario modificarUsuario(@RequestBody Usuario usuario, @PathVariable(name= "id")Integer usuarioId){

        Usuario seleccionado = new Usuario();
        Usuario modificado = new Usuario();

        seleccionado = usuarioImpl.buscarPorIdUsuario(usuarioId);

        seleccionado.setNombre(usuario.getNombre());
        seleccionado.setApellido(usuario.getApellido());
        seleccionado.setContraseña(usuario.getContraseña());
        seleccionado.setEmail(usuario.getEmail());

        modificado = usuarioImpl.modificarUsuario(seleccionado);

        return modificado;
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario (@PathVariable(name="id") Integer usuarioId){
        usuarioImpl.eliminarUsario(usuarioId);
    }


}
