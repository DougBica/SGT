package br.com.sgt.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sgt.core.entidades.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByLoginAndSenha(String login, String senha);

}
