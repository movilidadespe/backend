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

import com.espe.crud.model.tipdoc;
import com.espe.crud.repository.tipdocRepository;
import com.espe.crud.service.tipdocService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class tipdocController {


	    public static final Logger logger = LoggerFactory.getLogger(tipdocController.class);


	    @Autowired
		  private tipdocService tipdocService;
	    
	    @Autowired
	    tipdocRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/tipdoc", method = RequestMethod.GET)
	    public ResponseEntity<tipdoc> list1() {
	        List<tipdoc> tipdoc = tipdocService.list1();
	        return new ResponseEntity(tipdoc, HttpStatus.OK);
	    }  
	     

	    @GetMapping("/tipdoc/{id}")
	    public ResponseEntity<tipdoc> userById(@PathVariable long id) {
	        Optional<tipdoc> client = tipdocService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearTipdoc", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<tipdoc> create(@Valid @RequestBody tipdoc tipdocs) {
	    	tipdoc tipdocCreated = tipdocService.create(tipdocs);
	        return new ResponseEntity(tipdocCreated, HttpStatus.CREATED);
	    }
	    
}
