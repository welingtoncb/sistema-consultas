package com.consultas.serv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consultas.serv.domain.Procedimento;
import com.consultas.serv.service.ProcedimentoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProcedimentoController {
	
	@Autowired
	private ProcedimentoService procedimentoService;

	@GetMapping("/procedimento")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Procedimento> buscarPlano() {
		return this.procedimentoService.getAll();
	}		
}
