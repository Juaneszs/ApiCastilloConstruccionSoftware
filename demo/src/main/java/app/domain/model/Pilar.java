package app.domain.model;

public class Pilar {
	private Long Id;
	private String name;
	private double posx;
	private double posy;
	private String  status;
	
	
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
