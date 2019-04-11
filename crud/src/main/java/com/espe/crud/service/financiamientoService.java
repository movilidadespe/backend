package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.financiamiento;
import com.espe.crud.model.verificacion;
import com.espe.crud.repository.financiamientoRepository;

@Service
public class financiamientoService {

	@Autowired
    private financiamientoRepository financiamientorepository;

	
	public List<financiamiento> list() {
        Iterable<financiamiento> financiamiento = financiamientorepository.findAll();
        List< financiamiento> list = new ArrayList< financiamiento>();
        financiamiento.forEach(list::add);
        return list;
    }
	
	 public financiamiento create(financiamiento financiamiento) {
	        return financiamientorepository.save(financiamiento);
	    }
}
