package com.espe.crud.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.convocatoria;
import com.espe.crud.model.solicitudes;
import com.espe.crud.repository.convocatoriaRepository;
import com.espe.crud.service.convocatoriaService;


@CrossOrigin(origins = "*")
@RestController

public class convocatoriaController {

	    
	    @Autowired
		  private convocatoriaService convocatoriaService;
	    
	    @RequestMapping(value = "/convocatoria", method = RequestMethod.GET)
	    public ResponseEntity<convocatoria> list1() {
	        List<convocatoria> convocatoria = convocatoriaService.list1();
	        return new ResponseEntity(convocatoria, HttpStatus.OK);
	    }  

	    
	    @RequestMapping(value = "/crearConv", method = RequestMethod.POST)
	    public ResponseEntity<convocatoria> create(@Valid @RequestBody convocatoria convocatorias) {
	    	convocatoria solicitudesCreated = convocatoriaService.create(convocatorias);
	        return new ResponseEntity(solicitudesCreated, HttpStatus.CREATED);
	    }

}
