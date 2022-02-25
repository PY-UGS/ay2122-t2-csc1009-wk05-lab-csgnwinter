
import java.lang.Math;

public class q1_Circle extends q1_GeometricObject{
    private double radius;


    public q1_Circle(){

    }

    public q1_Circle(double radius){
        this.radius = radius;
    }

    public q1_Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
        
    }

    public double getPerimeter(){
        return Math.PI*(2*radius);

    }

    public double getDiameter(){
        return 2*getRadius();

    }

    public void printCircle(){
        
    
    }
}
