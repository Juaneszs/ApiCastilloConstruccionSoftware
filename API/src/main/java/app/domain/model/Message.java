package app.domain.model;

import java.time.LocalDateTime;

public class Message {
	//id generada por base de datos
	private Long messageId;
	
	// id del pilar
	private Long pilarId;
	private String fragmentedContent;
	private String reconstructedContent;
	private LocalDateTime timestamp;
	
	public Message() {}
	
	public Message(Long messageId, Long pilarId, String fragmentedContent, String reconstructedContent, LocalDateTime timestamp) {
		this.messageId = messageId;
		this.pilarId = pilarId;
		this.fragmentedContent = fragmentedContent;
		this.reconstructedContent = reconstructedContent;
		this.timestamp = timestamp;
		
	}
	public Message(Long pilarId, String fragmentedContent) {
	    this.pilarId = pilarId;
	    this.fragmentedContent = fragmentedContent;
	    this.timestamp = LocalDateTime.now();	}


	
	public Long getPilarId() {
		return pilarId;}
	
	public void setPilarId(Long pilarId) {
		this.pilarId = pilarId;}
		
	public Long getMessageId() {
		return messageId;}
	
	public void setMessageId(Long messageId) {
		this.messageId = messageId;	
	}
	public String getFragmentedContent() {
		return fragmentedContent;
	}
	public void setFragmentedContent(String fragmentedContent) {
		this.fragmentedContent = fragmentedContent;
	}
	public String getReconstructedContent() {
		return reconstructedContent;
	}
	public void setReconstructedContent(String reconstructedContent) {
	this.reconstructedContent = reconstructedContent;}
	
	public LocalDateTime gettimestamp() {
		return timestamp;
	}
	public void settimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}
