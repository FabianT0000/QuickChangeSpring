package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;


import com.edu.sena.models.entity.Usuario;



public interface UsuarioService {
	public Optional<Usuario> findById(Integer id);
	public List<Usuario> findAll();
	public Usuario save(Usuario e);
	public void deleteById(Integer id);
	public String login(String user, String ctr);

}
