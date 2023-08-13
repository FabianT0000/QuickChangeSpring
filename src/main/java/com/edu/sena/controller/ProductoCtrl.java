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

import com.edu.sena.models.entity.Producto;
import com.edu.sena.models.service.ProductoService;

@RestController
@RequestMapping("api/productos")
public class ProductoCtrl {
	
	
	@Autowired
	ProductoService productosrv;
	
	 @GetMapping("/{id}")
	    public Optional<Producto> buscarPorId(@PathVariable Integer id) {
	    	
	        return productosrv.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<Producto> listarClientes() {

	        return productosrv.findAll();
	       
	    }
	    
	    

	    @PostMapping("/")
	    public Producto guardar(@RequestBody Producto e) {
	        return productosrv.save(e);

	    }

	    

	    @DeleteMapping("{id}")
	    public void eliminar(@PathVariable Integer id) {

	        productosrv.deleteById(id);
	        System.out.print("Se elimino");
	    }
	    



}
