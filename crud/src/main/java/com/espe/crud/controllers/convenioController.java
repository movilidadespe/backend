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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.convenio;
import com.espe.crud.repository.convocatoriaRepository;
import com.espe.crud.service.convenioService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class convenioController {


	    public static final Logger logger = LoggerFactory.getLogger(convenioController.class);


	    @Autowired
		  private convenioService convenioService;
	    
	    @Autowired
	    convocatoriaRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/convenio", method = RequestMethod.GET)
	    public ResponseEntity<convenio> list1() {
	        List<convenio> convenio = convenioService.list1();
	        return new ResponseEntity(convenio, HttpStatus.OK);
	    }  
	     

	    @GetMapping("/convenio/{id}")
	    public ResponseEntity<convenio> userById(@PathVariable long id) {
	        Optional<convenio> client = convenioService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearConvenio", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<convenio> create(@Valid @RequestBody convenio convenios) {
	    	convenio conveniosCreated = convenioService.create(convenios);
	        return new ResponseEntity(conveniosCreated, HttpStatus.CREATED);
	    }
	    
	    @CrossOrigin("*")
	    @RequestMapping(value = "/editConvenio", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<convenio> edit(@Valid @RequestBody convenio convenios) {
	    	convenio conveniosCreated = convenioService.edit(convenios);
	        return new ResponseEntity(conveniosCreated, HttpStatus.CREATED);
	    }


}
