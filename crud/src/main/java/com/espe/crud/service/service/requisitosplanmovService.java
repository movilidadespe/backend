package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.requisitosplanmov;
import com.espe.crud.repository.requisitosplanmovRepository;




@Service
public class requisitosplanmovService {
	
	@Autowired
    private requisitosplanmovRepository repository;
	
    
    
    public Optional<requisitosplanmov> get(long id) {
        return repository.findByrequisitosplanmovIdReturnStream(id);
    }
	
	public List<requisitosplanmov> list1() {
        Iterable<requisitosplanmov> requisitosplanmov = repository.findAll();
        List< requisitosplanmov> list1 = new ArrayList< requisitosplanmov>();
        requisitosplanmov.forEach(list1::add);
        return list1;
    }
	
	 public requisitosplanmov create(@Valid requisitosplanmov requisitosplanmovs) {
	        return repository.save(requisitosplanmovs);
	    }

	 
            };

