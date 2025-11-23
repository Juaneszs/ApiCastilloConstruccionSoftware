package app.domain.model;

public class Pilar {
	private Long Id;
	private String name;
	private double posx;
	private double posy;
	private String  status;
	
	public Pilar(){}
	
	public Pilar(Long Id, String name, double posx, double posy, String status) {
		this.Id = Id;
		this.name = name;
		this.posx = posx;
		this.posy = posy;
		this.status = status;
	}
	
	
	public Long getid() {
		return Id;
	}
	
	public void setid(Long id){
		this.Id = id;
	}
	
	public String getname(){
		return name;	
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public double getposx() {
		return posx;
		
	}
	 public void setposx(double posx) {
		 this.posx = posx;
	 }
	 public double getposy() {
		 return posy;
	 }
	 public void setposy(double posy) {
		 this.posy = posy;
	 }
	 
	 public String getstatus() {
		 return status;
	 }
	 public void setstatus(String estado) {
		 this.status = estado;
	 }
}
