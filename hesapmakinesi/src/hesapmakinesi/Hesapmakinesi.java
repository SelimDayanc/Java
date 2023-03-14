
package hesapmakinesi;

import java.util.Scanner;

public class Hesapmakinesi {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        int sayı1 =input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayı2 =input.nextInt();
         System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
       
        int sayı3=input.nextInt();
        if(sayı3==1){
            System.out.println("Toplama snucu : "+(sayı1 + sayı2));
        
        }
        else if (sayı3==2){
            System.out.println("Çıkarma sonucu : " + (sayı1 - sayı2));
        }
        else if (sayı3==3){
            System.out.println("Çarpma sonucu : "+(sayı1*sayı2));
        }
        else if (sayı3==4){
            if(sayı2==0){
                System.out.println("Bölme sonucu belirsizdir.");
            }
            else{
                System.out.println("Bölme sonucu : "+(sayı1/sayı2));
            }
        }
       
        }
        
    }
    

