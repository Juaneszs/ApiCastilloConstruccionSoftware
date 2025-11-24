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
	
	public Message execute(Long Id,String fragmentedcontent) {
		if(Id == null || fragmentedcontent == null || fragmentedcontent.isBlank()) {
			throw new IllegalArgumentException("Datos no validos");
		}
		Message msg = new Message(Id, fragmentedcontent);
		
		return repository.save(msg);
	}

}
