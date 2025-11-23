package app.infrastructure.controller.dto;

public class UpdatePilarPositionRequest {

    public Long Id;
    public double posx;
    public double posy;
    public String status;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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

    public void setstatus(String status) {
        this.status = status;
    }
}


