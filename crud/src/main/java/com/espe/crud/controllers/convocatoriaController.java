package com.espe.crud.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.convocatoria;
import com.espe.crud.repository.convocatoriaRepository;
import com.espe.crud.service.convocatoriaService;

@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class convocatoriaController {


	    public static final Logger logger = LoggerFactory.getLogger(convocatoriaController.class);

	    @RequestMapping("/")
	    @ResponseBody
	    public String home() {
	        return "Hello to CrudApp!";
	    }
	    
	    @Autowired
		  private convocatoriaService convocatoriaService;
	    
	    @Autowired
	    convocatoriaRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/convocatoria", method = RequestMethod.GET)
	    public ResponseEntity<convocatoria> list1() {
	        List<convocatoria> convocatoria = convocatoriaService.list1();
	        return new ResponseEntity(convocatoria, HttpStatus.OK);
	    }  

	    @GetMapping("/convocatoria/{id}")
	    public ResponseEntity<convocatoria> userById(@PathVariable long id) {
	        Optional<convocatoria> client = convocatoriaService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearConv", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<convocatoria> create(@Valid @RequestBody convocatoria convocatorias) {
	    	convocatoria convocatoriaCreated = convocatoriaService.create2(convocatorias);
	        return new ResponseEntity(convocatoriaCreated, HttpStatus.CREATED);
	    }
	
}