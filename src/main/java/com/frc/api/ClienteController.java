package com.frc.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.frc.data.ClienteRepository;
import com.frc.model.Cliente;

@RestController
@RequestMapping(path="/clientes", produces="application/json")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepo;
	
	@GetMapping("/{id}")
	public Cliente clienteById(@PathVariable("id") Long id) {
		Optional<Cliente> optCliente = clienteRepo.findById(id);
		if (optCliente.isPresent()) {
			return optCliente.get();
		}
		return null;
	}
	
	@PostMapping(path="", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteRepo.save(cliente);
	}
	
	@GetMapping("")
	public Iterable<Cliente> allClientes(){
		return clienteRepo.findAll();
	}
	
	@PutMapping("")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		return clienteRepo.save(cliente);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCliente(@PathVariable("id") Long id) {
		clienteRepo.deleteById(id);
	}

}
