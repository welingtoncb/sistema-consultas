package com.consultas.serv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultas.serv.repository.CoberturaRepository;

@Service
public class CoberturaService {

	@Autowired
	private CoberturaRepository coberturaRepository; 
	
	public Long recuperaCobertura(Long idPlano, Long idProcedimento) {
		return this.coberturaRepository.recuperaCobertura(idPlano, idProcedimento);
	}
}