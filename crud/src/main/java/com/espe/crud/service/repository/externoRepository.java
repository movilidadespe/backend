package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.externo;


@Repository
public interface externoRepository extends CrudRepository<externo, Long>{
	@Query(value = "select * from UTIC.UZMTEXTERNO where UZMTEXTERNO_ID = :id", nativeQuery = true )
	Optional<externo> findByexternoIdReturnStream(@Param("id") Long id);
	

}


