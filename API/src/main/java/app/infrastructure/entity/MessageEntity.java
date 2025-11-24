package app.infrastructure.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "message_entity")
public class MessageEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "messageid")
	private Long messageId;
	
	
	//pilarid del request
	private Long pilarId;
	
	private String fragmentedContent;
	
	private String reconstructedContent;
	
	private LocalDateTime timestamp;
	
	public MessageEntity() {}

	
	

	
	public MessageEntity(Long pilarId, String fragmentedContent) {
	    this.pilarId = pilarId;
	    this.fragmentedContent = fragmentedContent;
	    this.timestamp = LocalDateTime.now();
	}
	public Long getMessageId() {
		return messageId;
		
	}
	
	public Long getPilarId() {
		return pilarId;
	}
	public String getFragmentedContent() {
		return fragmentedContent;
		
	}
	
	public String getReconstructedContent() {
		return reconstructedContent;
	}
	public LocalDateTime gettimestamp() {
		return timestamp;
	}
	
	//setters
	

    public void setMessageId(Long messageId) { 
    	this.messageId = messageId; }
    
    public void setPilarId(Long pilarId)
    { this.pilarId = pilarId; }
    
    public void setFragmentedContent(String fragmentedContent) 
    { this.fragmentedContent = fragmentedContent; }
    
    public void setReconstructedContent(String reconstructedContent)
    { this.reconstructedContent = reconstructedContent; }
    
    public void setTimestamp(LocalDateTime timestamp)
    { this.timestamp = timestamp; }


	
	
}