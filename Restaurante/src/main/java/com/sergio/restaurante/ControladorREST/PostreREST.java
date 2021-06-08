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

import com.sergio.restaurante.entities.PostreEntity;
import com.sergio.restaurante.repository.PostreRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class PostreREST {


	@Autowired
	private PostreRepository postreRepository;
	
	@GetMapping(value = "/postre")
	public Iterable<PostreEntity> listarTodosPostre() {
		return postreRepository.findAll();
	}
	
	@GetMapping(value = "/postre/{id}")
	public Optional<PostreEntity> listarPostrePorId(@PathVariable("id") Integer id) {
		return postreRepository.findById(id);
	}
	
	@PostMapping("/postre")
	public ResponseEntity <String> insertarPostre(@RequestBody PostreEntity postre){
		postreRepository.save(postre);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	
	@PutMapping("/postre/{id}")
	public ResponseEntity <String> modificarPostre(@RequestBody PostreEntity postre){
		postreRepository.save(postre);
		return new ResponseEntity<>("Modificación correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/postre/{id}")
	public ResponseEntity <String> eliminarPostre(@PathVariable("id") Integer id){
		postreRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
		
	}
}
