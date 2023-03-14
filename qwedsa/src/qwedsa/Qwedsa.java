/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qwedsa;

import java.util.Scanner;

/**
 *
 * @author Selim
 */
public class Qwedsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner girdi= new Scanner(System.in);
System.out.println("10'luk sistemde bir sayı yazın");
int onluk = girdi.nextInt();
 
int binary[] = new int[1000];
int sira = 0;
 
while(onluk > 0){
  binary[sira++] = onluk%2;
  onluk = onluk/2;
}
 
for(int i = sira-1 ; i >= 0 ; i--){
  System.out.print(binary[i]);
}
    }
    
}
