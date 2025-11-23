package app.application.usecase;

import app.domain.model.Pilar;
import app.domain.repository.PilarRepository;


public class FindPilarUsecase {
	
	private final PilarRepository repository;
	
	public FindPilarUsecase(PilarRepository repository) {
		this.repository = repository;
	}
	public Pilar execute(Long id) {
		return repository.findByid(id)
						.orElseThrow(() -> new RuntimeException("Pilar no encontrado"));	
	}
	

}
