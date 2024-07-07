package com.apicarlita.carlitaApi.repository;

import com.apicarlita.carlitaApi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistroUsuario extends JpaRepository<Usuario,Integer>{

}
