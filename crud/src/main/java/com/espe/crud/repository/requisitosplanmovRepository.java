package com.espe.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.espe.crud.model.requisitosplanmov;


@Repository
public interface requisitosplanmovRepository extends CrudRepository<requisitosplanmov, Long>{
	@Query(value = "select * from UTIC.UZMTREQPLANM where UZMTREQPLANM_ID = :id", nativeQuery = true )
	Optional<requisitosplanmov> findByrequisitosplanmovIdReturnStream(@Param("id") Long id);

}
