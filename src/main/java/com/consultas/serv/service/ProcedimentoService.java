package com.consultas.serv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultas.serv.domain.Procedimento;
import com.consultas.serv.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {

	@Autowired
	private ProcedimentoRepository procedimentoRpository; 
	
	public List<Procedimento> getAll() {
		return this.procedimentoRpository.findAll();
	}
}