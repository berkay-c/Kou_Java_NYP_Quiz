// 190202056 Berkay Yasin Çiftçi
package lab_7;

import java.util.Scanner;

/**
 *
 * @author asayar
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Islemlerim i1 = new Islemlerim(5);//deger1=5;            

        System.out.println("6+5  = " + i1.topla(6));
        System.out.println("6/5  = " + i1.bol(6));
        System.out.println("6*5  = " + i1.carp(6));
        System.out.println("6-5  = " + i1.cikar(6));
        System.out.println("5==6  =" + i1.esittir(6));
        System.out.println("5<6   =" + i1.buyukdur(6));
        System.out.println("5>6   =" + i1.kucuktur(6));

        System.out.println("Daire 1 için yarıçap giriniz");
        int daire1 = sc.nextInt();
        Daire d1 = new Daire(daire1);
        System.out.println("Daire bir için;");
        d1.ekranaYazdir();
        System.out.println("Çevre alandan büyüktür =" + d1.cevreAlandanBuyuktur());
        System.out.println("Çevre alandan kücüktür =" + d1.cevreAlandanKucuktur());

        System.out.println("Daire 2 için yarıçap giriniz:");
        int daire2 = sc.nextInt();
        Daire d2 = new Daire(daire2);
        System.out.println("Daire iki  için;");
        d2.ekranaYazdir();
        System.out.println("Çevre alandan büyüktür =" + d2.cevreAlandanBuyuktur());
        System.out.println("Çevre alandan kücüktür =" + d2.cevreAlandanKucuktur());
        
        System.out.println("Faktöriyal Hesabı");
        Faktoriyal f1=new Faktoriyal();
        System.out.println("Deger Girin:");
        int deger1=sc.nextInt();
        f1.setDeger(deger1);
        f1.ekranaYazdir();
        Faktoriyal f2=new Faktoriyal();
        System.out.println("Deger Girin:");
        int deger2 = sc.nextInt();
        f2.setDeger(deger2);
        f2.ekranaYazdir();
        
        

    }

}
