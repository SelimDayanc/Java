package geosekil;

public class ucgen extends denemeGeoSekil {
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
}
