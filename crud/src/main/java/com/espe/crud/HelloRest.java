/**
 * 
 */
package com.espe.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.espe.crud.vo.ConvocatoriaVo;



@RestController
@RequestMapping("/banner")
public class HelloRest {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Spring boot funcionando correctamente";
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@RequestMapping(value = "/convocatoriaXD/{id}", method = RequestMethod.GET)
	public List<ConvocatoriaVo> getMailByUserId(@PathVariable Integer id) {
		return jdbcTemplate.query("select * from uzmtconvo where uzmtconvo_id ="+id+"",
				new BeanPropertyRowMapper<>(ConvocatoriaVo.class));
	}
	
}