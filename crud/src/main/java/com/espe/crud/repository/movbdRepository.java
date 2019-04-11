package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.convenio;
import com.espe.crud.model.convocatoria;
import com.espe.crud.model.movbd;


@Repository
public interface movbdRepository extends CrudRepository<movbd, Long>{
	@Query(value = "select * from UTIC.UZMTMOVBD where UZMTMOVBD_ID = :id", nativeQuery = true )
	Optional<movbd> findBymovbdIdReturnStream(@Param("id") Long id);
	

}


