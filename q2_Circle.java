

public class q2_Circle extends q2_Shape{

    public q2_Circle(int dim1, int dim2) {
        super(dim1, dim2);
        //TODO Auto-generated constructor stub
    }

    public double area() {
        return getDim1()*getDim2()*getPI();
    }
    
}
