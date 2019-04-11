package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.Congreso;
import com.espe.crud.repository.congresoRepository;

@Service
public class CongresoService {

	@Autowired
    private congresoRepository repository;
	
	public List<Congreso> list() {
        Iterable<Congreso> congresos = repository.findAll();
        List<Congreso> list = new ArrayList<Congreso>();
        congresos.forEach(list::add);
        return list;
    }
	
	 public Congreso create(Congreso congresos) {
	        return repository.save(congresos);
	    }
}
