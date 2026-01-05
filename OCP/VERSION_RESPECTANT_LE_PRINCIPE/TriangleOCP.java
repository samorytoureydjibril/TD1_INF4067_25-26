public class TriangleOCP implements ShapeOCP{

    private double base;
    private double height;
    
    public TriangleOCP(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double calculateArea() {
        return 0.5 * base * height;
    
 }
}