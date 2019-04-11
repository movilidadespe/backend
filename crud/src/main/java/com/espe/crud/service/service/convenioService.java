package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.convenio;
import com.espe.crud.repository.convenioRepository;




@Service
public class convenioService {
	
	@Autowired
    private convenioRepository repository;
	
    
    
    public Optional<convenio> get(long id) {
        return repository.findByConvenioIdReturnStream(id);
    }
	
	public List<convenio> list1() {
        Iterable<convenio> convenio = repository.findAll();
        List< convenio> list1 = new ArrayList< convenio>();
        convenio.forEach(list1::add);
        return list1;
    }
	

	 public convenio create(@Valid convenio convenios) {
	        return repository.save(convenios);
	    }

	 public convenio edit(@Valid convenio convenios) {
	        return repository.save(convenios);
	    }

	 
            };

