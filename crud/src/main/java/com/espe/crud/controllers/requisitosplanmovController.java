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

import com.espe.crud.model.requisitosplanmov;
import com.espe.crud.repository.requisitosplanmovRepository;
import com.espe.crud.service.requisitosplanmovService;



@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class requisitosplanmovController {


	    public static final Logger logger = LoggerFactory.getLogger(requisitosplanmovController.class);

	    
	    @Autowired
		  private requisitosplanmovService requisitosplanmovService;
	    
	    @Autowired
	    requisitosplanmovRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/requisitosplanmov", method = RequestMethod.GET)
	    public ResponseEntity<requisitosplanmov> list1() {
	        List<requisitosplanmov> requisitosplanmov = requisitosplanmovService.list1();
	        return new ResponseEntity(requisitosplanmov, HttpStatus.OK);
	    }  

	    @GetMapping("/requisitosplanmov/{id}")
	    public ResponseEntity<requisitosplanmov> userById(@PathVariable long id) {
	        Optional<requisitosplanmov> client = requisitosplanmovService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/creaRequisitosplanmov", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<requisitosplanmov> create(@Valid @RequestBody requisitosplanmov requisitosplanmovs) {
	    	requisitosplanmov requisitosplanmovCreated = requisitosplanmovService.create(requisitosplanmovs);
	        return new ResponseEntity(requisitosplanmovCreated, HttpStatus.CREATED);
	    }

	    
}
