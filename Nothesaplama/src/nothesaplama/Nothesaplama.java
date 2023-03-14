
package nothesaplama;

import java.util.Scanner;

public class Nothesaplama {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Türkçe Notunu Giriniz");
        int türkçe =input.nextInt();
        System.out.println("Mat Notunu Giriniz");
        int m =input.nextInt();
        System.out.println("Fen Notunu Giriniz");
        int f =input.nextInt();
        System.out.println("Beden Notunu Giriniz");
        int b =input.nextInt();
        System.out.println("Müzik Notunu Giriniz");
        int mü =input.nextInt();
        double ort;
        ort = (türkçe+m+f+b+mü)/5;
        System.out.println("Ortalamanız :"+ ort);
        if(ort<50){
            System.out.println("Üzgünüm Kaldınız..");
        }else{
            System.out.println("Tebrikler Geçtiniz..");
        }
                
    }
    
}
