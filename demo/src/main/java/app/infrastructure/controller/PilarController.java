package app.infrastructure.controller;

import app.application.usecase.FindPilarUsecase;
import app.application.usecase.UpdatePilarPositionUseCase;
import app.domain.model.Pilar;
import app.infrastructure.controller.dto.UpdatePilarPositionRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/pilares")
public class PilarController {

    private final FindPilarUsecase findPilarUsecase;
    private final UpdatePilarPositionUseCase updatePilarPositionUsecase;

    public PilarController(FindPilarUsecase findPilarUsecase,
                           UpdatePilarPositionUseCase updatePilarPositionUsecase) {
        this.findPilarUsecase = findPilarUsecase;
        this.updatePilarPositionUsecase = updatePilarPositionUsecase;
    }

    @GetMapping("/{id}")
    public Pilar get(@PathVariable Long id) {
        return findPilarUsecase.execute(id);
    }

    @PostMapping("/actualizar-posicion")
    public ResponseEntity<?> updatePosition(@RequestBody UpdatePilarPositionRequest request) {

        Pilar updated = updatePilarPositionUsecase.execute(
        		request.Id,
        		request.posx,
        		request.posy,
        		request.status
        	
                
        );

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of(
                        "mensaje", "Posición actualizada exitosamente",
                        "pilar", updated
                ));
    }
}

