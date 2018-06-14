package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EntrenadorDAO;
import com.example.demo.models.Entrenador;

@RestController
@RequestMapping("/futbol")
public class MyAppController {
	
	@Autowired
	private EntrenadorDAO entrenadorDAO;
	
	@RequestMapping("/entrenadores")
	public ResponseEntity<List<Entrenador>> getEntrenadores(){
		
		List<Entrenador> entrenadores = new ArrayList<Entrenador>();
		try {
			
			entrenadores = entrenadorDAO.findAll();

		}catch(Exception e) {
			return new ResponseEntity<List<Entrenador>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
        return new ResponseEntity<List<Entrenador>>(entrenadores,HttpStatus.OK);
	}
	
}
