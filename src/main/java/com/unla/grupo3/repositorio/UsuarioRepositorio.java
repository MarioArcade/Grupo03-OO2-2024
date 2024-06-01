package com.unla.grupo3.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.grupo3.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Serializable> {


}
