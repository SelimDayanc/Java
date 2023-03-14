
package javaapplication56;
import java.util.Scanner;
import java.util.Random;
public  class JavaApplication56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      Random rand = new Random();
        System.out.print("0-10 Arasında Bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int randsayi = rand.nextInt(11);
        
            for(int i = 5;i>-1;i--){
                 System.out.println("Üzgünüm Yanlış Cevap Verdiniz :( " +randsayi);
                 System.out.println("Kalan canınız : " + i);
                 sayi = scan.nextInt();
                 if(sayi==randsayi){
                    System.out.println("Bravo Doğru Cevap Verdiniz Sayı : " + randsayi + "'idi");
                    return;
                 }
                 if(sayi>randsayi){
                     System.out.println("Biraz sayınızı küçülte bilirsiniz");
                 }if(sayi<randsayi){
                     System.out.println("Sayınızı Biraz Büyültün Derim");
                 }
                 if(i==1){
                     System.out.println("Üzgünüz Canınız Bitti Sayı " + randsayi + "'idi");
                     return;
                 }
                 
            }
                
            
            
        
        }
    }

