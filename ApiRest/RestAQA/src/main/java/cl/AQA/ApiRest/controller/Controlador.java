package cl.AQA.ApiRest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.AQA.ApiRest.dao.DAO;
import cl.AQA.ApiRest.dto.Producto;

@RestController
@RequestMapping("/Producto")
public class Controlador 
{
	@Autowired
	protected DAO dao;
	
	@RequestMapping(value = "/Listar", method = RequestMethod.POST)
	public ResponseEntity<List<Producto>> Listar() {
		
	return new ResponseEntity<>(dao.Listar(), HttpStatus.OK);
	}
}
