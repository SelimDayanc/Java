/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosya;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Selim
 */
public class Dosya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("C:/Users/MSI-PC/Desktop/ali.txt");
        if(!file.exists()){
            System.out.println("Dosya yok");
        }
        Scanner scan = new Scanner(file);
        PrintWriter fwriter = new PrintWriter("C:/Users/MSI-PC/Desktop/ali.txt");
        fwriter.print("ssamdksamkdmaskl maslkdmlasmdmla sdmlamslkmdmas dlsakmdlkamslkdmmal ksmdlkmalsmdkmaslkd maslkmdlksamdlmaks dlksamldmsak");
        fwriter.close();
        while(scan.hasNext()){
            String a = scan.nextLine();
            System.out.println(a);
    }
    }
    
}