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


import com.sergio.restaurante.entities.BebidasEntity;
import com.sergio.restaurante.repository.BebidasRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class BebidasREST {

	@Autowired
	private BebidasRepository bebidasRepository;
	
	@GetMapping(value = "/bebidas")
	public Iterable<BebidasEntity> listarTodasBebidas() {
		return bebidasRepository.findAll();
	}
	
	@GetMapping(value = "/bebidas/{id}")
	public Optional<BebidasEntity> listarBebidasPorId(@PathVariable("id") Integer id) {
		return bebidasRepository.findById(id);
	}
	
	@PostMapping("/bebidas")
	public ResponseEntity <String> insertarbebidas(@RequestBody BebidasEntity bebidas){
		bebidasRepository.save(bebidas);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	
	@PutMapping("/bebidas/{id}")
	public ResponseEntity <String> modificarbebidas(@RequestBody BebidasEntity bebidas){
		bebidasRepository.save(bebidas);
		return new ResponseEntity<>("Modificación correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/bebidas/{id}")
	public ResponseEntity <String> eliminarbebidas(@PathVariable("id") Integer id){
		bebidasRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
		
	}
}
