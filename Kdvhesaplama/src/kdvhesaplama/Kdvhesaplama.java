package kdvhesaplama;
import java.util.Scanner;


public class Kdvhesaplama {

    public static void main(String[] args) {
        double tutar,kdv=0.18,kdvlifiyat;
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatı Girin");
        tutar = input.nextDouble();
        kdvlifiyat=tutar+tutar*kdv;
        
        System.out.println(kdvlifiyat);
    }
   
}