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

import com.edu.sena.models.entity.Proveedor;
import com.edu.sena.models.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorCtrl {
	
	@Autowired
	ProveedorService proveedorsrv;
	
	
	 @GetMapping("/{id}")
	    public Optional<Proveedor> buscarPorId(@PathVariable Integer id) {
	    	
	        return proveedorsrv.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<Proveedor> listarClientes() {

	        return proveedorsrv.findAll();
	       
	    }
	    
	    

	    @PostMapping("/")
	    public Proveedor guardar(@RequestBody Proveedor e) {
	        return proveedorsrv.save(e);

	    }

	    

	    @DeleteMapping("{id}")
	    public void eliminar(@PathVariable Integer id) {

	        proveedorsrv.deleteById(id);
	        System.out.print("Se elimino");
	    }
	    


}
