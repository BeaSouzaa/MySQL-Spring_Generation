package org.generation.blogpessoal.test.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.generation.blogpessoal.model.Usuario;
import org.generation.blogpessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@BeforeAll
	void start() {

		usuarioRepository.save(new Usuario(0L, "Bea Souza", "beasouza@gmail.com.br", "73826192"));

		usuarioRepository.save(new Usuario(0L, "Pedro Souza", "pesouza@gmail.com.br", "78274388"));

		usuarioRepository.save(new Usuario(0L, "Deb Souza", "debsouza@gmail.com.br", "03794328"));

		usuarioRepository.save(new Usuario(0L, "Cesar Lattes", "clattes@gmail.com.br", "0000098"));

	}

		

	@Test
	@DisplayName("Retorna 1 usuario")
	public void deveRetornarUmUsuario() {

		Optional<Usuario> usuario = usuarioRepository.findByUsuario("bolinha@gmail.com.br");
		assertTrue(usuario.get().getUsuario().equals("bolinha@gmail.com.br"));
	}

	@Test
	@DisplayName("Retorna 3 usuarios")
	public void deveRetornarTresUsuarios() {

		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Souza");
		assertEquals(3, listaDeUsuarios.size());
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Bea Souza"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Pedro Souza"));
		assertTrue(listaDeUsuarios.get(2).getNome().equals("Deb Souza"));

	}

}