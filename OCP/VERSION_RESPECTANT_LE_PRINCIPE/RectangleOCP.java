public class RectangleOCP implements ShapeOCP {
  private double length;
  private double width;
    
    public RectangleOCP(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
}
