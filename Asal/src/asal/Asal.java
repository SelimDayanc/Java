//1-100 Arası Asal Sayılar
package asal;

public class Asal {

    public static void main(String[] args) {
        System.out.println("2");
    for(int i = 3;i<100;i++){
        int sayac = 0;
        for(int j = 2;j<i;j++){
            if(i%j==0){
                sayac +=1;
            }
        }if(sayac==0){
            System.out.println(i);
        }
    }
    }
    
}
