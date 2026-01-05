package Pattern_Adapter;

public class DocumentHTML implements Document {

    @Override
    public void setContenu() {
        System.out.println("<HTML>..........<H1>Document HTML</H1>...........</HTML>");
    }

    @Override
    public void dessine() {
        System.out.println("Dessin en SVG ");
    }

    @Override
    public void imprime() {
        System.out.println("IMPRESSION DOCUMENT HTML EN COURS...");
    }

}
