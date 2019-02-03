package com.consultas.serv.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consultas.serv.domain.Cliente;
import com.consultas.serv.repository.ClienteRepository;

@Service
@Transactional
public class ClienteService {
	
	private final ClienteRepository clienteRpository;
	
	public ClienteService(ClienteRepository clienteRpository) {
		this.clienteRpository = clienteRpository;
	}

	public Cliente salvar(Cliente cliente) {
		
		return clienteRpository.saveAndFlush(cliente);
	}
}
