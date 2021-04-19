package com.estagiobetha.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estagiobetha.domain.Categoria;
import com.estagiobetha.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	
	@RequestMapping(value="/{Id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer Id) {
		
		Categoria obj = service.find(Id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
