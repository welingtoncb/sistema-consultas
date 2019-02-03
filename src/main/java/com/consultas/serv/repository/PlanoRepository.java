package com.consultas.serv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consultas.serv.domain.Plano;
@Repository
public interface PlanoRepository extends JpaRepository<Plano, Long> {

}
