package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.cargdoc;
import com.espe.crud.model.convenio;


@Repository
public interface cargdocRepository extends CrudRepository<cargdoc, Long>{
	@Query(value = "select * from UTIC.UZMTCARGDOC where UZMTCARGDOC_ID = :id", nativeQuery = true )
	Optional<cargdoc> findByCargdocIdReturnStream(@Param("id") Long id);
	

}


