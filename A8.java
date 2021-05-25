package nyplab.Lab8;

import java.util.ArrayList;
import java.util.Collections;

public class kume {

    ArrayList<Integer> liste = new ArrayList();

    // parametresiz constructor
    public kume() {
    }

    // a dizisinin elemanlarindan olusan kume 
    public kume(int[] a) {
        for (int i = 0; i < a.length; i++) {
            liste.add(i, a[i]);

        }
    }

    //copy constructor
//Z    public kume(kume a) {
//liste.
//    }
    // kumeye yeni eleman ekleme
    public void ekle(int a) {
        liste.add(a);

    }

    //kume icerigini yazdirir
    public void yazdir() {
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i) + ",");

        }

    }

    //cagrici obje ile parametre objenin denk kume olup olmadigini test eder 
    public boolean esit(kume a) {
        Collections.sort(liste);
        Collections.sort(a.liste);
        boolean sonuc = true;
        int x = 0;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) == a.liste.get(i)) {
                x = 1;

            } else {
                x = 0;
                break;
            }

        }
        if (x == 1) {
            sonuc = true;
        } else if (x == 0) {
            sonuc = false;
        }
        return sonuc;

    }

    //cagrici obje ile parametre objenin esit kume olup olmadigini test eder
    public boolean denk(kume a) {

        return liste.size() == a.liste.size();

    }

    // cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur 
    public kume birlesim(kume a) {
        Collections.sort(liste);
        Collections.sort(a.liste);
        kume deneme = new kume();
        int x = 0;
        deneme.liste = (ArrayList) liste.clone();

        if (liste.size() > a.liste.size()) {
            for (int i = 0; i < liste.size(); i++) {

                if (liste.get(i) == a.liste.get(i)) {
                    deneme.ekle(liste.get(i));

                } else {
                    if (deneme.liste.contains(liste.get(i)) == true) {
                        deneme.ekle(a.liste.get(i));
                    } else if (deneme.liste.contains(a.liste.get(i)) == true) {
                        deneme.ekle(liste.get(i));
                    } else {
                        deneme.ekle(a.liste.get(i));
                        deneme.ekle(liste.get(i));
                    }

                }

            }
        } else {
            for (int i = a.liste.size() - liste.size(); i < a.liste.size(); i++) {
                if (deneme.liste.contains(liste.get(x)) == true) {
                    deneme.ekle(a.liste.get(i));
                    x++;
                }

            }
        }
        return deneme;
    }

    //cagrici obje ile parametre objenin kesisiminden olusan kumeyi dondurur
    public kume kesisim(kume a) {
        Collections.sort(liste);
        Collections.sort(a.liste);
        kume deneme = new kume();
        int x = 0;
        deneme.liste = (ArrayList) liste.clone();

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) == a.liste.get(i)) {
                deneme.ekle(liste.get(i));
            }

        }

        if (liste.size() < a.liste.size()) {
            for (int i = a.liste.size() - liste.size(); i < a.liste.size(); i++) {
                if (liste.get(x) == a.liste.get(i)) {
                    deneme.ekle(a.liste.get(i));
                    x++;
                }

            }
        }
        return deneme;

    }

    /// cagrici obje ile parametre objenin farkindan olusan kumeyi dondurur 
    public kume fark(kume a) {
        int x = 0, y = 0;

        for (int i = 0; i < liste.size(); i++) {
            if (a.liste.contains(liste.get(i))) {

            } else {
                x++;
            }
        }
        int[] dizi = new int[x];
        for (int i = 0; i < liste.size(); i++) {
            if (a.liste.contains(liste.get(i))) {

            } else {
                dizi[y] = liste.get(i);
                y++;
            }
        }
        kume deneme = new kume(dizi);
        return deneme;
    }

    //kumenin alt kumelerinden olusan bir ArrayList<kume> dondurur 
    public ArrayList<kume> altkumeleri() {

        int y = liste.size() - 1;
        ArrayList<kume> yeniliste = new ArrayList<>();
        kume a1 = new kume();
        kume a2 = new kume();
        kume a3 = new kume();
        kume a4 = new kume();
        kume a5 = new kume();
        kume a6 = new kume();
        kume a7 = new kume();

        a1.ekle(liste.get(0));
        a2.ekle(liste.get(1));
        a3.ekle(liste.get(2));
        for (int i = 0; i < y; i++) {
            a4.ekle(liste.get(i));
        }
        for (int i = 1; i < liste.size(); i++) {
            a5.ekle(liste.get(i));
        }
        for (int i = 0; i < liste.size(); i++) {
            if (i != 0) {
                i++;
            }
            if (i > 2) {
                break;
            }
            a6.ekle(liste.get(i));
        }
        for (int i = 0; i < liste.size(); i++) {
            a7.ekle(liste.get(i));
        }

        yeniliste.add(a1);
        yeniliste.add(a2);
        yeniliste.add(a3);
        yeniliste.add(a4);
        yeniliste.add(a5);
        yeniliste.add(a6);
        yeniliste.add(a7);

        return yeniliste;

    }

    public static void main(String[] args) {

        kume km = new kume();

        km.ekle(10);
        km.ekle(11);
        km.ekle(2);
        System.out.print("km = {");
        km.yazdir();
        System.out.println("}");
        int[] a = {1, 2, 3, 4, 5, 6};
//        int [] b = { 6,5,4,3,2,1};
        kume km2 = new kume(a);
        System.out.print("km2 = {");
        km2.yazdir();
        System.out.println("}");
        kume km3 = new kume(a);
        System.out.print("km3 = {");
        km3.yazdir();
        System.out.println("}");
        if (km.denk(km2)) {
            System.out.println("km ve km2 kumeleri denk.");
        } else {
            System.out.println("km ve km2 kumeleri denk degil.");
        }
        if (km2.esit(km3)) {
            System.out.println("km2 ve km3 kumeleri esit.");
        } else {
            System.out.println("km2 ve km3 kumeleri esit degil.");
        }
        kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = {");
        sn.yazdir();
        System.out.println("}");
        kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = {");
        sn2.yazdir();
        System.out.println("}");
        kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki = [");
        sn3.yazdir();
        System.out.println("}");
        System.out.println("km\'nin alt kumeleri");
        ArrayList<kume> sonuc = km.altkumeleri();
        for (int i = 0; i < sonuc.size(); i++) {
            System.out.print("{");
            sonuc.get(i).yazdir();
            System.out.println("}");
        }
    }

}
