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
import com.sergio.restaurante.entities.SegundoPlatoEntity;
import com.sergio.restaurante.repository.SegundoPlatoRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class SegundoPlatoREST {

	
	@Autowired
	private SegundoPlatoRepository segundoplatoRepository;
	
	@GetMapping(value = "/segundoplato")
	public Iterable<SegundoPlatoEntity> listarTodosSalasDisponible() {
		return segundoplatoRepository.findAll();
	}
	
	@GetMapping(value = "/segundoplato/{id}")
	public Optional<SegundoPlatoEntity> listarSalasDisponiblePorId(@PathVariable("id") Integer id) {
		return segundoplatoRepository.findById(id);
	}
	
	@PostMapping("/segundoplato")
	public ResponseEntity <String> insertarSalasDisponible(@RequestBody SegundoPlatoEntity segundoplato){
		segundoplatoRepository.save(segundoplato);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	

	@PutMapping("/segundoplato/{id}")
	public ResponseEntity <String> modificarPrimerPlato(@RequestBody SegundoPlatoEntity segundoplato){
		segundoplatoRepository.save(segundoplato);
		return new ResponseEntity<>("Modificación correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/segundoplato/{id}")
	public ResponseEntity <String> eliminarSalasDisponible(@PathVariable("id") Integer id){
		segundoplatoRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
	}
}
