package star;

import java.util.Scanner;

public class Star{
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaçlık üçgen almak istersiniz : ");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
    }
}