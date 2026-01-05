public class MainOCPBon {
 public static void main(String[] args) {
        ShapeOCP circle = new CircleOCP(5);
        ShapeOCP rectangle = new RectangleOCP(4, 6);
        ShapeOCP square = new Square(4);
        ShapeOCP triangle = new TriangleOCP(4, 5); // New shape added
        
        AreaCalculator2 area = new AreaCalculator2();
        area.calculateArea(triangle);
        
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Triangle Area: " + area.calculateArea(triangle)); // Display triangle area
    }

}
