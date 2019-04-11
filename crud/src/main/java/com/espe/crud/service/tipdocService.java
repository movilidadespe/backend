package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.cargdoc;
import com.espe.crud.model.tipdoc;
import com.espe.crud.repository.tipdocRepository;




@Service
public class tipdocService {
	
	@Autowired
    private tipdocRepository repository;
	
    
    
    public Optional<tipdoc> get(long id) {
        return repository.findByTipdocIdReturnStream(id);
    }
	
	public List<tipdoc> list1() {
        Iterable<tipdoc> tipdoc = repository.findAll();
        List< tipdoc> list1 = new ArrayList< tipdoc>();
        tipdoc.forEach(list1::add);
        return list1;
    }
	

	 public tipdoc create(@Valid tipdoc tipdocs) {
	        return repository.save(tipdocs);
	    }

	 public tipdoc edit(@Valid tipdoc tipdocs) {
	        return repository.save(tipdocs);
	    }

	 
            };

