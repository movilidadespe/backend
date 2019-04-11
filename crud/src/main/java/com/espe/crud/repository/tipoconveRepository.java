package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.tipoconve;


@Repository
public interface tipoconveRepository extends CrudRepository<tipoconve, Long>{
	@Query(value = "select * from UTIC.UZMTTIPOCONVE where UZMTTIPOCONVE_ID = :id", nativeQuery = true )
	Optional<tipoconve> findByTipoconveIdReturnStream(@Param("id") Long id);

}
