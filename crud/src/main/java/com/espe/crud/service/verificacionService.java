package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.verificacion;
import com.espe.crud.repository.verificacionRepository;

@Service
public class verificacionService {


	@Autowired
    private verificacionRepository verificacionrepository;

	
	public List<verificacion> list() {
        Iterable<verificacion> verificacion = verificacionrepository.findAll();
        List< verificacion> list = new ArrayList< verificacion>();
        verificacion.forEach(list::add);
        return list;
    }
	
	 public verificacion create(verificacion verificacion) {
	        return verificacionrepository.save(verificacion);
	    }
	
}
