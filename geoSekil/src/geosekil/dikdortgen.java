package geosekil;

public class dikdortgen extends denemeGeoSekil {

    public double kısaKenar;
    public double uzunKenar;
    dikdortgen(double kısaKenar,double uzunKenar){
        this.kısaKenar=kısaKenar;
        this.uzunKenar=uzunKenar;
    }

    @Override
    protected double getAlan() {
        return kısaKenar*uzunKenar;
    }

    @Override
    protected double getCevre() {
        return uzunKenar*2+uzunKenar*2;
    }

}
