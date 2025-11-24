
package app.application.usecase;

import app.domain.model.Message;
import app.domain.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class ReconstructMessageUseCase {

    private final MessageRepository repository;

    public ReconstructMessageUseCase(MessageRepository repository) {
        this.repository = repository;
    }

    public Message execute(Long messageId, String reconstructedContent) {
        if (messageId == null) {
            throw new IllegalArgumentException("Id del mensaje es obligatoria");
        }
        if (reconstructedContent == null || reconstructedContent.isBlank()) {
            throw new IllegalArgumentException("Contenido reconstruido es obligatorio");
        }

        
        Message existing = repository.findById(messageId)
                .orElseThrow(() -> new MessageNotFoundException("No existe mensaje con id " + messageId));

        existing.setReconstructedContent(reconstructedContent);

        return repository.save(existing);
    }

    
    public static class MessageNotFoundException extends RuntimeException {
        public MessageNotFoundException(String msg) { super(msg); }
    }
}
