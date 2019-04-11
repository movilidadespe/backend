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

import com.espe.crud.model.solicitudmovilidad;
import com.espe.crud.service.solicitudmovilidadService;

@CrossOrigin(origins = "*")
@RestController
public class solicitudmovilidadController {

	 @Autowired
	  private solicitudmovilidadService solicitudmovilidadService;
	  
	  
	  @RequestMapping(value = "/smovilidad", method = RequestMethod.GET)
	    public ResponseEntity<solicitudmovilidad> list() {
	        List<solicitudmovilidad> solicitudmovilidad = solicitudmovilidadService.list();
	        return new ResponseEntity(solicitudmovilidad, HttpStatus.OK);
	    }
	   
		 @CrossOrigin("*")	  
	    @RequestMapping(value = "/crearsmovilidad", method = RequestMethod.POST)
		 @ResponseBody
		 public ResponseEntity<solicitudmovilidad> create(@Valid @RequestBody solicitudmovilidad solicitudmovilidad) {
			 solicitudmovilidad solicitudmovilidadCreated = solicitudmovilidadService.create(solicitudmovilidad);
	        return new ResponseEntity(solicitudmovilidadCreated, HttpStatus.CREATED);
}
}
