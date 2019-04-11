package com.espe.crud;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.espe.crud.repository.convocatoriaRepository;

@SpringBootApplication
public class CrudApplication {
	
	@Autowired
	DataSource dataSource;

	@Autowired
	convocatoriaRepository convocatoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
}
