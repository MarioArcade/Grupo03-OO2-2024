package com.unla.grupo3.entidades;

//import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="username", unique=true, nullable=false, length=45)
	private String username;

	@Column(name="password", nullable=false, length=60)
	private String password;

	private boolean activo;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
	private Set<Rol> roles = new HashSet<>();

	public Usuario(String username, String password, boolean activo) {
		this.username = username;
		this.password = password;
		this.activo = activo;
	}

	public Usuario(String username, String password, boolean activo, Set<Rol> userRoles) {
		this.username = username;
		this.password = password;
		this.activo = activo;
		this.roles = userRoles;
	}
}
