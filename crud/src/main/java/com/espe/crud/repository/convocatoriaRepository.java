package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.convocatoria;
@Repository
	public interface convocatoriaRepository extends CrudRepository<convocatoria, Long>{
		@Query(value = "select * from UTIC.UZMTCONVO where UZMTCONVO_ID = :id", nativeQuery = true )
		Optional<convocatoria> findByConvocatoriaIdReturnStream(@Param("id") Long id);

	}

