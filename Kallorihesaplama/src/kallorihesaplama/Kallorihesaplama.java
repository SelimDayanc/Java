
package kallorihesaplama;

import java.util.Scanner;

public class Kallorihesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gender;
        System.out.println("cinsiyet giriniz");
        gender=scan.nextInt();
        
        double kg,size,age,kalori;
        System.out.println("kilogramınızı giriniz");
        kg = scan.nextDouble();
        System.out.println("Boyunuzu giriniz");
        size = scan.nextDouble();
        System.out.println("Yaşınızı giriniz");
        age = scan.nextDouble();
        
        if(gender==2){
        kalori = 655 +9.6*kg+1.8*size-4.7*age;
            System.out.println(kalori);
        }else{kalori = 66 +13.7*kg+5*size-6.8*age;
            System.out.println(kalori);
        }
        
    }
    
}
