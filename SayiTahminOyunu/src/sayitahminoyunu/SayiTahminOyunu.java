
package sayitahminoyunu;
import java.util.Scanner;
public class SayiTahminOyunu {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sayi1 = (int)(Math.random()*100+1);
    int sayi2 = (int)(Math.random()*100+1);
    System.out.print(sayi1 + " + " + sayi2 + " Sonucunu Giriniz : ");
    int sonuc = scan.nextInt();
    while(sonuc!=sayi1+sayi2){
        System.out.println("Yanlış Cevap Tekrar Deneyiz");
        sonuc = scan.nextInt();
    }System.out.println("Doğru Cevap");
            
    }
    
}
