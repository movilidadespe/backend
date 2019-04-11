package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.cargdoc;
import com.espe.crud.repository.cargdocRepository;




@Service
public class cargdocService {
	
	@Autowired
    private cargdocRepository repository;
	
    
    
    public Optional<cargdoc> get(long id) {
        return repository.findByCargdocIdReturnStream(id);
    }
	
	public List<cargdoc> list1() {
        Iterable<cargdoc> cargdoc = repository.findAll();
        List< cargdoc> list1 = new ArrayList< cargdoc>();
        cargdoc.forEach(list1::add);
        return list1;
    }
	

	 public cargdoc create(@Valid cargdoc cargdocs) {
	        return repository.save(cargdocs);
	    }

	 public cargdoc edit(@Valid cargdoc cargdocs) {
	        return repository.save(cargdocs);
	    }

	 
            };

