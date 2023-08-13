package com.edu.sena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edu.sena.models.entity.Perfil;
import com.edu.sena.models.entity.Usuario;
import com.edu.sena.repository.PerfilRepository;


@SpringBootApplication
public class QuickChange2Application implements CommandLineRunner{
	
	
//	@Autowired
//	UsuarioRepository usuariorepository;
//	
//	@Autowired
//	PerfilRepository perfilrepository;

	public static void main(String[] args) {
		SpringApplication.run(QuickChange2Application.class, args);
	}
	@Override
	public void run (String... args) throws Exception {
		// TODO Auto-generated method stub
		/* crearProveedor(); */
//		crearPerfil();
//		crearUsuario();
//		crearUsuario2();
	}
	
//	public void crearPerfil() {
//		Perfil perf=new Perfil();
//		perf.setId(1);
//		perf.setDescripcion("cliente");
//		perfilrepository.save(perf);
//	}
//	
//	public void crearUsuario() {
//		Usuario user=new Usuario();
//		
//		user.setNombres("luffy ");
//		user.setApellidos("monkey");
//		user.setTipo_documento("cedula");
//		user.setnDocumento("1293823");
//		user.setTelefono("1293203923");
//		user.setPais("colombia");
//		user.setCiudad("bogota");
//		user.setCorreo("luffy23@gmail.com");
//		user.setUsername("luffy1237");
//		user.setContrasena("maria1234");
//		user.setDireccion("calle 4");
//		user.setBarrio("fucha");
//	
//		Perfil perf=new Perfil();
//		perf.setId(1);
//		user.setPerfil(perf);
//		
//		usuariorepository.save(user);
//		
//		
//	}
//
//	public void crearUsuario2() {
//		Usuario user=new Usuario();
//		
//		user.setNombres("maria ");
//		user.setApellidos("ruiz");
//		user.setTipo_documento("cedula");
//		user.setnDocumento("93484");
//		user.setTelefono("1293203");
//		user.setPais("colombia");
//		user.setCiudad("bogota");
//		user.setCorreo("maria23@gmail.com");
//		user.setUsername("maria1237");
//		user.setContrasena("maria1234");
//		user.setDireccion("calle 4");
//		user.setBarrio("bosa");
//	
//		Perfil perf=new Perfil();
//		perf.setId(1);
//		user.setPerfil(perf);
//		
//		usuariorepository.save(user);
//		
//		
//	}
//

}
