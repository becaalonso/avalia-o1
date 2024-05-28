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

import com.example.faculdade.entities.Categoria;
import com.example.faculdade.entities.Livro;
import com.example.faculdade.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	private CategoriaService categoriaService;

	@Autowired
	public void CategoriaControler(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> findLivrobyId(@PathVariable Long id) {
		Categoria categoria = categoriaService.getCategoriaById(id);
		if (categoria != null) {
			return ResponseEntity.ok(categoria);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Categoria>> findAllUsuarioscontrol() {
		List<Categoria> categoria = categoriaService.getAllCategoria();
		return ResponseEntity.ok(categoria);
	}

	@PostMapping("/")
	public ResponseEntity<Categoria> insertUsuariosControl(@RequestBody Categoria categoria) {
		Categoria novocategoria = categoriaService.saveCategoria(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(novocategoria);
		
	}
	
	@GetMapping("/nome/{nome}")
	public List<Livro> buscarPorNome(@PathVariable String nome){
		return categoriaService.buscarPorNome(nome);
	}
	
	@GetMapping("/autor/{autor}")
	public List<Livro> buscarPorAutor(@PathVariable String autor){
		return categoriaService.buscarPorAutor(autor);
	}
	
}
