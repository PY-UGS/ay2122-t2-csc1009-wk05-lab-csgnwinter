
public class q2_run {
    public static void main(String[] args) {
        q2_Rectangle r = new q2_Rectangle(9,5);
        q2_Triangle t = new q2_Triangle(10,8);
        q2_Circle c = new q2_Circle(5, 5);
        q2_Elipse e = new q2_Elipse(7, 7);
        q2_Square s = new q2_Square(6, 6);
        q2_Shape figref;
        figref = r;
        System.out.println("Area is "+String.format("%.2f",figref.area()));
        figref = t;
        System.out.println("Area is "+String.format("%.2f",figref.area()));
        figref = c;
        System.out.println("Area is "+String.format("%.2f",figref.area()));
        figref = e;
        System.out.println("Area is "+String.format("%.2f",figref.area()));
        figref = s;
        System.out.println("Area is "+String.format("%.2f",figref.area()));
        

    }
}
