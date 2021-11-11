package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
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

@RestController
@RequestMapping("/postagem")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

		
	@Autowired							//Serviço de injeção de dependência
	private PostagemRepository repository;
	
	@GetMapping 						//Sempre que tiver uma requisição através de postagem vai disparar esse método
	public ResponseEntity<List<Postagem>> getAll() {
			return ResponseEntity.ok(repository.findAll());
			
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> getById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
			
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		
	}
	
	@PostMapping
	public ResponseEntity <Postagem> post (@RequestBody Postagem postagem){						//@RequestBody usado para recepcionar os dados
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		
	}
	@PutMapping																				    //@Put atualiza os dados 
	public ResponseEntity <Postagem> put (@RequestBody Postagem postagem){						
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		
	}
	@DeleteMapping("/{id}")																		//deleta um recurso no banco de dados
	public void  delete(@PathVariable long id) {												//void porque não irá retornar nada
		repository.deleteById(id);
		
	}
	
}
