public class AreaCalculator {
    public double calculateArea(Object shape){
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHidth();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRayon() * circle.getRayon();
        }
        throw new IllegalArgumentException("Unsupported shape: " + shape);
    }

}
