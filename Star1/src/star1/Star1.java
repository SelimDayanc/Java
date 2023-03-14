package star1;

import java.util.Scanner;

public class Star1{
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaçlık üçgen almak istersiniz : ");
        int n = scan.nextInt();
        int t = 0;
        for(int i = 1;i<=n;i++){
            for(int k = n;t<=k;k--)
                System.out.print(" ");
                t++;
            for(int j = 0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
        
        
        
    }
}
