    
/*İki Boyutlu  matrisin en küçük elemanını ve o elemana ait indisleri
bulup konsolda yazan Java programını yazınız?.*/
package list;
import java.util.Scanner;
public class List {
    
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int[][] list = new int[3][3];
  int enkucuk = 1000000;
  int indeks1 = 0;
  int indeks2 = 0;
    System.out.print("Listleri Giriniz : ");
  for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
          list[i][j] = scan.nextInt();
          if(enkucuk>list[i][j]){
          enkucuk=list[i][j];
          indeks1 = i;
          indeks2 = j;
          
             
          }
           System.out.print(list[i][j] + " ");
      }System.out.println();
      
  }System.out.println();
  System.out.print("En Küçük Sayı  :" +enkucuk +"\nİdeksi : " +indeks1 + "+" +indeks2 +"\");
 
    }
    
}
