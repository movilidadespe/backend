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

import com.espe.crud.model.verificacion;
import com.espe.crud.service.verificacionService;

@CrossOrigin(origins = "*")
@RestController
public class verificacionController {

	 @Autowired
	  private verificacionService verificacionService;
	  
	  
	  @RequestMapping(value = "/verificaciones", method = RequestMethod.GET)
	    public ResponseEntity<verificacion> list() {
	        List<verificacion> verificacion = verificacionService.list();
	        return new ResponseEntity(verificacion, HttpStatus.OK);
	    }
	   
		 @CrossOrigin("*")	  
	    @RequestMapping(value = "/crearverificacion", method = RequestMethod.POST)
		 @ResponseBody
		 public ResponseEntity<verificacion> create(@Valid @RequestBody verificacion verificacion) {
	        verificacion verificacionCreated = verificacionService.create(verificacion);
	        return new ResponseEntity(verificacionCreated, HttpStatus.CREATED);
}
}
