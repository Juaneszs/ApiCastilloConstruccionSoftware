	package app.infrastructure.repository.jpa;
	

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import app.domain.model.Message;
import app.domain.repository.MessageRepository;
import app.infrastructure.entity.MessageEntity;

import java.util.Optional;

@Repository
public class MessageRepositoryJPA implements MessageRepository {

    private final IJpaMessageRepository repository;

    @Autowired
    public MessageRepositoryJPA(IJpaMessageRepository repository) {
        this.repository = repository;
    }

    @Override
    public Message save(Message message) {

        MessageEntity entity;

        if (message.getMessageId() != null) {
          
            entity = repository.findById(message.getMessageId())
                    .orElseThrow(() -> new IllegalStateException(
                            "No existe mensaje con id=" + message.getMessageId()));

            entity.setPilarId(message.getPilarId());
            entity.setFragmentedContent(message.getFragmentedContent());
            entity.setReconstructedContent(message.getReconstructedContent());
            
        } else {
            
            entity = new MessageEntity(
                    message.getPilarId(),
                    message.getFragmentedContent()
            );
            entity.setReconstructedContent(message.getReconstructedContent());
        }

        MessageEntity saved = repository.save(entity);

        return new Message(
                saved.getMessageId(),
                saved.getPilarId(),
                saved.getFragmentedContent(),
                saved.getReconstructedContent(),
                saved.gettimestamp()
        );
    }

    @Override
    public Optional<Message> findById(Long id) {
        return repository.findById(id)
                .map(e -> new Message(
                        e.getMessageId(),
                        e.getPilarId(),
                        e.getFragmentedContent(),
                        e.getReconstructedContent(),
                        e.gettimestamp()
                ));
    }
}

