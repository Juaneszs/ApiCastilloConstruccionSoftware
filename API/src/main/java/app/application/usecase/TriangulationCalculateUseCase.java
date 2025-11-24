package app.application.usecase;

import java.util.List;

import app.domain.model.Pilar;
import app.domain.repository.PilarRepository;
import app.infrastructure.controller.dto.TriangulationResponse;
public class TriangulationCalculateUseCase {
	
	private final PilarRepository repository;
	
	public TriangulationCalculateUseCase(PilarRepository repository) {
		this.repository = repository;
	}
public TriangulationResponse execute() {
	List<Pilar> pilarestable = repository.findAll();
	
	if (pilarestable.isEmpty()) {
		throw new RuntimeException("No hay pilares registrados");
	}
	
		double promx = pilarestable.stream().mapToDouble(Pilar::getposx).average().orElse(0);
		double promy = pilarestable.stream().mapToDouble(Pilar::getposy).average().orElse(0);
		
		return new TriangulationResponse(
				promx,
				promy,
				0.78,
				"probabilidad alta de presencia demoniaca en las coordenadas");
}
}
