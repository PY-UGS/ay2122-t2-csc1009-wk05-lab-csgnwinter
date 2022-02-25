
import java.util.Date;


public class q1_GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated = new Date();

    public q1_GeometricObject(){

    }

    public q1_GeometricObject(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor(){
        return this.color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString(){
        return "created on "+getDateCreated() +"\ncolor: "+this.getColor()+" and filled: "+this.isFilled();
    }
    

}


