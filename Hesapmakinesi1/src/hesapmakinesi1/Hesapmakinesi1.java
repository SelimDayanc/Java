
package hesapmakinesi1;

import java.util.Scanner;
import javax.swing.JLayeredPane;

public class Hesapmakinesi1 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz : " );
         int sayı1 =input.nextInt();
         System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Kök Alma\n"
                 + "6-Mutlak Alma\n7-Küp Alma\n");
         int sayı2 = input.nextInt();
        if(sayı2 == 1){
            System.out.print("Lütfen ikinci sayıyı giriniz : ");
            int sayı3 = input.nextInt();
            System.out.println("Toplama sonucuz : "+(sayı1+sayı3));
                    
        }else if(sayı2==2){
            System.out.print("Lütfen ikinci sayıyı giriniz : ");
            int sayı3 = input.nextInt();
            System.out.println("Çıkarma sonucuz : "+(sayı1-sayı3));
        }else if (sayı2==3){
       System.out.print("Lütfen ikinci sayıyı giriniz : ");
        int sayı3 = input.nextInt();
            System.out.println("Çarpma sonucuz : "+(sayı1*sayı3));
            }else if(sayı2==4){System.out.print("Lütfen ikinci sayıyı giriniz : ");
            int sayı3 = input.nextInt();
                if(sayı3==0) {
                    System.out.println("Bölme Sonucu Belirsizdir");
                }
                else{
                    System.out.println("Bölme sonucuz : "+(sayı1/sayı3));}
            }
        
        
            else if(sayı2==5){
            System.out.println("Kök Alma Sonucu : " + Math.sqrt(sayı1));
                    }else if (sayı2==6){
                        System.out.println("Mutlak Alma Sonucunuz : " + Math.abs(sayı1));
        }else if (sayı2==7){
            System.out.println("Küp Alma Sonucunuz : " + Math.pow(sayı1, 3));
            
        }else{
            System.out.println("Geçersiz İşlem Gerçekleştiridiz Yeniden Deneyiniz");
        }
                    
                    
                
                }
}
