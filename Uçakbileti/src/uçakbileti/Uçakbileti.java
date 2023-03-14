
package uçakbileti;

import java.util.Scanner;
import java.util.concurrent.Flow;

public class Uçakbileti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yolculuk mesafesini giriniz : ");
        int km = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        int yaş = input.nextInt();
        System.out.println("Uçak Tipin Gİriniz : Tip=1(Sadece Gidiş )"
                + "Tip=2(Gidiş Dönüş)");
        int tip = input.nextInt();
        if(km>0 && yaş>0 && (tip==1 || tip==2)){
        
   
        if(yaş<12){
            if(tip==1){
               double fiyat1;
               fiyat1 = (km*0.10)-(km*0.10)*0.5 ;
                System.out.println("Fiyatınız : " + fiyat1);
               
            }else{
                double fiyat1;
                fiyat1=((km*0.10)-(km*0.10)*0.5-(km*0.10)*0.2)*2;
                System.out.println("Fiyatınız : " + fiyat1);
            }
            
    }else if(yaş<=24){
        if(tip==1){
            
            double fiyat2;
            fiyat2=(km*0.10)-(km*0.10)*0.1;
            System.out.println("Fiyatınız : " + fiyat2);
        }else{
            double fiyat2;
            fiyat2=((km*0.10)-(km*0.10)*0.2-(km*0.10)*0.1)*2;
            System.out.println("Fiyatınız : " + fiyat2);
        }
            
        }else if(yaş<=65){
            if(tip==1){
                double fiyat3;
                fiyat3=(km*0.10);
             System.out.println("Fiyatınız : " + fiyat3);

            }else{
                double fiyat3;
                fiyat3=((km*0.10)-(km*0.10)*0.2)*2;
                System.out.println("Fiyatınız : " + fiyat3);

            }
           
        }else if(yaş<150){
            if(tip==1){
                double fiyat4;
                fiyat4=(km*0.10)-(km*0.10)*0.3;
                System.out.println("Fiyatınız : " + fiyat4);
                
            }else{
                double fiyat4;
                fiyat4=((km*0.10)-(km*0.10)*0.2-(km*0.10)*0.3)*2;
                System.out.println("Fiyatınız : " + fiyat4);
            }
        }else{
            System.out.println("Lütfen Geçerli Değerler Giriniz");
        }
         }else{
            System.out.println("Lütfen Geçerli Değerler Giriniz");
        }
        
        
    
            }
}
