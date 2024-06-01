package com.unla.grupo3.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.grupo3.entidades.Usuario;
import com.unla.grupo3.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio {
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;

	public List<Usuario> getUsuarios(){
		
		return usuarioRepositorio.findAll();
	}
	
	public Optional<Usuario> getUsuario(int id){
		
		return usuarioRepositorio.findById(id);
	}
	
	public void guardarOActualizar(Usuario usuario) {
		
		usuarioRepositorio.save(usuario);		
	}
	
	public void borrar(int id) {
		
		usuarioRepositorio.deleteById(id);	
	}
	
}
