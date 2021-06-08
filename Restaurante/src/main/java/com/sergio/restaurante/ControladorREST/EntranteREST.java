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

import com.sergio.restaurante.entities.EntranteEntity;
import com.sergio.restaurante.repository.EntranteRepository;



@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class EntranteREST {

	

	@Autowired
	private EntranteRepository entranteRepository;
	
	@GetMapping(value = "/entrante")
	public Iterable<EntranteEntity> listarTodosEntrante() {
		return entranteRepository.findAll();
	}
	
	@GetMapping(value = "/entrante/{id}")
	public Optional<EntranteEntity> listarEntrantePorId(@PathVariable("id") Integer id) {
		return entranteRepository.findById(id);
	}
	
	@PostMapping("/entrante")
	public ResponseEntity <String> insertarEntrante(@RequestBody EntranteEntity entrante){
		entranteRepository.save(entrante);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	
	@PutMapping("/entrante/{id}")
	public ResponseEntity <String> modificarEntrante(@RequestBody EntranteEntity entrante){
		entranteRepository.save(entrante);
		return new ResponseEntity<>("Modificación correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/entrante/{id}")
	public ResponseEntity <String> eliminarEntrante(@PathVariable("id") Integer id){
		entranteRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
		
	}
}
