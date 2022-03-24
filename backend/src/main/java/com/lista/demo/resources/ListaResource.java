package com.lista.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista.demo.repository.ListaRepository;



import com.lista.demo.models.Lista;

@RestController 
@RequestMapping(value="/api")
public class ListaResource {
	
	@Autowired
	ListaRepository ListaRepository;
	
	@GetMapping ("/listas")
	public List<Lista> comidaLista(){
		return ListaRepository.findAll();
		
		
	
	}			

}