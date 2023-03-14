
package maiin;

public class Rectangle {
    private double genislik = 1;
    private double yukseklik = 1;
public Rectangle(double genislik,double yukseklik){
    this.genislik=genislik;
    this.yukseklik=yukseklik;
}
public double getGenislik(){
  return this.genislik;  
}
public double getYukseklik(){
  return this.yukseklik;  
}



public double getArea(){
    return genislik*yukseklik;
}
public double getPerimeter(){
    return 2*(genislik + yukseklik);
}
}
