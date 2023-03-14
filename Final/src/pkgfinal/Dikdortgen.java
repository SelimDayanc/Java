
package pkgfinal;


public class Dikdortgen extends GeoSekiller{
    Dikdortgen(){
        
    }
    Dikdortgen(double uzunKenar, double kısaKenar){
        this.kısaKenar=kısaKenar;
        this.uzunKenar=uzunKenar;
    }
    public double uzunKenar;
    public double kısaKenar;
    public double getAlan(){
        return uzunKenar*kısaKenar;
    }
    public double getCevre(){
        return 2 * uzunKenar + 2 * kısaKenar;
    }
}
