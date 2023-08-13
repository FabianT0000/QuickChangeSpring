package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.edu.sena.models.entity.Usuario;
import com.edu.sena.repository.UsuarioRepository;


@Service
public class UsuarioServiceimpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> findById(Integer id) {

        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> findAll() {

        return usuarioRepository.findAll();
    }

    @Override
    public Usuario save(Usuario e) {

        return usuarioRepository.save(e);
    }

    @Override
    public void deleteById(Integer id) {

        usuarioRepository.deleteById(id);
    }

    @Override
    public String login(String user, String contrasena) {
        Usuario usuario = usuarioRepository.findByUsername(user);
        System.out.println(usuario);
        System.out.println("usuario:"+user);
        System.out.println(contrasena);
        if (usuario == null) {
            return "Usuario no encontrado";
        }

        if (!usuario.getContrasena().equals(contrasena)) {
            return "Contraseña incorrecta";
        }

        return "Inicio de sesión exitoso";
    }
  
    public void buscarTodo() {
    	List<Usuario> lista = usuarioRepository.findAll();
    	for(Usuario v :lista) {
    		System.out.println(v.getId() + ""+v.getNombres()+""+v.getPerfil().getDescripcion());
    		
    	}
    }

}
