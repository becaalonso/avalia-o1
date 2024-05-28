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

import com.example.faculdade.entities.Livro;
import com.example.faculdade.repository.LivroRepository;
import com.example.faculdade.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	private LivroService livroService;
	
	@Autowired
	public void LivroControler(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> findLivrobyId(@PathVariable Long id) {
		Livro livro = livroService.getLivroById(id);
		if (livro != null) {
			return ResponseEntity.ok(livro);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Livro>> findAllUsuarioscontrol() {
		List<Livro> livro = livroService.getAllLivro();
		return ResponseEntity.ok(livro);
	}
	
	@PostMapping("/")
	public ResponseEntity<Livro> insertUsuariosControl(@RequestBody Livro livro) {
		Livro novolivro = livroService.saveLivro(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body(novolivro);
	}

	@GetMapping("/titulo/{titulo}")
	public List<Livro> buscarPorTitulo(@PathVariable String titulo){
		return livroService.buscarPorTitulo(titulo);
	}
	
	@GetMapping("/ano/{ano}")
	public List<LivroRepository> buscarPorano(@PathVariable String ano){
		return livroService.buscarPorAutor(ano);
	}
	
}
