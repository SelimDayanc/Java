/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bolmesizbolme;

import java.util.Scanner;

/**
 *
 * @author Selim
 */
public class Bolmesizbolme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayı : ");
        int sayı1 = scan.nextInt();
        System.out.print("2. Sayı : ");
        int sayı2 = scan.nextInt();
        int i = 0;
       
        while(sayı2<=sayı1){
            sayı1 = sayı1 - sayı2;
            i++;
        }
        System.out.println("Bölüm : " + i);
        System.out.print("Kalan : " + sayı1 );
    }
    
}
