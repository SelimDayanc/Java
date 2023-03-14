
package uçakbileti1;
import java.util.Scanner;

public class Uçakbileti1 {
//KM Birim Başı Fiyatı :  0.10£ 
//12 Yaşından Küçük İse Toplam Fiyata %50 İndirim
//12 Ve 24 Yaş Arasındaysa Toplam Fiyata %20 İndirim
//24 Yaşından Büyükse İndirim Yok
//Gidiş Dönüş Alanlara Toplam Fiyata %5 İndirm

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
double kmfiyat =0.10;
double toplam = 0;
System.out.print("Yolculuk Mesafesinizi Giriniz : ");
double km = scan.nextInt();
System.out.print("Yaşınızı Giriniz : ");
double yas = scan.nextInt();
System.out.print("Uçuş Tipinizi Giriniz (tip = 1 Gidiş)(tip = 2 Gidiş-Dönüş) : ");
double tip = scan.nextInt();
toplam = km*kmfiyat;
if(km>0 & yas >0 & (tip==1 || tip ==2)){
    if(yas<=12){
        if(tip==1){
            toplam = toplam*0.5;
            System.out.println(toplam);
        }else{
            toplam = (2*toplam)*0.5 *0.95;
            System.out.println(toplam);
        }
    }else if(yas<=24){
        if(tip==1){
            toplam = toplam*0.8;
            System.out.println(toplam);
        }else{
            toplam = (2*toplam)*0.8 *0.95;
            System.out.println(toplam);
        }
    }else{
        if(tip==1){
            System.out.println(toplam);
        }else{
            toplam = (2*toplam)*0.95;
            System.out.println(toplam);
        }
    }
}



        
    }
    
}
