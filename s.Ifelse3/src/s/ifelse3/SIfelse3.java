package s.ifelse3;
import java.io.IOException; import java.text.DecimalFormat; import java.util.Scanner;
public class SIfelse3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner giris = new Scanner(System.in);
        double satis,ucret;
        DecimalFormat nf = new DecimalFormat("###,###,00");
        System.out.println("Günlük Kaç Adet Ürün Sattınız");
        satis = giris.nextDouble();
        if(satis<50){
            ucret=15 + satis;
        }
        else{
            ucret=115+(satis-50)*3;
        }
                System.out.println("Günlük Ücretiniz: "+nf.format(ucret)+" TL");

    }
    
}

    
 
