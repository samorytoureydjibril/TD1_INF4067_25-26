package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class Mainlsp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du rectangle : " + rectangle.getArea()); // Affiche 20

        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(5);
        rectangle1.setHeight(4);
        System.out.println("Aire du carré (via Rectangle) : " + rectangle1.getArea()); 
    }

}
