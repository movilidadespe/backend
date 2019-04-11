package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.convenio;


@Repository
public interface convenioRepository extends CrudRepository<convenio, Long>{
	@Query(value = "select * from UTIC.UZMTCONVENIO where UZMTCONVENIO_ID = :id", nativeQuery = true )
	Optional<convenio> findByConvenioIdReturnStream(@Param("id") Long id);
	

}


