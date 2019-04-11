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

import com.espe.crud.model.gestinv;
import com.espe.crud.repository.gestinvRepository;
import com.espe.crud.service.gestinvService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class gestinvController {


	    public static final Logger logger = LoggerFactory.getLogger(gestinvController.class);


	    @Autowired
		  private gestinvService gestinvService;
	    
	    @Autowired
	    gestinvRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/gestinv", method = RequestMethod.GET)
	    public ResponseEntity<gestinv> list1() {
	        List<gestinv> gestinv = gestinvService.list1();
	        return new ResponseEntity(gestinv, HttpStatus.OK);
	    }  
	     

	    @GetMapping("/gestinv/{id}")
	    public ResponseEntity<gestinv> userById(@PathVariable long id) {
	        Optional<gestinv> client = gestinvService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearGestinv", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<gestinv> create(@Valid @RequestBody gestinv gestinvs) {
	    	gestinv gestinvsCreated = gestinvService.create(gestinvs);
	        return new ResponseEntity(gestinvsCreated, HttpStatus.CREATED);
	    }
	    
	    @CrossOrigin("*")
	    @RequestMapping(value = "/editGestinv", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<gestinv> edit(@Valid @RequestBody gestinv gestinvs) {
	    	gestinv gestinvsCreated = gestinvService.edit(gestinvs);
	        return new ResponseEntity(gestinvsCreated, HttpStatus.CREATED);
	    }


}
