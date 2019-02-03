package com.consultas.serv.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.consultas.serv.domain.Cliente;
import com.consultas.serv.service.ClienteService;
import com.consultas.serv.util.HeaderUtil;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@PostMapping("/cliente")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Cliente> salvarCliente(@Valid @RequestBody Cliente cliente) throws Exception{
		
		Cliente resultado = this.clienteService.salvar(cliente);
		
		return ResponseEntity.created(new URI("/cliente/" + resultado.getId()))
				.headers(HeaderUtil.createEntityCreationAlert("Cliente", resultado.getId().toString()))
				.body(resultado);
	}
}
