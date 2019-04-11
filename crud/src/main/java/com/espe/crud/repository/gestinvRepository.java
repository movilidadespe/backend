package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.convenio;
import com.espe.crud.model.convocatoria;
import com.espe.crud.model.gestinv;


@Repository
public interface gestinvRepository extends CrudRepository<gestinv, Long>{
	@Query(value = "select * from UTIC.UZMTGESTINV where UZMTGESTINV_ID = :id", nativeQuery = true )
	Optional<gestinv> findBygestinvIdReturnStream(@Param("id") Long id);
	

}


