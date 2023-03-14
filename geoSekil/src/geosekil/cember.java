package geosekil;

public class cember extends denemeGeoSekil implements Interface{
public double kısaKenar;
    public double uzunKenar;
     @Override
    protected double getAlan() {
        return kısaKenar*uzunKenar;
    }

    @Override
    protected double getCevre() {
        return uzunKenar*2+uzunKenar*2;
    }
    public int ilkDeneme(){
        return 10;
    }
  
}
