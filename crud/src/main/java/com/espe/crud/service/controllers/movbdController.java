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

import com.espe.crud.model.convenio;
import com.espe.crud.model.movbd;
import com.espe.crud.repository.movbdRepository;
import com.espe.crud.service.movbdService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class movbdController {


	    public static final Logger logger = LoggerFactory.getLogger(movbdController.class);


	    @Autowired
		  private movbdService movbdService;
	    
	    @Autowired
	    movbdRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/movbd", method = RequestMethod.GET)
	    public ResponseEntity<movbd> list1() {
	        List<movbd> movbd = movbdService.list1();
	        return new ResponseEntity(movbd, HttpStatus.OK);
	    }  
	     

	    @GetMapping("/movbd/{id}")
	    public ResponseEntity<movbd> userById(@PathVariable long id) {
	        Optional<movbd> client = movbdService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearMovbd", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<movbd> create(@Valid @RequestBody movbd movbds) {
	    	movbd movbdsCreated = movbdService.create(movbds);
	        return new ResponseEntity(movbdsCreated, HttpStatus.CREATED);
	    }
	    
	    @CrossOrigin("*")
	    @RequestMapping(value = "/editMovbd", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<movbd> edit(@Valid @RequestBody movbd movbds) {
	    	movbd conveniosCreated = movbdService.edit(movbds);
	        return new ResponseEntity(conveniosCreated, HttpStatus.CREATED);
	    }


}
