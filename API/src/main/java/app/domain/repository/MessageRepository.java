package app.domain.repository;

import app.domain.model.Message;

public interface MessageRepository {

    Message save(Message message);

}
