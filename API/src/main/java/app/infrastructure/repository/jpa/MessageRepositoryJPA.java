	package app.infrastructure.repository.jpa;
	
	
	import org.springframework.stereotype.Repository;
	import org.springframework.beans.factory.annotation.Autowired;
	
	import app.domain.model.Message;
	import app.domain.repository.MessageRepository;
	import app.infrastructure.entity.MessageEntity;

	
	@Repository
	public class MessageRepositoryJPA implements MessageRepository{
		
		private final IJpaMessageRepository repository;
		
		@Autowired
		public MessageRepositoryJPA(IJpaMessageRepository repository) {
			this.repository = repository;
		}
		
		@Override
		public Message save(Message message) {
			
			MessageEntity entity = new MessageEntity(
					message.getPilarId(),
					message.getFragmentedContent()
					);
			
			MessageEntity saved = repository.save(entity);
			
			return new Message(
					saved.getMessageId(),
					saved.getPilarId(),
					saved.getFragmentedContent(),
					saved.getReconstructedContent(),
					saved.gettimestamp()
					);
		}
		
	
	}
