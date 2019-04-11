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

import com.espe.crud.model.financiamiento;
import com.espe.crud.service.financiamientoService;

@CrossOrigin(origins = "*")
@RestController
public class financiamientoController {
	 @Autowired
	  private financiamientoService financiamientoService;
	  
	  
	  @RequestMapping(value = "/financiamientos", method = RequestMethod.GET)
	    public ResponseEntity<financiamiento> list() {
	        List<financiamiento> financiamiento = financiamientoService.list();
	        return new ResponseEntity(financiamiento, HttpStatus.OK);
	    }
	   
		 @CrossOrigin("*")	  
	    @RequestMapping(value = "/crearfinanciamiento", method = RequestMethod.POST)
		 @ResponseBody
		 public ResponseEntity<financiamiento> create(@Valid @RequestBody financiamiento financiamiento) {
			 financiamiento financiamientoCreated = financiamientoService.create(financiamiento);
	        return new ResponseEntity(financiamientoCreated, HttpStatus.CREATED);
}
}
