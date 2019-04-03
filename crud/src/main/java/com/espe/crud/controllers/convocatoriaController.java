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

import com.espe.crud.model.convocatoria;
import com.espe.crud.service.convocatoriaService;

public class convocatoriaController {

	  @Autowired
	  private convocatoriaService convocatoriaService;
    
    @RequestMapping(value = "/convocatoria", method = RequestMethod.GET)
    public ResponseEntity<convocatoria> list1() {
        List<convocatoria> convocatoria = convocatoriaService.list1();
        return new ResponseEntity(convocatoria, HttpStatus.OK);
    }  


    @CrossOrigin("*")
    @RequestMapping(value = "/crearConv", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<convocatoria> create(@Valid @RequestBody convocatoria convocatorias) {
    	convocatoria solicitudesCreated = convocatoriaService.create(convocatorias);
        return new ResponseEntity(solicitudesCreated, HttpStatus.CREATED);
    }

}
