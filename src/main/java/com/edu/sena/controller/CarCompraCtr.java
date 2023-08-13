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

import com.edu.sena.models.entity.CarCompra;
import com.edu.sena.models.service.CarCompraService;


@RestController
@RequestMapping("api/carcompras")
public class CarCompraCtr {

	@Autowired
	CarCompraService carcompraS;
	
	
	 @GetMapping("/{id}")
	    public Optional<CarCompra> buscarPorId(@PathVariable Integer id) {

	        return carcompraS.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<CarCompra> listarPerfiles() {

	        return carcompraS.findAll();
	    }

	    @PostMapping
	    public CarCompra guardar(@RequestBody CarCompra e) {
	        return carcompraS.save(e);

	    }

	    @DeleteMapping("{id}")
	    public void eliminar(@PathVariable Integer id) {

	        carcompraS.deleteById(id);
	        System.out.print("Se elimino");
	    }
	
	
	
	
}
