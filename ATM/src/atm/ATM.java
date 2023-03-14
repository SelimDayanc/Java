
package atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int bakiye = 1000,input,miktar = 0;
        System.out.println("Dayanç Bankına Hoş Geldiniz !!");
        System.out.println("Güncel Bakiyeniz : "
        + bakiye + " TL" );
       while(bakiye>0){
           System.out.println();
           System.out.println("1- Para Yatırma");
           System.out.println("2- Para Çekme");
           System.out.println("3- Bakiye Sorgulama");
           System.out.println("4- Çıkış");
           input = scan.nextInt();
           if(input==1){
               System.out.print("Yatırmak istediğiniz miktarı seçiniz : ");
               miktar = scan.nextInt();
               bakiye = bakiye + miktar;
               
           }else if (input == 2){
               miktar = scan.nextInt();               System.out.print("Çekme İstediğiniz miktarı seçinizi :  ");

               if(miktar>bakiye){
                   System.out.println("Yetersiz bakiye ");
               }else{
                   
               
           
              bakiye = bakiye - miktar;}
           }else if (input ==3){
               System.out.print("Güncel Bakiyeniz : " + bakiye + " TL");
               
           }else if(input ==4){
               System.out.print("Çıkış Yapıldı !!"
               + "  Görüşmek Üzere");
               break ; 
           }else{
               System.out.print("Geçersiz işlem girdiniz");
           }
           
       }
        
        
        
    }
    
}
