public class MainOCP {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 5);
        Circle circle = new Circle(5);
        AreaCalculator areaR = new AreaCalculator();
        AreaCalculator areaC = new AreaCalculator();
        areaR.calculateArea(rectangle);
        areaR.prinToscreen(rectangle);
        areaC.calculateArea(circle);
        areaC.prinToscreen(circle);
    }
}
