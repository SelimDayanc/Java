
package metodlar;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Metodlar {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı girişi : "); 
        int input = scan.nextInt();
       
            for(int i = 1;i<=input;i++){
            System.out.print(i);
        }for(int k= 1 ;k<=input;){
            input--;
            System.out.print(input);
        }
   } 
}
