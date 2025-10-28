public class MainOCP {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 5);
        AreaCalculator area = new AreaCalculator();
        area.calculateArea(rectangle);
    }

}
