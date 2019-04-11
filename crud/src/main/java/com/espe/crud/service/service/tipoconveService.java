package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.tipoconve;
import com.espe.crud.repository.tipoconveRepository;




@Service
public class tipoconveService {
	
	@Autowired
    private tipoconveRepository repository;
	
    
    
    public Optional<tipoconve> get(long id) {
        return repository.findByTipoconveIdReturnStream(id);
    }
	
	public List<tipoconve> list1() {
        Iterable<tipoconve> tipoconve = repository.findAll();
        List<tipoconve> list1 = new ArrayList<tipoconve>();
        tipoconve.forEach(list1::add);
        return list1;
    }
	
	 public tipoconve create(@Valid tipoconve tipoconves) {
	        return repository.save(tipoconves);
	    }

	 
            };

