package app.infrastructure.controller.dto;

public class TriangulationResponse {
	
	public double x;
	public double y;
	public double TrustLevel;
	public String description;
	
	public TriangulationResponse (double x, double y, double TrustLevel, String description) {
		this.x = x;
		this.y = y;
		this.TrustLevel = TrustLevel;
		this.description = description;
	}

}
