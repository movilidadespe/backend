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

import com.espe.crud.model.formexterinvi;
import com.espe.crud.repository.formexterinviRepository;
import com.espe.crud.service.formexterinviService;





@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController

public class formexterinviController {


	    public static final Logger logger = LoggerFactory.getLogger(formexterinviController.class);


	    @Autowired
		  private formexterinviService formexterinviService;
	    
	    @Autowired
	    formexterinviRepository repository;
	      
	  
	    
	    @RequestMapping(value = "/formexterinvi", method = RequestMethod.GET)
	    public ResponseEntity<formexterinvi> list1() {
	        List<formexterinvi> formexterinvi = formexterinviService.list1();
	        return new ResponseEntity(formexterinvi, HttpStatus.OK);
	    }  
	     

	    @GetMapping("/formexterinvi/{id}")
	    public ResponseEntity<formexterinvi> userById(@PathVariable long id) {
	        Optional<formexterinvi> client = formexterinviService.get(id);
	        return new ResponseEntity(client, HttpStatus.OK);
	    }
	    

	    @CrossOrigin("*")
	    @RequestMapping(value = "/crearFormexterinvi", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<formexterinvi> create(@Valid @RequestBody formexterinvi formexterinvis) {
	    	formexterinvi formexterinvisCreated = formexterinviService.create(formexterinvis);
	        return new ResponseEntity(formexterinvisCreated, HttpStatus.CREATED);
	    }
	    
	    @CrossOrigin("*")
	    @RequestMapping(value = "/editFormexterinvi", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<formexterinvi> edit(@Valid @RequestBody formexterinvi formexterinvis) {
	    	formexterinvi formexterinvisCreated = formexterinviService.edit(formexterinvis);
	        return new ResponseEntity(formexterinvisCreated, HttpStatus.CREATED);
	    }


}
