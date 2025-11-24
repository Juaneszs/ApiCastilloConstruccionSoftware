package app.domain.model;

import java.time.LocalDateTime;

public class Message {
	
	private Long Messageid;
	private Long Id;
	private String fragmentedcontent;
	private String reconstructedcontent;
	private LocalDateTime timestamp;
	
	public Message() {}
	
	public Message(Long Messageid, Long Id, String fragmentedcontent, String reconstructedcontent, LocalDateTime timestamp) {
		this.Messageid = Messageid;
		this.Id = Id;
		this.fragmentedcontent = fragmentedcontent;
		this.reconstructedcontent = reconstructedcontent;
		this.timestamp = timestamp;
		
	}
	public Message(Long id, String fragmentedContent) {
	    this.Id = id;
	    this.fragmentedcontent = fragmentedContent;
	    this.timestamp = LocalDateTime.now();	}


	
	public Long getId() {
		return Id;}
	
	public void setId(Long Id) {
		this.Id = Id;}
		
	public Long getMessageid() {
		return Messageid;}
	
	public void setMessageid(Long Messageid) {
		this.Messageid = Messageid;	
	}
	public String getfragmentedcontent() {
		return fragmentedcontent;
	}
	public void setfragmentedcontect(String fragmentedcontent) {
		this.fragmentedcontent = fragmentedcontent;
	}
	public String getreconstructedcontent() {
		return reconstructedcontent;
	}
	public void setreconstructedcontent(String reconstructedcontent) {
	this.reconstructedcontent = reconstructedcontent;}
	
	public LocalDateTime gettimestamp() {
		return timestamp;
	}
	public void settimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}
