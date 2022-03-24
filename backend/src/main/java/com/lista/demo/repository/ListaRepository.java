package com.lista.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lista.demo.models.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long> {

}
