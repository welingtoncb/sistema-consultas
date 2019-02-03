package com.consultas.serv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consultas.serv.domain.Plano;
import com.consultas.serv.service.PlanoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlanoController {
	
	@Autowired
	private PlanoService planoService;

	@GetMapping("/plano")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Plano> buscarPlano() {
		return this.planoService.getAll();
	}		
}
