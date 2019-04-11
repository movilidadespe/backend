package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.convenio;
import com.espe.crud.model.convocatoria;
import com.espe.crud.model.formexterinvi;
import com.espe.crud.repository.convenioRepository;
import com.espe.crud.repository.formexterinviRepository;




@Service
public class formexterinviService {
	
	@Autowired
    private formexterinviRepository repository;
	
    
    
    public Optional<formexterinvi> get(long id) {
        return repository.findByformexterinviIdReturnStream(id);
    }
	
	public List<formexterinvi> list1() {
        Iterable<formexterinvi> formexterinvi = repository.findAll();
        List< formexterinvi> list1 = new ArrayList< formexterinvi>();
        formexterinvi.forEach(list1::add);
        return list1;
    }
	

	 public formexterinvi create(@Valid formexterinvi formexterinvis) {
	        return repository.save(formexterinvis);
	    }

	 public formexterinvi edit(@Valid formexterinvi formexterinvis) {
	        return repository.save(formexterinvis);
	    }

	 
            };

