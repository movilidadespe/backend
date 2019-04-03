package com.espe.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.PlanMovilidad;
import com.espe.crud.service.PlanMovilidadService;

@CrossOrigin(origins = "*")
@RestController
public class PlanMovilidadController {

	  @Autowired
	  private PlanMovilidadService planmovilidadService;
	  
	    @RequestMapping(value = "/planmovilidad", method = RequestMethod.GET)
	    public ResponseEntity<PlanMovilidad> list1() {
	        List<PlanMovilidad> planmovilidad = planmovilidadService.list1();
	        return new ResponseEntity(planmovilidad, HttpStatus.OK);
	    }  
}
