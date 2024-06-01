package com.unla.grupo3.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unla.grupo3.entidades.Usuario;
import com.unla.grupo3.servicio.UsuarioServicio;

	@RestController
	public class UsuarioControlador {

		@Autowired
		private UsuarioServicio usuarioServicio;
		
		@GetMapping("/login")	
		public String index() {
			
			return "CONECTADO";
		}
		
		@GetMapping("usuarios")
		public List<Usuario> getUsuarios(){
			
			return usuarioServicio.getUsuarios();
		}

}
