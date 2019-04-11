package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.movbd;
import com.espe.crud.repository.movbdRepository;




@Service
public class movbdService {
	
	@Autowired
    private movbdRepository repository;
	
    
    
    public Optional<movbd> get(long id) {
        return repository.findBymovbdIdReturnStream(id);
    }
	
	public List<movbd> list1() {
        Iterable<movbd> movbd = repository.findAll();
        List< movbd> list1 = new ArrayList< movbd>();
        movbd.forEach(list1::add);
        return list1;
    }
	

	 public movbd create(@Valid movbd movbds) {
	        return repository.save(movbds);
	    }

	 public movbd edit(@Valid movbd movbds) {
	        return repository.save(movbds);
	    }

	 
            };

