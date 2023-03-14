package geosekil;

public class GeoSekil {

    public static void main(String[] args) {
       denemeGeoSekil deneme = new dikdortgen(10,5);
       System.out.println("Dikdörtgenin Alanı : " + getAlan(deneme));
       System.out.println("Dikdörtgenin Çevresi : " +getCevre(deneme));

    }
    public static double getAlan(denemeGeoSekil nesne){
        return nesne.getAlan();
    }
    public static double getCevre(denemeGeoSekil nesne){
        return nesne.getCevre();
    }
}

