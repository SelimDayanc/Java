/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayintarlasi;

import java.util.Scanner;

/**
 *
 * @author Selim
 */
public class Mayintarlasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row,colomn;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlasına hoş geldiniz");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz : ");
        System.out.print("satır sayısı : ");
        row = scan.nextInt();
        System.out.print("sütun sayısı : ");
        colomn = scan.nextInt();
        mayin main = new mayin(row,colomn);
        main.run();
        
    }
    }
    
}
