
package pkgboolean;
import java.util.Scanner;
public class Boolean {

    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
        System.out.print("Tahmin Ettiğiniz Sayıyı Giriniz : ");
        int sayi = scan.nextInt();
        int randsayi = (int)(Math.random()*100+1);
        while(sayi!=randsayi){
        if(sayi>randsayi){
            System.out.println("Biraz Düşür");
        }else if(sayi<randsayi){
            System.out.println("Biraz Arttır");
        }
        sayi = scan.nextInt();
        }
  System.out.print("Doğru Cevap \n");
  System.out.print("Sayı : " + randsayi +"\n");
  }
   }
        
    
