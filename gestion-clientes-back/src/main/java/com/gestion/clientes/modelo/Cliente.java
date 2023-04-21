package com.gestion.clientes.modelo;



import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "telefono", length = 12, nullable = false)
	private int telefono;

	@Column(name = "finicial", nullable = false)
	private Date fInicial;

	@Column(name = "ffinal", nullable = false)
	private Date fFinal;

	@Column(name = "email", length = 60, nullable = false, unique = true)
	private String email;

	private static Format df = new SimpleDateFormat("yyyy-MM-dd");
	public Cliente() {
	}

	public Cliente(Long id, String nombre, int telefono, Date fIncial, Date fFinal, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fInicial = fIncial;
		this.fFinal = fFinal;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getfInicial() {
		return df.format(fInicial);
	}

	public void setfInicial(Date fIncial) {
		this.fInicial = fIncial;
	}

	public String getfFinal() {
		return df.format(fFinal);
	}

	public void setfFinal(Date fFinal) {
		this.fFinal = fFinal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
