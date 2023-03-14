
package ebokekok;

//Çarpma İşareti Kullanmadan Çarpma İşlemi Yapma

import java.util.Scanner;
public class EbokEkok {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        int s1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        int s2 = scan.nextInt();
        int toplam = 0;
        for(int i = 0;i<s2;i++){
            toplam = toplam +s1;
        }System.out.println(toplam);
    }
    
}
