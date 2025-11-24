package app.infrastructure.controller;


import app.application.usecase.RegisterMessageUseCase;
import app.application.usecase.ReconstructMessageUseCase;
import app.domain.model.Message;
import app.infrastructure.controller.dto.ReconstructMessageRequest;
import app.infrastructure.controller.dto.RegisterMessageRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/mensajes")
public class MessageController {
	
	private final RegisterMessageUseCase registerMessageUseCase;
	private final ReconstructMessageUseCase reconstructMessageUseCase;
	
	public MessageController(RegisterMessageUseCase registerMessageUseCase, ReconstructMessageUseCase reconstructMessageUseCase) {
		this.registerMessageUseCase = registerMessageUseCase;	
		this.reconstructMessageUseCase = reconstructMessageUseCase;
	}
	
	@PostMapping
	public ResponseEntity<Message> registerMessage(@RequestBody RegisterMessageRequest request){
		
		Message Saved = registerMessageUseCase.execute(request.pilarId,request.fragmentedContent);
			
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(Saved);
	}
	
	@PutMapping("/{id}/reconstruir")
	public ResponseEntity<Message> reconstructMessage(
			@PathVariable("id")Long id,
			@RequestBody ReconstructMessageRequest request){
		
		Message updated = reconstructMessageUseCase.execute(id,
				request.ReconstructedContent);
		return ResponseEntity.ok(updated);
	}

}
