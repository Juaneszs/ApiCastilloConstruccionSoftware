package app.application.usecase;

import org.springframework.stereotype.Service;

import app.domain.model.Message;
import app.domain.repository.MessageRepository;


@Service
public class RegisterMessageUseCase {
	
	private final MessageRepository repository;
	
	public RegisterMessageUseCase(MessageRepository repository) {
		this.repository = repository;
	}
	
	public Message execute(Long pilarId,String fragmentedContent) {
		if(pilarId == null) {
			throw new IllegalArgumentException("Pilar id es obligatorio");} 
		if(fragmentedContent == null){throw new IllegalArgumentException("fragmented content es necesario");} 
		if(fragmentedContent.isBlank()) {
			throw new IllegalArgumentException("Datos no validos");
		}
		Message msg = new Message(pilarId, fragmentedContent);
		
		return repository.save(msg);
	}

}
