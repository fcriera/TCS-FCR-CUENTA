package com.frc.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frc.data.ClienteRepository;
import com.frc.model.Cliente;

@RestController
@RequestMapping(path="/api", produces="application/json")
public class ApiController {
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@GetMapping("/cliente/{id}")
	public Cliente clienteById(@PathVariable("id") Long id) {
		Optional<Cliente> optCliente = clienteRepo.findById(id);
		if (optCliente.isPresent()) {
			return optCliente.get();
		}
		return null;
	}
	

}
