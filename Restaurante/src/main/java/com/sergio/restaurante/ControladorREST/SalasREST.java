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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sergio.restaurante.entities.SalasDisponiblesEntity;
import com.sergio.restaurante.repository.SalasDisponibleRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class SalasDisponibleREST {
	
	@Autowired
	private SalasDisponibleRepository salasdisponibleRepository;
	
	@GetMapping(value = "/salasdisponible")
	public Iterable<SalasDisponiblesEntity> listarTodosSalasDisponible() {
		return salasdisponibleRepository.findAll();
	}
	
	@GetMapping(value = "/salasdisponible/{id}")
	public Optional<SalasDisponiblesEntity> listarSalasDisponiblePorId(@PathVariable("id") Integer id) {
		return salasdisponibleRepository.findById(id);
	}
	
	@PostMapping("/salasdisponible")
	public ResponseEntity <String> insertarSalasDisponible(@RequestBody SalasDisponiblesEntity salasdisponible){
		salasdisponibleRepository.save(salasdisponible);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/salasdisponible/{id}")
	public ResponseEntity <String> eliminarSalasDisponible(@PathVariable("id") Integer id){
		salasdisponibleRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
	}
		

}
