package repository;

public class UsuarioRepository package com.alura.forumhub.repository;

import com.alura.forumhub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
{
}
