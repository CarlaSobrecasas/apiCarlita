package com.apicarlita.carlitaApi.repository;

import com.apicarlita.carlitaApi.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenero extends JpaRepository<Genero,Integer> {


}
