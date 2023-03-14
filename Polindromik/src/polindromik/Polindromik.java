
package polindromik;

public class Polindromik {

    public static void main(String[] args) {
   String str = "kelek",tmp="";
   for(int i = str.length()-1; i>= 0 ;  i--){
       tmp = tmp + str.charAt(i);
   }if(tmp.equals(str)){
        System.out.println("Polindromik");
   }
    }
    
}
