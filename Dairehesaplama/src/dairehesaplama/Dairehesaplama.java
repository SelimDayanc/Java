
package dairehesaplama;

import java.util.Scanner;

public class Dairehesaplama {

    public static void main(String[] args) {
     double alan,cevre;
     int yarıcap;
     Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yarı Çapı Giriniz");
        yarıcap=input.nextInt();
        alan = yarıcap*yarıcap*3.14;
        cevre = 2*yarıcap*3.14;
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
    
}
