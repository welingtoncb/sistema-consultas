package com.consultas.serv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consultas.serv.domain.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
