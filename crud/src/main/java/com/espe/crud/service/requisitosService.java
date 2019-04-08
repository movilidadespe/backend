package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.requisitos;
import com.espe.crud.repository.requisitosRepository;

@Service
public class requisitosService {
	
	@Autowired
    private requisitosRepository reqrepository;

	
	public List<requisitos> list() {
        Iterable<requisitos> requisitos = reqrepository.findAll();
        List< requisitos> list = new ArrayList< requisitos>();
        requisitos.forEach(list::add);
        return list;
    }
	
	 public requisitos create(requisitos requisitos) {
	        return reqrepository.save(requisitos);
	    }
	
}
