package com.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Perfil;
import com.edu.sena.models.service.PerfilService;

@RestController
@RequestMapping("/api/perfiles")
public class perfilController {
	
	@Autowired
	PerfilService perfilservice;
	
	 @GetMapping("/{id}")
	    public Optional<Perfil> buscarPorId(@PathVariable Integer id) {

	        return perfilservice.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<Perfil> listarPerfiles() {

	        return perfilservice.findAll();
	    }

	    @PostMapping
	    public Perfil guardar(@RequestBody Perfil e) {
	        return perfilservice.save(e);

	    }

	    @DeleteMapping("{id}")
	    public void eliminar(@PathVariable Integer id) {

	        perfilservice.deleteById(id);
	        System.out.print("Se elimino");
	    }


	
	

}
