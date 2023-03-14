package aray;
import java.util.Scanner;
import java.util.Random;


public class Aray {

     public static void main(String[] args) {
         int can=5,prediction;
         boolean gamestate;
         Random rand = new Random();
         int number = rand.nextInt(10);
         int i = 0;
         Scanner scan = new Scanner(System.in);
         System.out.print("0 ile 10 Arasında Bir Sayı Tahmin Edin : ");
         prediction = scan.nextInt();
         while(prediction<0 || prediction>10){
             if(0<can){
                 
             i++;
             System.out.println("Geçersiz sayı tekrak deneyin ");
             prediction = scan.nextInt();
             
             if(i==3){
                 System.out.println("Çok Fazla Geçersiz İşlem Girdiniz Canınız Gitti ");
                 --can;
                 System.out.println("Kalan Canınız : " + can);
                 
             }
             }
         }
            
         while(2<=can){
             if(prediction==number){
                 System.out.println("Tebrikler Doğru Tahmin");
                 System.out.print("Sayı : " + number + "'idı");
                 break;
             }else{
                 System.out.println("Üzgünüm Yanlış Tahmin Tekrar Deneyiniz "
                 + "Kalan canınız : " + --can);
                 prediction = scan.nextInt();
                 
             }
             }if(prediction != number){
                 System.out.println("Kaybettin sayı : " + number + "'idi");
         }
             else{
                 System.out.println("\n Aferin leen");
             }
                 
         
         
         
             
                 
             }
         }