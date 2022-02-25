
import java.lang.Math;

public abstract class q2_Shape {
    private int dim1;
    private int dim2;
    private double PI = Math.PI;

    public q2_Shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getPI() {
        return this.PI;
    }

    public double getDim1() {
        return this.dim1;
    }

    public double getDim2() {
        return this.dim2;
    }


    public abstract double area();


}
