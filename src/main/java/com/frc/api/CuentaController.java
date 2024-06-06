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

import com.frc.data.CuentaRepository;
import com.frc.model.Cuenta;

@RestController
@RequestMapping(path="/cuentas", produces="application/json")
public class CuentaController {
	@Autowired
	private CuentaRepository cuentaRepo;
	
	@GetMapping("/{id}")
	public Cuenta cuentaById(@PathVariable("id") Long id) {
		Optional<Cuenta> optCuenta = cuentaRepo.findById(id);
		if (optCuenta.isPresent()) {
			return optCuenta.get();
		}
		return null;
	}
	
	@PostMapping(path="", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Cuenta createCuenta(@RequestBody Cuenta cuenta) {
		return cuentaRepo.save(cuenta);
	}
	
	@GetMapping("")
	public Iterable<Cuenta> allCuentas(){
		return cuentaRepo.findAll();
	}
	
	@PutMapping("")
	public Cuenta updateCuenta(@RequestBody Cuenta cuenta) {
		return cuentaRepo.save(cuenta);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCuenta(@PathVariable("id") Long id) {
		cuentaRepo.deleteById(id);
	}
}
