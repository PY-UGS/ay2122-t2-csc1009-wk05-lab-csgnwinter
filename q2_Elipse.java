

public class q2_Elipse extends q2_Shape {

    public q2_Elipse(int dim1, int dim2) {
        super(dim1, dim2);
        //TODO Auto-generated constructor stub
    }
    
    public double area(){
        return getPI()*getDim1()*getDim2();
    }
}
