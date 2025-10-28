public class Square implements ShapeOCP{
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public double calculateArea() {
        return side * side;
    }
}

