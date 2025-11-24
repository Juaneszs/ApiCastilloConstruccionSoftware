package app.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.entity.MessageEntity;

@Repository
public interface IJpaMessageRepository extends JpaRepository<MessageEntity, Long> {

}
