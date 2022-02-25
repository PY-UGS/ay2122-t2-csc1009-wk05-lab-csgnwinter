
public class q1_Rectangle extends q1_GeometricObject{
    private double width;
    private double height;

    public q1_Rectangle(){
        
    }
    public q1_Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }

    public q1_Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.getWidth()*this.getHeight();
    }

    public double getPerimeter(){
        return this.getWidth()+this.getWidth()+this.getHeight()+this.getHeight();
    }


}
