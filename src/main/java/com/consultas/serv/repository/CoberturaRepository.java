package com.consultas.serv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.consultas.serv.domain.Cobertura;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface CoberturaRepository extends JpaRepository<Cobertura, Long> {

	@Query(value = "SELECT COUNT(*) FROM cobertura c"
			+ " WHERE c.id_plano = :idPlano AND c.id_procedimento = :idProcedimento", nativeQuery = true)
	Long recuperaCobertura(@Param("idPlano") Long idPlano, @Param("idProcedimento") Long idProcedimento); 
		
}
