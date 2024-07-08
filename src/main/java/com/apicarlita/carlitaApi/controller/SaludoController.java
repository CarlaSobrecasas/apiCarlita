package com.apicarlita.carlitaApi.controller;

import com.apicarlita.carlitaApi.Services.GeneroImpl;
import com.apicarlita.carlitaApi.Services.UsuarioImpl;
import com.apicarlita.carlitaApi.entity.Genero;
import com.apicarlita.carlitaApi.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaludoController {

    @Autowired
    UsuarioImpl usuarioImpl;

    @Autowired
    GeneroImpl generoImpl;


    //creamos un Endpoint y agregamos un path= /...(agregamos la anotation)

    @GetMapping("/saludo")
    public String holaCarlita() {
        return "hola que tal Carlita";
    }


    // Listar

    @GetMapping("/listargenero")
    public List<Genero> listarGenero(){
        return generoImpl.listarGenero();
    }

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return usuarioImpl.listaUsuarios();
    }


    // Guardar

    @PostMapping("/guardargenero")
    public Genero guardarGenero(@RequestBody Genero tipoGenero){
        return generoImpl.guardarGenero(tipoGenero);
    }

    @PostMapping("/guardar")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return usuarioImpl.guardarUsuario(usuario);
    }


    // Buscar Por id

    @GetMapping("/buscargenero/{id}")
    public Genero buscarPorId(@PathVariable(name="id")Integer id){
        return generoImpl.buscarPorId(id);
    }

    @GetMapping("/buscar/{id}")
    public Usuario buscarPorIdUsuario(@PathVariable(name= "id") Integer usuarioId){
        return usuarioImpl.buscarPorIdUsuario(usuarioId);
    }


    //Modificar

    @PutMapping("/modificargenero/{id}")
    private Genero modificarGenero(@RequestBody Genero tipoGenero, @PathVariable(name="id")Integer id){

        Genero seleccionado = new Genero();
        Genero modificado = new Genero();

        seleccionado= generoImpl.buscarPorId(id);

        seleccionado.setTipoGenero(tipoGenero.getTipoGenero());

        modificado = generoImpl.modificacionGenero(seleccionado);
        return modificado;
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


    // Eliminar
    @DeleteMapping("/eliminargenero/{id}")
    public void eliminarGenero(@PathVariable(name="id") Integer id){generoImpl.eliminarGenero(id);}


    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario (@PathVariable(name="id") Integer usuarioId){
        usuarioImpl.eliminarUsario(usuarioId);
    }


}
