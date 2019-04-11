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
import com.espe.crud.model.externo;
import com.espe.crud.repository.convocatoriaRepository;
import com.espe.crud.service.convenioService;
import com.espe.crud.service.externoService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class externoController {


	    public static final Logger logger = LoggerFactory.getLogger(externoController.class);


	    @Autowired
		  private externoService externoService;
	    
	    @Autowired
	    convocatoriaRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/externo", method = RequestMethod.GET)
	    public ResponseEntity<externo> list1() {
	        List<externo> externo = externoService.list1();
	        return new ResponseEntity(externo, HttpStatus.OK);
	    }  
	     

	    @GetMapping("/externo/{id}")
	    public ResponseEntity<externo> userById(@PathVariable long id) {
	        Optional<externo> client = externoService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearExterno", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<externo> create(@Valid @RequestBody externo externos) {
	    	externo externosCreated = externoService.create(externos);
	        return new ResponseEntity(externosCreated, HttpStatus.CREATED);
	    }
	    
	    @CrossOrigin("*")
	    @RequestMapping(value = "/editExterno", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<externo> edit(@Valid @RequestBody externo externos) {
	    	externo externosCreated = externoService.edit(externos);
	        return new ResponseEntity(externosCreated, HttpStatus.CREATED);
	    }


}
