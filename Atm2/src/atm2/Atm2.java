package atm2;
import java.util.Scanner;
import java.lang.Math;
public class Atm2{
    public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         String isim;
         String soyIsim;
         long tc;
         long kartNumarası;
         int sifre = 0;
         int sifreTekrar;
         int girisSifre;
         int hak = 2;
         int bakiye = 0;
         int bakiyeCopy = 0;
         int yatırma = 0;
         int cek = 0;
         
         System.out.println("DAYANÇ Bankasına Hoş Geldiniz \n 1-Kart Oluştur \n 2-Giriş Yap");
         int sec = scan.nextInt();
         if(sec==1){
             System.out.print("İsim : ");
             isim = scan.next();
             System.out.print("Soyİsim : ");
             soyIsim = scan.next();
             System.out.print("TC : ");
             tc = scan.nextLong();
             kartNumarası = (long) (Math.random()*1000000000);
             System.out.print("6 Haneli Şifre Belirleyiniz : ");
             sifre = scan.nextInt();
             System.out.print("Şifreyi Yeniden Giriniz : ");
             sifreTekrar = scan.nextInt();
             while(sifre!=sifreTekrar){
                 System.out.println("Şifreler Uyuşmadı Tekrar Deneyiniz ");
                 System.out.print("6 Haneli Şifre Belirleyiniz : ");
                 sifre = scan.nextInt();
                 System.out.print("Şifreyi Yeniden Giriniz : ");
                 sifreTekrar = scan.nextInt();
             }
             System.out.println("");
             System.out.println("İsim : " + isim + "\nSoyİsim : " + soyIsim + "\nKartNumarası : " + kartNumarası + "\nŞifre : " + sifre +"\nBAŞARILI BİR ŞEKİLRDİ OLUŞTURULDU");
             
         } 
         System.out.println("");
         System.out.print("Şfirenizi Giriniz : ");
         girisSifre=scan.nextInt();
             while(girisSifre != sifre){
                 System.out.println("Şifre Yanlış " + hak + " Hakkınız Kaldı");
                 System.out.print("Şfirenizi Giriniz : ");
                 girisSifre=scan.nextInt();
                 hak-=1;
                 if(hak==0){ 
                    System.out.println("Kartınız Bloke Oldu ");
                    return;
                 }
             }
         
         while(0==0){
             System.out.println("1-Para Yatır 2-Para Çek 3-Çıkış");
             int sec2 = scan.nextInt();
                if(sec2==1){
                     System.out.print("Yatırılacak Parayı Yazınız : ");
                        yatırma=scan.nextInt();
                        bakiye +=yatırma;
                        System.out.println("Güncel Paranız : " + bakiye);
               
           }if(sec2==2){
                    System.out.print("Bakiyeniz "+bakiye+" Çekilece Parayı Yazınız : ");
                    cek=scan.nextInt();
                    while(cek>bakiye){
                        System.out.println("Okadar Paranız Yok Tekrar Deneyiniz");
                        System.out.print("Çekilece Parayı Yazınız : ");
                        cek=scan.nextInt();
                    }
                    bakiye -=cek;
                    System.out.println(cek+"TL Çektiniz Güncel Paranız : " +bakiye);
                }if(sec2==3){
                    System.out.println("Görüşmek Üzere");
                    break;
                }
                
         }
         
      
    }
}