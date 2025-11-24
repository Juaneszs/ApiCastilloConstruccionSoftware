package app.infrastructure.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "message_entity")
public class MessageEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long messageid;
	
	private Long id;
	
	private String fragmentedcontent;
	
	private String reconstructedcontent;
	
	private LocalDateTime timestamp;
	
	public MessageEntity() {}

	
	

	
	public MessageEntity(Long Id, String fragmentedcontent) {
	    this.Id = Id;
	    this.fragmentedcontent = fragmentedcontent;
	    this.timestamp = LocalDateTime.now();
	}
	public Long getMessageid() {
		return messageid;
		
	}
	
	public Long getId() {
		return id;
	}
	public String getfragmentedcontent() {
		return fragmentedcontent;
		
	}
	
	public String getreconstructedcontent() {
		return reconstructedcontent;
	}
	public LocalDateTime gettimestamp() {
		return timestamp;
	}
	
	//Solo un setter aqui
	
	public void setreconstructedcontent(String reconstructedcontent) {
		this.reconstructedcontent = reconstructedcontent;
	}
	
	
}