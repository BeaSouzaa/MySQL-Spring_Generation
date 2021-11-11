package com.generation.org.lojagamer.controller;

import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RestController;

import com.generation.org.lojagamer.model.ProdutoModel;
import com.generation.org.lojagamer.repository.ProdutoRepository;


@RestController	
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoModel> getById(@PathVariable long id){
		return produtoRepository.findById(id)
			.map(resp-> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<ProdutoModel>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(produtoRepository.findAllByTituloContainingIgnoreCase(nome));
	}	
	
	@PostMapping
	public ResponseEntity<ProdutoModel> postProduto(@Valid @RequestBody ProdutoModel produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<ProdutoModel> putProduto(@Valid @RequestBody ProdutoModel produto) {   //ResponseEntity responde(com HTTP) a requisição que é mandada pelo o postman
					
		return produtoRepository.findById(produto.getId())
				.map(resposta -> {
					return ResponseEntity.ok().body(produtoRepository.save(produto));
				})
				.orElse(ResponseEntity.notFound().build());

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduto(@PathVariable long id) {
		
		return produtoRepository.findById(id)
				.map(resposta -> {
					produtoRepository.deleteById(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				})
				.orElse(ResponseEntity.notFound().build());
	}


}
