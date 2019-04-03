package com.espe.crud.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.solicitudes;
import com.espe.crud.service.solicitudesService;

import net.minidev.json.JSONObject;
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
	    
	  //  @RequestMapping(value = "/año/{PEBEMPL_PIDM}", method = RequestMethod.GET)
	    //public ResponseEntity<Años> findbyPIDM(@PathVariable long PEBEMPL_PIDM) {
	        //Optional<Años> a= solicitudesService.findbyPIDM(PEBEMPL_PIDM);
	      //  return new ResponseEntity(a, HttpStatus.OK);
	    //}
	      
	    @RequestMapping(value = "/consumir/{id}", method = RequestMethod.GET)
		  public ResponseEntity<?> getRequestInformation(@PathVariable Long id)
				throws SQLException {
			// To receive the response
			StringBuilder content = new StringBuilder();
			// Construct manually a JSON object in Java, for testing purposes an object with
			 JSONObject json = new JSONObject();
			try {

		


				// information passed
				String webService = "https://aplicaciones.espe.edu.ec:8443/authentication/api/query/ced="+id+"&auth=ba82e1071cd1ea9669a62f24213ba4a4.cf3df0e97b7a4cc68aeaab8d6bbb9691?fbclid=IwAR3D3xBT2UZEsNo04ZeKSW4CIdYtB1tVdC0X5QXRxWCDIlXBw2WxXLGkymc";
	            URL url = new URL(webService);
				HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
				httpConnection.setDoOutput(true);
				httpConnection.setRequestMethod("GET");
				httpConnection.setRequestProperty("Content-Type", "application/json");
				httpConnection.setRequestProperty("Accept", "application/json");

				// Writes the JSON parsed as string to the connection
				Integer responseCode = httpConnection.getResponseCode();

				BufferedReader bufferedReader;

				// Creates a reader buffer
				if (responseCode > 199 && responseCode < 300) {
					bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
				} else {
					bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream()));
				}

				String line;
				while ((line = bufferedReader.readLine()) != null) {
					content.append(line).append("\n");
				}
				bufferedReader.close();

				// Prints the response
				System.out.println(json);

			} catch (Exception e) {
				System.out.println("Error Message");
				System.out.println(e.getClass().getSimpleName());
				System.out.println(e.getMessage());
			}
			return new ResponseEntity<>(content, HttpStatus.OK);
		}
	    
		 @CrossOrigin("*")	  
	    @RequestMapping(value = "/crear", method = RequestMethod.POST)
		 @ResponseBody
		 public ResponseEntity<solicitudes> create(@Valid @RequestBody solicitudes solicitudes) {
	        solicitudes solicitudesCreated = solicitudesService.create(solicitudes);
	        return new ResponseEntity(solicitudesCreated, HttpStatus.CREATED);
	    }

}
