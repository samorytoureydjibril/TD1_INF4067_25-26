package VERSION_RESPECTANT_LE_PRINCIPE;

public class MainLSP {
   public static void main(String[] args) {
    Shape square = new Square(5);
    Shape rectangle = new Rectangle(9, 5);

    System.out.println("Square Area = " + square.getArea());
    System.out.println("Square Area = " + rectangle.getArea());
   }
}
