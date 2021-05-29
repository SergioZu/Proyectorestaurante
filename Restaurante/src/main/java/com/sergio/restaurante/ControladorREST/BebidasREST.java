package com.sergio.restaurante.ControladorREST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sergio.restaurante.entities.BebidasEntity;
import com.sergio.restaurante.repository.BebidasRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class BebidasREST {

	@Autowired
	private BebidasRepository bebidas;
	
	@GetMapping(value = "/bebidas")
	public Iterable<BebidasEntity> listarTodasBebidas() {
		return bebidas.findAll();
	}
}
