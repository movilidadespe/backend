package com.espe.crud.controllers;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.espe.crud.model.A�os;
import com.espe.crud.model.Escalafonados;
import com.espe.crud.model.tipomovilidad;
import com.espe.crud.vo.PlanMovilidadVo;
import com.espe.crud.vo.ReqplanmVo;
import com.espe.crud.vo.SolicitudMovilidadVo;


@CrossOrigin(origins = "*")
@RestController 
public class a�osController {

    public static final Logger logger= LoggerFactory.getLogger(a�osController.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@GetMapping("/a�os/{id}")
	public List<A�os> findbyPIDM(@PathVariable Long id) throws SQLException{
		String q = "SELECT TRUNC((( SYSDATE - PEBEMPL_FIRST_HIRE_DATE )/365),0) AS TOTAL FROM PEBEMPL WHERE PEBEMPL_PIDM = " + id +" AND PEBEMPL_BCAT_CODE = 'DO'";
	System.out.println(q);
		return jdbcTemplate.query(q, new BeanPropertyRowMapper<>(A�os.class));
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
	
	@GetMapping("/plan")
	public List<tipomovilidad> plan() throws SQLException{
		String q = "SELECT DISTINCT(UZMTIPMOV_NOMBRE) AS movilidad FROM UTIC.UZMTCONVO,UTIC.UZMTTIPMOV WHERE UZMTTIPMOV.UZMTCONVO_ID= UZMTCONVO.UZMTCONVO_ID and UZMTCONVO_ESTADO='1' ORDER BY UZMTIPMOV_NOMBRE\r\n" + 
				"";
	System.out.println(q);
		return jdbcTemplate.query(q, new BeanPropertyRowMapper<>(tipomovilidad.class));
	}
	
	@GetMapping("/planmovilidad")
	public List<PlanMovilidadVo> planmovilidad() throws SQLException{
		String q = "SELECT DISTINCT(UZMTPLANMOV_NOMBRE) AS planmovilidad FROM UTIC.UZMTCONVO,UTIC.UZMTPLANMOV,UTIC.UZMTTIPMOV WHERE UZMTPLANMOV.UZMTIPMOV_ID= UZMTTIPMOV.UZMTIPMOV_ID and UZMTTIPMOV.UZMTCONVO_ID= UZMTCONVO.UZMTCONVO_ID and UZMTCONVO_ESTADO='1' ORDER BY UZMTPLANMOV_NOMBRE";
	System.out.println(q);
		return jdbcTemplate.query(q, new BeanPropertyRowMapper<>(PlanMovilidadVo.class));
	}
	
	@GetMapping("/indexadasmovilidad")
	public List<SolicitudMovilidadVo> indexadassolicitud() throws SQLException{
		String q = "SELECT DISTINCT(UZMTMOVSUBM_NOM) AS solicitudmovilidad FROM UTIC.UZMTCONVO,UTIC.UZMTMOVSUBM,UTIC.UZMTTIPMOV WHERE UZMTMOVSUBM.UZMTIPMOV_ID= UZMTTIPMOV.UZMTIPMOV_ID and UZMTTIPMOV.UZMTCONVO_ID= UZMTCONVO.UZMTCONVO_ID and UZMTCONVO_ESTADO='1' ORDER BY UZMTMOVSUBM_NOM";
	System.out.println(q);
		return jdbcTemplate.query(q, new BeanPropertyRowMapper<>(SolicitudMovilidadVo.class));
	}
	
	@GetMapping("/requisito/{id}")
	public List<ReqplanmVo> requisito1(@PathVariable Long id) throws SQLException{
		String q = "insert\r\n" + 
				"WHEN (SELECT TRUNC((( SYSDATE - PEBEMPL_FIRST_HIRE_DATE )/365),0) AS TOTAL FROM PEBEMPL WHERE PEBEMPL_PIDM = "+ id +" AND PEBEMPL_BCAT_CODE = 'DO') >3 THEN\r\n" + 
				"into utic.uzmtverireq(uzmtverireq_id, uzmtreqplanm_id, PEAEMPL_PIDM)VALUES (2,3," + id + ")\r\n" + 
				"WHEN ((SELECT DISTINCT\r\n" + 
				"(select max(ptrtenr_desc)  from PTRTENR where ptrtenr_code= PERAPPT_TENURE_CODE ) as CATEGORIA_ESCALAFON\r\n" + 
				"FROM PEBEMPL r, PERAPPT\r\n" + 
				"WHERE\r\n" + 
				"r.pebempl_PIDM = PERAPPT.PERAPPT_PIDM\r\n" + 
				"AND r.pebempl_empl_status = 'A'\r\n" + 
				"--AND( r.pebempl_bcat_code = 'DO' )\r\n" + 
				"AND r.pebempl_PIDM = "+ id +"\r\n" + 
				"AND (r.pebempl_bcat_code = 'DO' or r.pebempl_bcat_code = 'SP' ) AND\r\n" + 
				"    r.pebempl_empl_status = (SELECT MAX(NBRJOBS_STATUS) FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM\r\n" + 
				"    AND (nbrjobs_pict_code = 'ED' or nbrjobs_pict_code = 'LD' )   AND nbrjobs_effective_date = (SELECT MAX(nbrjobs_effective_date)\r\n" + 
				"    FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM AND   (nbrjobs_pict_code = 'ED'\r\n" + 
				"    or nbrjobs_pict_code = 'LD' )))\r\n" + 
				"AND PERAPPT_APPT_EFF_DATE =     (select MAX(PERAPPT_APPT_EFF_DATE)  from PERAPPT WHERE PERAPPT_PIDM = "+ id +")\r\n" + 
				") )  = (('TITULAR AUXILIAR 1'))  THEN\r\n" + 
				" into utic.uzmtverireq(uzmtverireq_id, uzmtreqplanm_id, PEAEMPL_PIDM) VALUES (3,1,"+ id +")\r\n" + 
				" WHEN ((SELECT DISTINCT\r\n" + 
				"(select max(ptrtenr_desc)  from PTRTENR where ptrtenr_code= PERAPPT_TENURE_CODE ) as CATEGORIA_ESCALAFON\r\n" + 
				"FROM PEBEMPL r, PERAPPT\r\n" + 
				"WHERE\r\n" + 
				"r.pebempl_PIDM = PERAPPT.PERAPPT_PIDM\r\n" + 
				"AND r.pebempl_empl_status = 'A'\r\n" + 
				"--AND( r.pebempl_bcat_code = 'DO' )\r\n" + 
				"AND r.pebempl_PIDM = "+id+"\r\n" + 
				"AND (r.pebempl_bcat_code = 'DO' or r.pebempl_bcat_code = 'SP' ) AND\r\n" + 
				"    r.pebempl_empl_status = (SELECT MAX(NBRJOBS_STATUS) FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM\r\n" + 
				"    AND (nbrjobs_pict_code = 'ED' or nbrjobs_pict_code = 'LD' )   AND nbrjobs_effective_date = (SELECT MAX(nbrjobs_effective_date)\r\n" + 
				"    FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM AND   (nbrjobs_pict_code = 'ED'\r\n" + 
				"    or nbrjobs_pict_code = 'LD' )))\r\n" + 
				"AND PERAPPT_APPT_EFF_DATE =     (select MAX(PERAPPT_APPT_EFF_DATE)  from PERAPPT WHERE PERAPPT_PIDM = "+ id +")\r\n" + 
				") )  = (('TITULAR PRINCIPAL 1'))  THEN\r\n" + 
				" into utic.uzmtverireq(uzmtverireq_id, uzmtreqplanm_id, PEAEMPL_PIDM) VALUES (3,1,"+ id +")\r\n" + 
				" WHEN ((SELECT DISTINCT\r\n" + 
				"(select max(ptrtenr_desc)  from PTRTENR where ptrtenr_code= PERAPPT_TENURE_CODE ) as CATEGORIA_ESCALAFON\r\n" + 
				"FROM PEBEMPL r, PERAPPT\r\n" + 
				"WHERE\r\n" + 
				"r.pebempl_PIDM = PERAPPT.PERAPPT_PIDM\r\n" + 
				"AND r.pebempl_empl_status = 'A'\r\n" + 
				"--AND( r.pebempl_bcat_code = 'DO' )\r\n" + 
				"AND r.pebempl_PIDM = "+ id +"\r\n" + 
				"AND (r.pebempl_bcat_code = 'DO' or r.pebempl_bcat_code = 'SP' ) AND\r\n" + 
				"    r.pebempl_empl_status = (SELECT MAX(NBRJOBS_STATUS) FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM\r\n" + 
				"    AND (nbrjobs_pict_code = 'ED' or nbrjobs_pict_code = 'LD' )   AND nbrjobs_effective_date = (SELECT MAX(nbrjobs_effective_date)\r\n" + 
				"    FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM AND   (nbrjobs_pict_code = 'ED'\r\n" + 
				"    or nbrjobs_pict_code = 'LD' )))\r\n" + 
				"AND PERAPPT_APPT_EFF_DATE =     (select MAX(PERAPPT_APPT_EFF_DATE)  from PERAPPT WHERE PERAPPT_PIDM = "+ id +")\r\n" + 
				") )  = (('TITULAR AGREGADO 3'))  THEN\r\n" + 
				" into utic.uzmtverireq(uzmtverireq_id, uzmtreqplanm_id, PEAEMPL_PIDM) VALUES (3,1,"+ id +")\r\n" + 
				" WHEN ((SELECT DISTINCT\r\n" + 
				"(select max(ptrtenr_desc)  from PTRTENR where ptrtenr_code= PERAPPT_TENURE_CODE ) as CATEGORIA_ESCALAFON\r\n" + 
				"FROM PEBEMPL r, PERAPPT\r\n" + 
				"WHERE\r\n" + 
				"r.pebempl_PIDM = PERAPPT.PERAPPT_PIDM\r\n" + 
				"AND r.pebempl_empl_status = 'A'\r\n" + 
				"--AND( r.pebempl_bcat_code = 'DO' )\r\n" + 
				"AND r.pebempl_PIDM = "+ id +"\r\n" + 
				"AND (r.pebempl_bcat_code = 'DO' or r.pebempl_bcat_code = 'SP' ) AND\r\n" + 
				"    r.pebempl_empl_status = (SELECT MAX(NBRJOBS_STATUS) FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM\r\n" + 
				"    AND (nbrjobs_pict_code = 'ED' or nbrjobs_pict_code = 'LD' )   AND nbrjobs_effective_date = (SELECT MAX(nbrjobs_effective_date)\r\n" + 
				"    FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM AND   (nbrjobs_pict_code = 'ED'\r\n" + 
				"    or nbrjobs_pict_code = 'LD' )))\r\n" + 
				"AND PERAPPT_APPT_EFF_DATE =     (select MAX(PERAPPT_APPT_EFF_DATE)  from PERAPPT WHERE PERAPPT_PIDM = "+ id +")\r\n" + 
				") )  = (('TITULAR AGREGADO 1'))  THEN\r\n" + 
				" into utic.uzmtverireq(uzmtverireq_id, uzmtreqplanm_id, PEAEMPL_PIDM) VALUES (3,1,"+ id +")\r\n" + 
				" WHEN ((SELECT DISTINCT\r\n" + 
				"(select max(ptrtenr_desc)  from PTRTENR where ptrtenr_code= PERAPPT_TENURE_CODE ) as CATEGORIA_ESCALAFON\r\n" + 
				"FROM PEBEMPL r, PERAPPT\r\n" + 
				"WHERE\r\n" + 
				"r.pebempl_PIDM = PERAPPT.PERAPPT_PIDM\r\n" + 
				"AND r.pebempl_empl_status = 'A'\r\n" + 
				"--AND( r.pebempl_bcat_code = 'DO' )\r\n" + 
				"AND r.pebempl_PIDM = "+ id +"\r\n" + 
				"AND (r.pebempl_bcat_code = 'DO' or r.pebempl_bcat_code = 'SP' ) AND\r\n" + 
				"    r.pebempl_empl_status = (SELECT MAX(NBRJOBS_STATUS) FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM\r\n" + 
				"    AND (nbrjobs_pict_code = 'ED' or nbrjobs_pict_code = 'LD' )   AND nbrjobs_effective_date = (SELECT MAX(nbrjobs_effective_date)\r\n" + 
				"    FROM NBRJOBS where NBRJOBS_pidm = r.pebempl_PIDM AND   (nbrjobs_pict_code = 'ED'\r\n" + 
				"    or nbrjobs_pict_code = 'LD' )))\r\n" + 
				"AND PERAPPT_APPT_EFF_DATE =     (select MAX(PERAPPT_APPT_EFF_DATE)  from PERAPPT WHERE PERAPPT_PIDM = "+ id +")\r\n" + 
				") )  = (('TITULAR AGREGADO 2') )  THEN\r\n" + 
				" into utic.uzmtverireq(uzmtverireq_id, uzmtreqplanm_id, PEAEMPL_PIDM) VALUES (3,1,"+ id +")\r\n" + 
				" select uzmtverireq_id, uzmtreqplanm_id, PEAEMPL_PIDM from utic.uzmtverireq";
	System.out.println(q);
		return (List<ReqplanmVo>) jdbcTemplate.query(q, new BeanPropertyRowMapper<>(ReqplanmVo.class));
	}
	
	
	
	
}
