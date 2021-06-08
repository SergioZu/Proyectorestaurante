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

import com.sergio.restaurante.entities.PrimerPlatoEntity;
import com.sergio.restaurante.repository.PrimerPlatoRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class PrimerPlatoREST {


	@Autowired
	private PrimerPlatoRepository primerplatoRepository;
	
	@GetMapping(value = "/primerplato")
	public Iterable<PrimerPlatoEntity> listarTodosPrimerPlato() {
		return primerplatoRepository.findAll();
	}
	
	@GetMapping(value = "/primerplato/{id}")
	public Optional<PrimerPlatoEntity> listarPrimerPlatoPorId(@PathVariable("id") Integer id) {
		return primerplatoRepository.findById(id);
	}
	
	@PostMapping("/primerplato")
	public ResponseEntity <String> insertarPrimerPlato(@RequestBody PrimerPlatoEntity primerplato){
		primerplatoRepository.save(primerplato);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	
	@PutMapping("/primerplato/{id}")
	public ResponseEntity <String> modificarPrimerPlato(@RequestBody PrimerPlatoEntity primerplato){
		primerplatoRepository.save(primerplato);
		return new ResponseEntity<>("Modificación correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/primerplato/{id}")
	public ResponseEntity <String> eliminarPrimerPlato(@PathVariable("id") Integer id){
		primerplatoRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
		
	}
}
