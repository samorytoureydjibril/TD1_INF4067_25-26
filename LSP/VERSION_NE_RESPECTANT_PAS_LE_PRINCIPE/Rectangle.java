package VERSION_NE_RESPECTANT_PAS_LE_PRINCIPE;

public class Rectangle {
  protected int width;
  protected int height;

  public void setWidth(int width){
    this.width = width;
  }
  public void setHeight(int height){
    this.height = height;
  }
  public int getArea(){
    return width * height;
  }
}
