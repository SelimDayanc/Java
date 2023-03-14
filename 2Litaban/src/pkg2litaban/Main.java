
package pkg2litaban;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);
        System.out.print("10 Tabanından bir sayı girin : ");
        int sayi = scan.nextInt();
        int list[] = new int[100];
        int j = 0;
        while(sayi>0){
            list[j++]=sayi%2;
            sayi /=2;
            
        }
        for(int i = j-1 ; i>=0 ; i--){
            System.out.print(list[i]);
        }
        
        System.out.println();
             

    }
    
}
