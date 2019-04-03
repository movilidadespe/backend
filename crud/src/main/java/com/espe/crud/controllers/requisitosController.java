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

import com.espe.crud.model.requisitos;
import com.espe.crud.service.requisitosService;

@CrossOrigin(origins = "*")
@RestController
public class requisitosController {

	 @Autowired
	  private requisitosService requisitosService;
	  
	  
	  @RequestMapping(value = "/requisitos", method = RequestMethod.GET)
	    public ResponseEntity<requisitos> list() {
	        List<requisitos> requisitos = requisitosService.list();
	        return new ResponseEntity(requisitos, HttpStatus.OK);
	    }
	   
		 @CrossOrigin("*")	  
	    @RequestMapping(value = "/crearrequisito", method = RequestMethod.POST)
		 @ResponseBody
		 public ResponseEntity<requisitos> create(@Valid @RequestBody requisitos requisitos) {
	        requisitos requisitosCreated = requisitosService.create(requisitos);
	        return new ResponseEntity(requisitosCreated, HttpStatus.CREATED);
}
}