package com.espe.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.FPublicacionesIndexadas;
import com.espe.crud.repository.FPublicacionesIndexadasRepository;

@Service
public class FPublicacionesIndexadasService {

	@Autowired
    private FPublicacionesIndexadasRepository repository;
	
	public FPublicacionesIndexadas create(FPublicacionesIndexadas FPublicacionesIndexadas) {
        return repository.save(FPublicacionesIndexadas);
    }

}
