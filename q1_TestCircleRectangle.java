
public class q1_TestCircleRectangle {
    public static void main(String[] args) {
        q1_Circle circle = new q1_Circle(1.0);
        System.out.println("A circle "+circle.toString());
        System.out.println("The color is "+circle.getColor());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The diameter is "+circle.getDiameter());

        q1_Rectangle rectangle = new q1_Rectangle(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is "+rectangle.getArea());
        System.out.println("The perimeter is "+rectangle.getPerimeter());
    }
}
