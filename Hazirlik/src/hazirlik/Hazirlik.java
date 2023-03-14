package hazirlik;

public class Hazirlik {

    public static void main(String[] args) {
        Object[] nesneler = {new Civciv(),new Karpuz()};
        for(int i = 0;i<nesneler.length;i++){
            if(nesneler[i] instanceof Yenilebilir)
                System.out.println(((Yenilebilir)nesneler[i]).nasılYenilir());
            if(nesneler[i] instanceof Hayvan)
                System.out.println((((Hayvan)nesneler[i]).Ses()));
        }
        
       
        
        
        
    }
}

interface Yenilebilir {

    public String nasılYenilir();
}

abstract class Hayvan {

    protected abstract String Ses();
}

class Civciv extends Hayvan implements Yenilebilir {
@Override
    public String Ses() {
        return "cik cik";
    }
@Override
    public String nasılYenilir() {
        return "Izgara";
    }
}
class Karpuz implements Yenilebilir{
    public String nasılYenilir(){
        return "Ağız Yoluyla";
    }
}
