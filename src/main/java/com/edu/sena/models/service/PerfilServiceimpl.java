package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Perfil;
import com.edu.sena.repository.PerfilRepository;

@Service
public class PerfilServiceimpl implements PerfilService{
	
	PerfilRepository perfilrepository;

	@Override
	public Optional<Perfil> findById(Integer id) {
		
		return perfilrepository.findById(id);
	}

	@Override
	public List<Perfil> findAll() {
		return perfilrepository.findAll();
		
	}

	@Override
	public Perfil save(Perfil e) {
		 return perfilrepository.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		perfilrepository.deleteById(id);
	}
	

}
