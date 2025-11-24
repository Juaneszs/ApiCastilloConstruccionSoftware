package app.domain.repository;

import app.domain.model.Message;
import java.util.Optional;

public interface MessageRepository {

    Message save(Message message);
    Optional<Message> findById(Long Id);

}
