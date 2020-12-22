//190202056 Berkay Yasin Çiftçi
package nyplab.Lab10;

import java.util.Vector;

public class Autopark {

    Vector<Automobile> sayarpark;
    static long otoparkKasasi = 0;
    double girisSaati, cikisSaati, gecirilenSure, kasayaEkle;

    Autopark(int size) {
        this.sayarpark= new Vector < Automobile>(size);
        
        otoparkKasasi = 0;
    }

    public void girisYap(Automobile oto) {
        if (sayarpark.capacity() >sayarpark.size()) {
            sayarpark.add(oto);
            this.girisSaati = System.currentTimeMillis();
            System.out.print(" \n" + oto.getLicense() + " Arac otoparka giris yaptı.");           
            System.out.print("Otopark kapasitesi ve boyutu : " + sayarpark.capacity() + " , " + sayarpark.size());

        } else {
            {
                System.out.println("\n"+oto.getLicense() + " Arac park edemedi.");
            }

        }

    }

    public void cikisYap(Automobile oto) {
        if (sayarpark.contains(oto)) {

            cikisSaati = System.currentTimeMillis();
            gecirilenSure = cikisSaati - girisSaati;
            kasayaEkle = +(gecirilenSure / 100f) * 10;
            Autopark.otoparkKasasi = (long) (otoparkKasasi + kasayaEkle);
            System.out.println(oto.getLicense() + " Arac otoparktan " + gecirilenSure + " milisaniye sonra cikti.");
            System.out.println("Kasaya eklenecek tutar( " + gecirilenSure / 100f + " saniye*saniye basina 10 TL )= "+(int)kasayaEkle);
            sayarpark.remove(oto);
        } else {
            System.out.println("Arac bulunamadi.");
        }

    }

    public static void kasaBilgi() {
        System.out.println("Kasada toplam para : " +otoparkKasasi);
    }

    // Calisma 1 
    public int recursiveTopl(int n) {
        if (n <= 2) {
            return 1;

        } else {
            return 3 * recursiveTopl(n / 2) + n;
        }
    }

    public Vector<Automobile> getSayarpark() {
        return sayarpark;
    }

    public void setSayarpark(Vector<Automobile> sayarpark) {
        this.sayarpark = sayarpark;
    }

    public static long getOtoparkKasasi() {
        return otoparkKasasi;
    }

    public static void setOtoparkKasasi(long otoparkKasasi) {
        Autopark.otoparkKasasi = otoparkKasasi;
    }

    public double getGirisSaati() {
        return girisSaati;
    }

    public void setGirisSaati(double girisSaati) {
        this.girisSaati = girisSaati;
    }

    public double getCikisSaati() {
        return cikisSaati;
    }

    public void setCikisSaati(double cikisSaati) {
        this.cikisSaati = cikisSaati;
    }

    public double getGecirilenSure() {
        return gecirilenSure;
    }

    public void setGecirilenSure(double gecirilenSure) {
        this.gecirilenSure = gecirilenSure;
    }

    public double getKasayaEkle() {
        return kasayaEkle;
    }

    public void setKasayaEkle(double kasayaEkle) {
        this.kasayaEkle = kasayaEkle;
    }

    public static void main(String[] args) throws InterruptedException {
        Autopark park = new Autopark(1);
        Automobile a = new Automobile("41 BR 123");
        Automobile b = new Automobile("34 TR 456 ");
        park.girisYap(a); // a otoparka giris yapiyor
        Thread.sleep(200); // 200 milisaniye zaman geçiyor.

        park.girisYap(b); // b otoparka giris yapiyor
        Thread.sleep(999); // 999 milisaniye zaman geçiyor
        park.cikisYap(b); // b otoparktan cikiyor        
        park.cikisYap(a); // a otoparktan çıkıyor –aslında yukarda kapasitededen dolayı giremediği için (park edemedi) araç bulunamadı yaziyo
        park.kasaBilgi(); // otoparktaki toplam parayı yazdırıyor. 

    }

}
