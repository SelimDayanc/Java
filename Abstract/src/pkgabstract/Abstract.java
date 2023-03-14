package pkgabstract;

public abstract class Abstract {

    public static void main(String[] args) {
        Abstract dik = new Dikdörtgen();
        Abstract dai = new Daire();
        System.out.println("Dairenin aialı : " + dai.getAlan(2));
        System.out.println("Dikdörtgenin aialı : " + dik.getAlan(4, 8));
    }

    public static void getCevre(Abstract nesne) {
        System.out.println();
    }
}
