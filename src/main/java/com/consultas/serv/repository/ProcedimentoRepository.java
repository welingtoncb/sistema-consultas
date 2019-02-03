package com.consultas.serv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consultas.serv.domain.Procedimento;
@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {

}
