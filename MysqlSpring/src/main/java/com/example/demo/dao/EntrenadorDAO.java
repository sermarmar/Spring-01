package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Entrenador;

public interface EntrenadorDAO extends JpaRepository<Entrenador, Long>{
	
}
