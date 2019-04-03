package com.espe.crud.controllers;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.Años;
import com.espe.crud.model.Escalafonados;



@RestController
public class añosController {

    public static final Logger logger= LoggerFactory.getLogger(añosController.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@GetMapping("/años/{id}")
	public List<Años> findbyPIDM(@PathVariable Long id) throws SQLException{
		String q = "SELECT TRUNC((( SYSDATE - PEBEMPL_FIRST_HIRE_DATE )/365),0) AS TOTAL FROM PEBEMPL WHERE PEBEMPL_PIDM = " + id +" AND PEBEMPL_BCAT_CODE = 'DO'";
	System.out.println(q);
		return jdbcTemplate.query(q, new BeanPropertyRowMapper<>(Años.class));
	}
	
	@GetMapping("/escalafon/{id}")
	public List<Escalafonados> findbyPIDM2(@PathVariable Long id) throws SQLException{
		String q = "(SELECT DISTINCT\r\n" + 
				"(select max(ptrtenr_desc)  from PTRTENR where ptrtenr_code= PERAPPT_TENURE_CODE ) as CATEGORIA_ESCALAFON\r\n" + 
				"FROM PEBEMPL r, PERAPPT\r\n" + 
				"WHERE\r\n" + 
				"r.pebempl_PIDM = PERAPPT.PERAPPT_PIDM\r\n" + 
				"AND r.pebempl_empl_status = 'A'\r\n" + 
				"--AND( r.pebempl_bcat_code = 'DO' )\r\n" + 
				"AND r.pebempl_PIDM = "+ id + "\r\n" + 
				"AND (r.pebempl_bcat_code = 'DO' or r.pebempl_bcat_code = 'SP' ) AND\r\n" + 
				"    r.pebempl_empl_status = (SELECT MAX(NBRJOBS_STATUS) FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM\r\n" + 
				"    AND (nbrjobs_pict_code = 'ED' or nbrjobs_pict_code = 'LD' )   AND nbrjobs_effective_date = (SELECT MAX(nbrjobs_effective_date)\r\n" + 
				"    FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM AND   (nbrjobs_pict_code = 'ED'\r\n" + 
				"    or nbrjobs_pict_code = 'LD' )))\r\n" + 
				"AND PERAPPT_APPT_EFF_DATE =     (select MAX(PERAPPT_APPT_EFF_DATE)  from PERAPPT WHERE PERAPPT_PIDM = " + id + ")\r\n" + 
				") \r\n" + 
				"";
	System.out.println(q);
		return jdbcTemplate.query(q, new BeanPropertyRowMapper<>(Escalafonados.class));
	}
	
}
