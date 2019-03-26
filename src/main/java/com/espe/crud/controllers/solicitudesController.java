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
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.solicitudes;
import com.espe.crud.service.solicitudesService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class solicitudesController {

	  @Autowired
	  private solicitudesService solicitudesService;
	  
	  @RequestMapping(value = "/solicitud", method = RequestMethod.GET)
	    public ResponseEntity<solicitudes> list() {
	        List<solicitudes> solicitudes = solicitudesService.list();
	        return new ResponseEntity(solicitudes, HttpStatus.OK);
	    }
	    
	  
	    
	    
	    @RequestMapping(value = "/crear", method = RequestMethod.POST)
	    public ResponseEntity<solicitudes> create(@Valid @RequestBody solicitudes solicitudes) {
	        solicitudes solicitudesCreated = solicitudesService.create(solicitudes);
	        return new ResponseEntity(solicitudesCreated, HttpStatus.CREATED);
	    }

}
