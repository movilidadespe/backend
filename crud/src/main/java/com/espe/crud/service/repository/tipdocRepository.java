package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.cargdoc;
import com.espe.crud.model.convenio;
import com.espe.crud.model.tipdoc;


@Repository
public interface tipdocRepository extends CrudRepository<tipdoc, Long>{
	@Query(value = "select * from UTIC.UZMTIPDOC where UZMTIPDOC_ID = :id", nativeQuery = true )
	Optional<tipdoc> findByTipdocIdReturnStream(@Param("id") Long id);
	
}


