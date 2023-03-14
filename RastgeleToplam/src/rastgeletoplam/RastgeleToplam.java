
package rastgeletoplam;
import java.util.Scanner;
public class RastgeleToplam {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int sayi1 =(int)(Math.random()*100+1);
      int sayi2 =(int)(Math.random()*100+1);
      System.out.print(sayi1 + "+" + sayi2 + "Cevap");
      int cevap = scan.nextInt();
      while(sayi1+sayi2!=cevap){
          System.out.println("Cevap Yanlış Tekrar Deneyiniz : ");
          cevap = scan.nextInt();
      }System.out.println("Doğru Cevap");
    }
    
}
