public class CircleOCP implements ShapeOCP {

    private double radius;
    
    public CircleOCP(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
