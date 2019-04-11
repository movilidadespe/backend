package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.requisitosmovsubm;
import com.espe.crud.repository.requisitosmovsubmRepository;

@Service
public class requisitosmovsubmService {
	@Autowired
    private requisitosmovsubmRepository requisitosmovsubmrepository;

	
	public List<requisitosmovsubm> list() {
        Iterable<requisitosmovsubm> requisitosmovsubm = requisitosmovsubmrepository.findAll();
        List< requisitosmovsubm> list = new ArrayList< requisitosmovsubm>();
        requisitosmovsubm.forEach(list::add);
        return list;
    }
	
	 public requisitosmovsubm create(requisitosmovsubm requisitosmovsubm) {
	        return requisitosmovsubmrepository.save(requisitosmovsubm);
	    }
	
}
