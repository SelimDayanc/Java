
package odev1;
import java.util.Scanner;
public class Odev1 {
    
 public static boolean Polindromik1(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
          
            return Polindromik1(s.substring(1, s.length()-1));

        
        return false;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sözcük Giriniz");
        String x = sc.nextLine();
        if(Polindromik1(x))
            System.out.println(x + " Polindrom");
        else
            System.out.println(x + " Polindrom Değil");
    }
}
