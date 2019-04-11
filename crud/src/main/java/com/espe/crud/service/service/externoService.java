package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.externo;
import com.espe.crud.repository.externoRepository;




@Service
public class externoService {
	
	@Autowired
    private externoRepository repository;
	
    
    
    public Optional<externo> get(long id) {
        return repository.findByexternoIdReturnStream(id);
    }
	
	public List<externo> list1() {
        Iterable<externo> externo = repository.findAll();
        List< externo> list1 = new ArrayList< externo>();
        externo.forEach(list1::add);
        return list1;
    }
	

	 public externo create(@Valid externo externos) {
	        return repository.save(externos);
	    }

	 public externo edit(@Valid externo externos) {
	        return repository.save(externos);
	    }

	 
            };

