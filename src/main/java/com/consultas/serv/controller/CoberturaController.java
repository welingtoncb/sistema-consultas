package com.consultas.serv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.consultas.serv.service.CoberturaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CoberturaController {
	
	@Autowired
	private CoberturaService coberturaService;

	@GetMapping("/cobertura/{idPlano}/{idProcedimento}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Long recuperaCobertura(@PathVariable("idPlano") Long idPlano, @PathVariable("idProcedimento") Long idProcedimento) {
		return this.coberturaService.recuperaCobertura(idPlano, idProcedimento);
	}		
}
