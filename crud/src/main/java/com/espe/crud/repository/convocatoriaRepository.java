package com.espe.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.espe.crud.model.convocatoria;

@Repository
	public interface convocatoriaRepository extends CrudRepository<convocatoria, Long>{
	  List<convocatoria> findById(long id);
	}

