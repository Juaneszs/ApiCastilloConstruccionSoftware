package app.infrastructure.controller;

import app.application.dto.RegisterMessageRequest;
import app.application.usecase.RegisterMessageUseCase;
import app.domain.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/mensajes")
public class MessageController {
	
	private final RegisterMessageUseCase registerMessageUseCase;
	
	public MessageController(RegisterMessageUseCase registerMessageUseCase) {
		this.registerMessageUseCase = registerMessageUseCase;	
	}
	
	@PostMapping
	public ResponseEntity<Message> registerMessage(@RequestBody RegisterMessageRequest request){
		
		Message Saved = registerMessageUseCase.execute(request.pilarId,request.fragmentedContent);
		
			
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(Saved);
	}

}
