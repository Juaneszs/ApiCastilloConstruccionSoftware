package app.infrastructure.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.domain.repository.PilarRepository;
import app.application.usecase.FindPilarUsecase;
import app.application.usecase.UpdatePilarPositionUseCase;
import app.application.usecase.TriangulationCalculateUseCase;

@Configuration
public class UseCaseConfig {
	
	
	@Bean
    public FindPilarUsecase findPilarUsecase(PilarRepository repository) {
        return new FindPilarUsecase(repository);
    }

    @Bean
    public UpdatePilarPositionUseCase updatePilarPositionUsecase(PilarRepository repository) {
        return new UpdatePilarPositionUseCase(repository);
    }

    @Bean
    public TriangulationCalculateUseCase calcularTriangulacionUsecase(PilarRepository repository) {
        return new TriangulationCalculateUseCase(repository);
    }
    
    

}
