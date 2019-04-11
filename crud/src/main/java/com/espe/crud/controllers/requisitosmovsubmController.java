package com.espe.crud.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.requisitosmovsubm;
import com.espe.crud.service.requisitosmovsubmService;

@CrossOrigin(origins = "*")
@RestController
public class requisitosmovsubmController {

	 @Autowired
	  private requisitosmovsubmService requisitosmovsubmService;
	  
	  
	  @RequestMapping(value = "/movsubm", method = RequestMethod.GET)
	    public ResponseEntity<requisitosmovsubm> list() {
	        List<requisitosmovsubm> requisitosmovsubm = requisitosmovsubmService.list();
	        return new ResponseEntity(requisitosmovsubm, HttpStatus.OK);
	    }
	   
		 @CrossOrigin("*")	  
	    @RequestMapping(value = "/crearmovsubm", method = RequestMethod.POST)
		 @ResponseBody
		 public ResponseEntity<requisitosmovsubm> create(@Valid @RequestBody requisitosmovsubm requisitosmovsubm) {
			 requisitosmovsubm requisitosmovsubmCreated = requisitosmovsubmService.create(requisitosmovsubm);
	        return new ResponseEntity(requisitosmovsubmCreated, HttpStatus.CREATED);
}
}
