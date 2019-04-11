package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.solicitudmovilidad;
import com.espe.crud.repository.solicitudmovilidadRepository;

@Service
public class solicitudmovilidadService {

	@Autowired
    private solicitudmovilidadRepository solicitudmovilidadrepository;

	
	public List<solicitudmovilidad> list() {
        Iterable<solicitudmovilidad> solicitudmovilidad = solicitudmovilidadrepository.findAll();
        List< solicitudmovilidad> list = new ArrayList< solicitudmovilidad>();
        solicitudmovilidad.forEach(list::add);
        return list;
    }
	
	 public solicitudmovilidad create(solicitudmovilidad solicitudmovilidad) {
	        return solicitudmovilidadrepository.save(solicitudmovilidad);
	    }
}
