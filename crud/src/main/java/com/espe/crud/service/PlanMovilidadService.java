package com.espe.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.crud.model.PlanMovilidad;
import com.espe.crud.repository.planmovilidadrepository;

@Service
public class PlanMovilidadService {

	@Autowired
	 private planmovilidadrepository repository;
	

	public List<PlanMovilidad> list1() {
        Iterable<PlanMovilidad> planmovilidad = repository.findAll();
        List< PlanMovilidad> list1 = new ArrayList< PlanMovilidad>();
        planmovilidad.forEach(list1::add);
        return list1;
    }
}
