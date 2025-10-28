package VERSION_RESPECTANT_LE_PRINCIPE;

public class Square implements Shape {
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
    

}
