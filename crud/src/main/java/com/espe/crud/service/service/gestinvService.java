package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.gestinv;
import com.espe.crud.repository.gestinvRepository;




@Service
public class gestinvService {
	
	@Autowired
    private gestinvRepository repository;
	
    
    
    public Optional<gestinv> get(long id) {
        return repository.findBygestinvIdReturnStream(id);
    }
	
	public List<gestinv> list1() {
        Iterable<gestinv> gestinv = repository.findAll();
        List< gestinv> list1 = new ArrayList< gestinv>();
        gestinv.forEach(list1::add);
        return list1;
    }
	

	 public gestinv create(@Valid gestinv gestinvs) {
	        return repository.save(gestinvs);
	    }

	 public gestinv edit(@Valid gestinv gestinvs) {
	        return repository.save(gestinvs);
	    }

	 
            };

