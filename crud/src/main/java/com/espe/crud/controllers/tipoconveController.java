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

import com.espe.crud.model.tipoconve;
import com.espe.crud.repository.tipoconveRepository;
import com.espe.crud.service.tipoconveService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class tipoconveController {


	    public static final Logger logger = LoggerFactory.getLogger(tipoconveController.class);


	    @Autowired
		  private tipoconveService tipoconveService;
	    
	    @Autowired
	    tipoconveRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/tipoconve", method = RequestMethod.GET)
	    public ResponseEntity<tipoconve> list1() {
	        List<tipoconve> tipoconve = tipoconveService.list1();
	        return new ResponseEntity(tipoconve, HttpStatus.OK);
	    }  

	    @GetMapping("/tipoconve/{id}")
	    public ResponseEntity<tipoconve> userById(@PathVariable long id) {
	        Optional<tipoconve> client = tipoconveService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/creaTipoconve", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<tipoconve> create(@Valid @RequestBody tipoconve tipoconves) {
	    	tipoconve tipoconveCreated = tipoconveService.create(tipoconves);
	        return new ResponseEntity(tipoconveCreated, HttpStatus.CREATED);
	    }

	    
}
