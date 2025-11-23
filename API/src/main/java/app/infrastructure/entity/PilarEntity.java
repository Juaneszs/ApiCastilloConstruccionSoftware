package app.infrastructure.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "pilarestable")


public class PilarEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "posx")
	private double posx;
	
	@Column(name = "posy")
	private double posy;
	
	@Column(name = "status")
	private String status;
	
	public Long getid() {
		return id;
	}
	
	public void setid(Long id){
		this.id = id;
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
