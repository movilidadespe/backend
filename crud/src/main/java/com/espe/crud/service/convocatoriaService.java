package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.convocatoria;
import com.espe.crud.repository.convocatoriaRepository;




@Service
public class convocatoriaService {
	
	@Autowired
    private convocatoriaRepository repository;
	
    
    
    public Optional<convocatoria> get(long id) {
        return repository.findByConvocatoriaIdReturnStream(id);
    }
	
	public List<convocatoria> list1() {
        Iterable<convocatoria> convocatoria = repository.findAll();
        List< convocatoria> list1 = new ArrayList< convocatoria>();
        convocatoria.forEach(list1::add);
        return list1;
    }
	
	 public convocatoria create(convocatoria convocatoria) {
	        return repository.save(convocatoria);
	    }

	 
            };

