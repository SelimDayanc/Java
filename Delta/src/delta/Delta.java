
package delta;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Delta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Denklemin Kat Sayılarını Giriniz A - B  - C  : ");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        double delta;
        delta = B*B-4*A*C;
        if(delta>0){
          double x1 ,x2;
          x1=(double) ((-B-sqrt(delta))/(2*A));
          x2=(double) ((-B+sqrt(delta))/(2*A));
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
           
        }else if(delta==0){
            int x;
            x = -B/(2*A);
            System.out.println("Tek Kök Vardır : " + x);
            
        }else{
            System.out.println("Kökler Karmaşıktır !");
        }
      
    }

   
    }
    

