
package maiin;

public class Maiin {

    public static void main(String[] args) {
        Rectangle dik = new Rectangle(4,40);
        Rectangle dik2 = new Rectangle(3.5,35.9);
        System.out.println(dik.getGenislik());
        System.out.println(dik.getYukseklik());
        System.out.println("Alanı : "+dik.getArea());
        System.out.println("Çevresi : "+dik.getPerimeter());
        System.out.println("");
        System.out.println(dik2.getGenislik());
        System.out.println(dik2.getYukseklik());
        System.out.println("Alanı : "+dik2.getArea());
        System.out.println("Çevresi : "+dik2.getPerimeter());
        
    }
    
}
