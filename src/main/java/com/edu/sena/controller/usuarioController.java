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


import com.edu.sena.models.entity.Usuario;

import com.edu.sena.models.service.UsuarioService;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {

    @Autowired
    UsuarioService usuarioservice;

    @GetMapping("/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Integer id) {
    	
        return usuarioservice.findById(id);
    }

    @GetMapping("/listar")
    public List<Usuario> listarClientes() {

        return usuarioservice.findAll();
       
    }
    
    

    @PostMapping("/")
    public Usuario guardar(@RequestBody Usuario e) {
        return usuarioservice.save(e);

    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario cliente) {
        String mensaje = usuarioservice.login(cliente.getUsername(), cliente.getContrasena());
        
        return ResponseEntity.ok(mensaje);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Integer id) {

        usuarioservice.deleteById(id);
        System.out.print("Se elimino");
    }
    
    
    @PostMapping("/actualizar")
    public Usuario actualizar(@RequestBody Usuario e) {
      return usuarioservice.save(e);
      }

    @PostMapping("/actualizar/{id}")
    public Usuario actualizar(@RequestBody Usuario e, @PathVariable Integer id) {

        Usuario clienteBd = usuarioservice.findById(id).get();

//		clienteBd.setTipo_usuario(e.getTipo_usuario());
        clienteBd.setNombres(e.getNombres());
        clienteBd.setApellidos(e.getApellidos());
        clienteBd.setTipo_documento(e.getTipo_documento());
        clienteBd.setnDocumento(e.getnDocumento());
        clienteBd.setTelefono(e.getTelefono());
        clienteBd.setPais(e.getPais());
        clienteBd.setCiudad(e.getCiudad());
        clienteBd.setCorreo(e.getCorreo());
        clienteBd.setUsername(e.getUsername());
        clienteBd.setContrasena(e.getContrasena());
        clienteBd.setDireccion(e.getDireccion());
        clienteBd.setBarrio(e.getBarrio());

        return usuarioservice.save(clienteBd);

    }
}
