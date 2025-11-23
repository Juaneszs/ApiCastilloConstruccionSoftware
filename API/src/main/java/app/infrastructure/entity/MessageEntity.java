package app.infrastructure.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity


public class MessageEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Messageid;
	
	private Long Id;
	
	private String fragmentedcontent;
	
	private String reconstructedcontent;
	
	private LocalDateTime timestamp;
	
	public MessageEntity() {}

	public MessageEntity(Long Messageid, Long Id, String fragmentedcontent, String reconstructedcontent, LocalDateTime timestamp) {
		this.Id = Id;
		this.fragmentedcontent = fragmentedcontent;
		this.timestamp = timestamp;
	}
	
	
	

}
