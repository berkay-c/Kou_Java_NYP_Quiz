//190202056 Berkay Yasin Çiftçi
package nyplab.Lab10;

public class Automobile implements Arac {

    double fuel, speed;
    String license;
    long girisZamani;
    int aracsayisi = 0;

    public Automobile() {

        aracsayisi = aracsayisi + 1;
        this.fuel = 0;
        this.speed = 0;
        this.license = null;
    }

    public Automobile(double f, double s, String l) {
        this.fuel = f;
        this.speed = s;
        this.license = l;
    }

    public Automobile(String l) {
        this.setLicense(l);
    }

    @Override
    public void hızlan(double hızlanmaOranı) {
        if (0 < hızlanmaOranı && hızlanmaOranı <= 1) {
            speed = speed + hızlanmaOranı * speed;
            if (speed > 300) {
                speed = 300;
            }

        } else {
            System.out.println("Hiz degismedi.");
        }

    }

    @Override
    public void yavasla(double yavaslamaOranı) {
        if (0 < yavaslamaOranı && yavaslamaOranı <= 1) {
            speed = speed - yavaslamaOranı * speed;
            if (speed < 0) {
                speed = 0;

            }

        } else {
            System.out.println("Hiz degismedi.");
        }

    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Hiz Sifirlandi , Arac Durdu");
    }

    public String getLicense() {
        return license;
    }

    public final void setLicense(String license) {
        this.license = license;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }

    public int getAracsayisi() {
        return aracsayisi;
    }

    public void setAracsayisi(int aracsayisi) {
        this.aracsayisi = aracsayisi;
    }

}
