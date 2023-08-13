package com.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.sena.models.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByUsername(String user);
}
