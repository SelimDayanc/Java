
package s.ifelse4;
import java.util.Scanner;
public class SIfelse4 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double sayi;
        System.out.println("Karekokunu bulmak için bir sayi giriniz");
        sayi = giris.nextDouble();
        
        if(sayi>=0){
            System.out.println(sayi + "'nin karekoku: "+Math.sqrt(sayi));
        }
        else{
            System.out.println("Lütfen Negatif Sayı Girmeyiniz");
        }
     
    }
    
}
