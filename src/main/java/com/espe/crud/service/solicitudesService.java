package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.solicitudes;
import com.espe.crud.repository.solicitudesRepository;

@Service
public class solicitudesService {
	
	@Autowired
    private solicitudesRepository repository;
	
	
	
	public List<solicitudes> list() {
        Iterable<solicitudes> solicitudes = repository.findAll();
        List< solicitudes> list = new ArrayList< solicitudes>();
        solicitudes.forEach(list::add);
        return list;
    }
	
	 public solicitudes create(solicitudes solicitudes) {
	        return repository.save(solicitudes);
	    }

}
