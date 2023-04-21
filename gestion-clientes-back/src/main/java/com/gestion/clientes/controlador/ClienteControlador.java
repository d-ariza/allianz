package com.gestion.clientes.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.clientes.modelo.Cliente;
import com.gestion.clientes.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="http://localhost:4200/")
public class ClienteControlador {
	@Autowired
	private ClienteRepositorio repositorio;
	
	@GetMapping("/clientes")
	public List<Cliente> listarTodosLosClientes(){
		return repositorio.findAll();
	}
}
