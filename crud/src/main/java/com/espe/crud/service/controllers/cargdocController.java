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

import com.espe.crud.model.cargdoc;
import com.espe.crud.repository.cargdocRepository;
import com.espe.crud.service.cargdocService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class cargdocController {


	    public static final Logger logger = LoggerFactory.getLogger(cargdocController.class);


	    @Autowired
		  private cargdocService cargdocService;
	    
	    @Autowired
	    cargdocRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/cargdoc", method = RequestMethod.GET)
	    public ResponseEntity<cargdoc> list1() {
	        List<cargdoc> cargdoc = cargdocService.list1();
	        return new ResponseEntity(cargdoc, HttpStatus.OK);
	    }  
	     

	    @GetMapping("/cargdoc/{id}")
	    public ResponseEntity<cargdoc> userById(@PathVariable long id) {
	        Optional<cargdoc> client = cargdocService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearCargdoc", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<cargdoc> create(@Valid @RequestBody cargdoc cargdocs) {
	    	cargdoc cargdocCreated = cargdocService.create(cargdocs);
	        return new ResponseEntity(cargdocCreated, HttpStatus.CREATED);
	    }
	    
}
