
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.print("Sayı girişini yapınız : ");
      int input = scan.nextInt();
      int s1 = 0;
      int s2 = 1;
      int toplam ;
      
      for(int i=1;  i<=input; i++  ){
          System.out.println(s1);
          toplam = s1+s2;
          s1=s2;
          s2=toplam;
          
      }
     
    }
    
}
