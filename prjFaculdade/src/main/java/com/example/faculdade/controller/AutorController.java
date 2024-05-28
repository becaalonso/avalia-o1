package com.example.faculdade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.faculdade.entities.Autor;
import com.example.faculdade.service.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {


	private AutorService autorService;

	@Autowired
	public void AutorControler(AutorService autorService) {
		this.autorService = autorService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Autor> findLivrobyId(@PathVariable Long id) {
		Autor autor = autorService.getAutorById(id);
		if (autor != null) {
			return ResponseEntity.ok(autor);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Autor>> findAllUsuarioscontrol() {
		List<Autor> autor = autorService.getAllAutor();
		return ResponseEntity.ok(autor);
	}

	@PostMapping("/")
	public ResponseEntity<Autor> insertUsuariosControl(@RequestBody Autor autor) {
		Autor novoautor = autorService.saveAutor(autor);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoautor);
	}
	
	@GetMapping("/nome/{nome}")
	public List<Autor> buscarPorNome(@PathVariable String nome){
		return autorService.buscarPorNome(nome);
	}
	
	@GetMapping("país/{país}")
	public List<Autor> buscarPorPaís(@PathVariable String país){
		return autorService.buscarPorNome(país);
	}
}
