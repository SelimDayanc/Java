package fiinaltwo;
public class FiinalTwo{
    public static void main(String[]args){
        
        Object[] nesneler = {new aslan(),new kaplan(),new davuk(),new elma()};
        for(int i = 0;i<nesneler.length;i++){
            if(nesneler[i] instanceof hayvan)
                System.out.println(((hayvan)nesneler[i]).getSes());
        }
        for(int i = 0;i<nesneler.length;i++){
            if(nesneler[i] instanceof yenilebilir)
                System.out.println(((yenilebilir)nesneler[i]).getNasılYenir());
           
        }
         for(int i = 0;i<nesneler.length;i++){
            if(nesneler[i] instanceof canlı)
                System.out.println(((canlı)nesneler[i]).getCanlı());
        }
        
        
        
    }
}
interface canlı{
    public String getCanlı();
}
interface yenilebilir{
    public String getNasılYenir();
}
abstract class hayvan{
    public abstract String getSes();
}
class aslan extends hayvan implements canlı{@Override
    public String getSes(){
        return "Aslan : Roaar";
    }
    public String getCanlı(){
        return "Canlı";
    }
}
class kaplan extends hayvan implements canlı{@Override
     public String getSes(){
        return "Kaplan : Roaar";
    }
      public String getCanlı(){
        return "Canlı";
    }
}
class davuk extends hayvan implements yenilebilir,canlı{
    @Override
    public String getSes(){
        return "Davuk : Gıt Gıt Gıdak";
    }
    @Override
    public String getNasılYenir(){
        
       return "Tavuk : Fırında Yenir";
    }
    public String getCanlı(){
        return "Canlı";
    }
}
class elma implements yenilebilir{
    @Override
     public String getNasılYenir(){
       return "Elma : Issırılarak yenir";
    }
}