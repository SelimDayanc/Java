package pkgfinal;

import java.util.Date;

public abstract class GeoSekiller {
    Date date = new Date();

    GeoSekiller() {
        java.util.Date date = new java.util.Date();
    }

    protected abstract double getAlan();

    protected abstract double getCevre();

}
