
import java.util.Scanner;


public class Projeler {
    public static void main(String[] args) {
      int vize,  ffinal;
      double ortalama;
      Scanner input = new Scanner(System.in);
        System.out.println("Vize Notunu Giriniriz");
        vize = input.nextInt();
        System.out.println("Final Notunu Girinizi");
        ffinal = input.nextInt();
      
        ortalama = (vize*0.4)+(ffinal*0.6);
        System.out.println("Not Ortalamamnız :"  +  ortalama);
        String sonuc = (ortalama >=50)?"Geçtiniz" : "Kaldınız";
    } 
    
}
