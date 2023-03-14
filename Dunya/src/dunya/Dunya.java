
package dunya;
import java.util.Scanner;
public class Dunya {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VrGozluk Vr = new VrGozluk();
        VrGozluk Vr1 = new VrGozluk();
        Araba Car = new Araba();
        Bisiklet Bike = new Bisiklet();
        Ev home = new Ev();
        
        Vr.model = "Sony";
        Vr.renk = "Siyah";
        Vr.çözünürlük = "8k";
       
        
        Car.model = "Tesla y";
        Car.renk = "Kırmızı";
        Car.mod = "Spor";
        Car.motor = "Elektrikli 750 Hp"; 
        
        Bike.model = "Salcano";
        Bike.tip= "Elektrikli";
        Bike.renk = "Mor";
        
        home.buyukluk = "4.1";
        home.renk = "Mavi Beyaz";
        home.tip = "Havuzlu Müstakil";
        
     
        
        System.out.print("Dünyanızda Ne Yapmak İstersiniz; \n1-Vr Gözlük Kullan \n2-Araba Kullan \n3-Bisiklet Kullan \n4-Eve Git\n");
        int sec = scan.nextInt();
        System.out.println("");
        if(sec==1){
            System.out.println("1-Müzik Dİnle \n2-Oyun Oyna \n3-Gez");
            int a = scan.nextInt();
            if(a==1) Vr.müzikDinle();
            if(a==2) Vr.oyunOyna();
            if(a==3) Vr.gez();
            }
        if(sec==2){
            System.out.println("1-Gez \n2-Yarış Yap");
             int a = scan.nextInt();
             if(a==1) Car.gez();
             if(a==2) Car.yarısYap();
            }
        if(sec==3){
            System.out.println("Bisiklet Kullanılıyor");
        }
        if(sec==4){
            System.out.println("1-Uyu\n2-Yüz");
             int a = scan.nextInt();
            if(a==1)home.uyu();
            if(a==2)home.yuz();
        }
        }
        
        
    }

