
package dunya;
import java.util.Scanner;
public class VrGozluk{
    Scanner scan = new Scanner(System.in);
String model = "Virtual";
String çözünürlük = "4k";
String renk = "Kırmızı";
void müzikDinle(){
    System.out.println("Hangi Müziği Dinlemek İstersin \n1-Believer \n2-Vallaha Calling \n3-Hoist The  Colours \n ");
    int sec = scan.nextInt();
    if(sec==1) System.out.println("Believer Dinleniyor...");
    if(sec==2) System.out.println("Vallaha Calling Dinleniyor...");
    if(sec==3) System.out.println("Hoist The  Colours Dinleniyor...");
}
void oyunOyna(){
    System.out.print("Hangi Oyunu Oynamak İstersin \n1-The Scandbox EDU \n2-Roblox \n3-BattleField \n4-Satranç \n");
     int sec = scan.nextInt();
    if(sec==1) System.out.println("The Scandbox EDU Oyananıyor...");
    if(sec==2) System.out.println("Roblox Oyananıyor...");
    if(sec==3) System.out.println("BattleFierld Oyananıyor...");
    if(sec==4) System.out.println("Satranç Oyananıyor...");
}
void gez(){
System.out.print("Nereyi Gezmek İstiyorsun  \n1-İngiltere \n2-ABD \n3-Mars \n4-Güneş");
     int sec = scan.nextInt();
    if(sec==1) System.out.println("İngiltereye Gittin...");
    if(sec==2) System.out.println("ABD Gittin...");
    if(sec==3) System.out.println("Marsa Gittin...");
    if(sec==4) System.out.println("Güneşe Gittin...");
   
}

}


