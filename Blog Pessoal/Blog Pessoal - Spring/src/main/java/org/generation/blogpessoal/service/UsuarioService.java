package org.generation.blogpessoal.service;

import org.generation.blogpessoal.model.Usuario;
import org.generation.blogpessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service // Anotação que refere-se a classe de serviço
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository; // injeta o UsuarioRepository a partir do objeto repository

	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); // Instancia um novo objeto BCrypt.. e denomina encoder
																		

		String senhaEncoder = encoder.encode(usuario.getSenha()); // Aqui a senha é substituida pela senha criptografada
		usuario.setSenha(senhaEncoder);

		return repository.save(usuario); // Salva a senha no banco de dados através do repository

	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *		
	}*/
}
