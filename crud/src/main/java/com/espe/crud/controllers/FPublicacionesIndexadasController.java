package com.espe.crud.controllers;

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

import com.espe.crud.model.FPublicacionesIndexadas;
import com.espe.crud.service.FPublicacionesIndexadasService;

@CrossOrigin(origins = "*")
@RestController
public class FPublicacionesIndexadasController {

	 @Autowired
	  private FPublicacionesIndexadasService FPublicacionesIndexadasService;
	 
	 @CrossOrigin("*")	  
	    @RequestMapping(value = "/crearPublicacionIndexada", method = RequestMethod.POST)
		 @ResponseBody
		 public ResponseEntity<FPublicacionesIndexadas> create(@Valid @RequestBody FPublicacionesIndexadas FPublicacionesIndexadas) {
		 FPublicacionesIndexadas solicitudesCreated = FPublicacionesIndexadasService.create(FPublicacionesIndexadas);
	        return new ResponseEntity(solicitudesCreated, HttpStatus.CREATED);
	    }
}
