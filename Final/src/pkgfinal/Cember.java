
package pkgfinal;


public class Cember extends GeoSekiller{
    private double yariCap;
    Cember(){
        
    }
    Cember(double yariCap){
        System.out.println(date);
        this.yariCap=yariCap;
    }
    @Override
    public double getAlan(){
        return Math.PI*yariCap*yariCap;
    }
    @Override
    public double getCevre(){
        return 2 * Math.PI *yariCap;
        
    }
    

    
}
