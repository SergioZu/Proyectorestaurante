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

import com.sergio.restaurante.entities.MenuEntity;
import com.sergio.restaurante.entities.SalasEntity;
import com.sergio.restaurante.repository.SalasRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class SalasREST {
	
	@Autowired
	private SalasRepository salasRepository;
	
	@GetMapping(value = "/salas")
	public Iterable<SalasEntity> listarTodosSalasDisponible() {
		return salasRepository.findAll();
	}
	
	@GetMapping(value = "/salas/{id}")
	public Optional<SalasEntity> listarSalasDisponiblePorId(@PathVariable("id") Integer id) {
		return salasRepository.findById(id);
	}
	
	@PutMapping("/salas/{id}")
	public ResponseEntity <String> modificarMenu(@RequestBody SalasEntity salas){
		salasRepository.save(salas);
		return new ResponseEntity<>("Modificación correcta!",HttpStatus.OK);
		
	}
		

}
