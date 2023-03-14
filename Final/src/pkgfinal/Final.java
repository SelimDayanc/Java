package pkgfinal;

public class Final {

    public static void main(String[] args) {
        
        GeoSekiller nesne = new Cember(6);
        GeoSekiller nesne1 = new Dikdortgen(2, 2);
        System.out.println("Alanlar Eşitmi ? : " + Esitmi(nesne, nesne1));
        System.out.println("Çemerin");
        getGoster(nesne);
         System.out.println("Dikdörgenin");
        getGoster(nesne1);
        System.out.println();
        
        
        
        
    }
    public static boolean Esitmi(GeoSekiller a,GeoSekiller b){
        return a.getAlan()==b.getAlan();
    }
    public static void getGoster(GeoSekiller c){
        System.out.println("Alan : " + c.getAlan() + "\n" + "Çevre : " + c.getCevre());
        
    }
    
    
class ali{
    public void ali(){
        System.out.println("sda");
    }
    }
}
