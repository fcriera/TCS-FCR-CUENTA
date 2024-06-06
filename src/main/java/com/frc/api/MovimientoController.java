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

import com.frc.data.MovimientoRepository;
import com.frc.model.Movimiento;

@RestController
@RequestMapping(path="/movimientos", produces="application/json")
public class MovimientoController {
	@Autowired
	private MovimientoRepository movRepo;
	
	@GetMapping("/{id}")
	public Movimiento cuentaById(@PathVariable("id") Long id) {
		Optional<Movimiento> optMov = movRepo.findById(id);
		if (optMov.isPresent()) {
			return optMov.get();
		}
		return null;
	}
	
	@PostMapping(path="/", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Movimiento createMovimiento(@RequestBody Movimiento movimiento) {
		return movRepo.save(movimiento);
	}
	
	@GetMapping("/")
	public Iterable<Movimiento> allMovimientos(){
		return movRepo.findAll();
	}
	
	@PutMapping("/")
	public Movimiento updateMovimiento(@RequestBody Movimiento movimiento) {
		return movRepo.save(movimiento);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteMovimiento(@PathVariable("id") Long id) {
		movRepo.deleteById(id);
	}
}
