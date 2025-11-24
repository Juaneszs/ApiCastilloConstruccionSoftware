package app.infrastructure.controller;

import app.application.usecase.TriangulationCalculateUseCase;
import app.infrastructure.controller.dto.TriangulationResponse;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inteligencia")
public class IntelligenceController {
	
	private final TriangulationCalculateUseCase triangulationUseCase;
	
	public IntelligenceController(TriangulationCalculateUseCase triangulationUseCase) {
		this.triangulationUseCase = triangulationUseCase;
		
		
	}
@GetMapping("/triangulacion")
public TriangulationResponse triangulacion() {
	return triangulationUseCase.execute();
			
}
}
