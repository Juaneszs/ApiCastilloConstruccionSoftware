package app.application.usecase;

import app.domain.model.Pilar;
import app.domain.repository.PilarRepository;

public class UpdatePilarPositionUseCase {
	
	private final PilarRepository repository;
	
	public UpdatePilarPositionUseCase(PilarRepository repository) {
		this.repository = repository;
	}

	
	public Pilar execute(Long id, double posx, double posy, String status) {
		
		Pilar p = repository.findByid(id)
				.orElseThrow(() -> new RuntimeException("Pilar no encontrado"));
		
		p.setposx(posx);
		p.setposy(posy);
		p.setstatus(status);
		
		return repository.Save(p);
	}
}
