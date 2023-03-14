package dikdotrgen;

import java.util.Scanner;

public class Dikdotrgen{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dikdötgenin enini giriniz : ");
        int en = scan.nextInt();
        System.out.print("Lütfen dikdörtgenin boyununu giriniz : ");
        int boy = scan.nextInt();
        for(int i = 0;i<boy;i++){
            for(int j = 0;j<en;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
} 
