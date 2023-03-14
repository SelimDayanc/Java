
package armstrong;

import java.util.Scanner;

public class Armstrong {
//ARMSTRONG Sayı = Her Basamağın,Sayının basamak sayısı kadar değer alınıp toplamları  ilk elde edilen sayıya eşitse o sayıya ARMSTRONG sayı denir
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz : ");
        int sayi = scan.nextInt();
        int sayi1 = sayi;
        int sayi2 = sayi;
        int toplam = 0;
        int rakam = 0;
        int a = 0;
        while(sayi1>0){
            sayi1 /=10;
            rakam++;
        }while(sayi2>0){
            a = sayi2 % 10;
            sayi2 /= 10;
            toplam = (int) (toplam + (Math.pow(a, rakam)));
        }if(sayi==toplam){
            System.out.println("Armstrong sayı");
        }else{
            System.out.println("Armstrong sayı değildir");
        }
        
        
        
    }
    
}
