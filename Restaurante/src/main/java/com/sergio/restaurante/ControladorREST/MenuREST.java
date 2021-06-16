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
import com.sergio.restaurante.repository.MenuRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class MenuREST {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@GetMapping(value = "/menu")
	public Iterable<MenuEntity> listarTodasBebidas() {
		return menuRepository.findAll();
	}
	
	@GetMapping(value = "/menu/{id}")
	public Optional<MenuEntity> listarBebidasPorId(@PathVariable("id") Integer id) {
		return menuRepository.findById(id);
	}
	
	@PostMapping("/menu")
	public ResponseEntity <String> insertarbebidas(@RequestBody MenuEntity bebidas){
		menuRepository.save(bebidas);
		return new ResponseEntity<>("Inserción correcta!",HttpStatus.OK);
		
	}
	
	@PutMapping("/menu/{id}")
	public ResponseEntity <String> modificarbebidas(@RequestBody MenuEntity bebidas){
		menuRepository.save(bebidas);
		return new ResponseEntity<>("Modificación correcta!",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/menu/{id}")
	public ResponseEntity <String> eliminarbebidas(@PathVariable("id") Integer id){
		menuRepository.deleteById(id);
		return new ResponseEntity<>("Eliminación correcta!",HttpStatus.OK);
		
	}

}
