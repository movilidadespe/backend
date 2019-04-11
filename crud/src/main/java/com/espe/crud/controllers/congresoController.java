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

import com.espe.crud.model.Congreso;
import com.espe.crud.service.CongresoService;

@CrossOrigin(origins = "*")
@RestController
public class congresoController {

	 @Autowired
	  private CongresoService congresoService;
	  
	  
	  @RequestMapping(value = "/congresos", method = RequestMethod.GET)
	    public ResponseEntity<Congreso> list() {
	        List<Congreso> Congreso = congresoService.list();
	        return new ResponseEntity(Congreso, HttpStatus.OK);
	    }
	  
		 @CrossOrigin("*")	  
		    @RequestMapping(value = "/crearCongreso", method = RequestMethod.POST)
			 @ResponseBody
			 public ResponseEntity<Congreso> create(@Valid @RequestBody Congreso congresos) {
		        Congreso congresosCreated = congresoService.create(congresos);
		        return new ResponseEntity(congresosCreated, HttpStatus.CREATED);
		    }
}
