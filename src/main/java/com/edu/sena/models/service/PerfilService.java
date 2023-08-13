package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Perfil;


public interface PerfilService {
	
	public Optional<Perfil> findById(Integer id);
	public List<Perfil> findAll();
	public Perfil save(Perfil e);
	public void deleteById(Integer id);

}
