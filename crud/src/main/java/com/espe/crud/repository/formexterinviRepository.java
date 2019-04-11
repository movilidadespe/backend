package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.convenio;
import com.espe.crud.model.convocatoria;
import com.espe.crud.model.formexterinvi;


@Repository
public interface formexterinviRepository extends CrudRepository<formexterinvi, Long>{
	@Query(value = "select * from UTIC.UZMTTESTINTER where UZMTTESTINTER_ID = :id", nativeQuery = true )
	Optional<formexterinvi> findByformexterinviIdReturnStream(@Param("id") Long id);
	

}


