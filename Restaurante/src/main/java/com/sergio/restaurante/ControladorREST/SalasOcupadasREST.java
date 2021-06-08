package com.sergio.restaurante.ControladorREST;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.sergio.restaurante.entities.SalasOcupadasEntity;
import com.sergio.restaurante.repository.SalasOcupadasRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class SalasOcupadasREST {

	@Autowired
	private SalasOcupadasRepository salasocupadasRepository;
	
	@GetMapping(value = "/salasocupadas")
	public Iterable<SalasOcupadasEntity> listarTodosSalasOcupadase() {
		return salasocupadasRepository.findAll();
	}
	
	@GetMapping(value = "/salasocupadas/{id}")
	public Optional<SalasOcupadasEntity> listarSalasOcupadasePorId(@PathVariable("id") Integer id) {
		return salasocupadasRepository.findById(id);
	}
	
	@PostMapping("/salasocupadas")
	public ResponseEntity <String> insertarSalasOcupadase(@RequestBody SalasOcupadasEntity salasocupadas){
		salasocupadasRepository.save(salasocupadas);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/salasocupadas/{id}")
	public ResponseEntity <String> eliminarSalasOcupadase(@PathVariable("id") Integer id){
		salasocupadasRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
	}
}
