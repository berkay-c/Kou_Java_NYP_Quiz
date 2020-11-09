package nyplab.Lab2;

import java.util.Scanner;
import static jdk.vm.ci.meta.JavaKind.Int;

public class Lab2 {

    public static void main(String[] args) {

        //Çalışma 1.1
        int taban, üs;
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen üssü alınacak değeri giriniz.");
        taban = sc.nextInt();
        System.out.println("Lütfen üs değerini giriniz.");
        üs = sc.nextInt();

        int sonuc = 1;
        for (int i = 0; i < üs; i++) {
            sonuc = sonuc * taban;

        }
        
        System.out.println(">>" + sonuc);
        /*Çalışma 1.2
        int sonuc=1;
        int taban=Integer.parseInt(args[0]);
        int üs=Integer.parseInt(args[1]);
        for (int i = 0; i < üs; i++) {
            sonuc=sonuc*taban;
            
        }
        System.out.println("Üs alma işleminin sonucu= "+sonuc);
         */
 /*Çalışma 2
        int girdi, elde = 0, kagıtpara = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz:");
        girdi = sc.nextInt();
        while (girdi % 5 <=2 ) {
            girdi--;
            elde--;
        }
        while (girdi % 5 > 2) {
            girdi++;
            elde++;
        }

        while (girdi != 0) {
            if (girdi >= 50) {
                kagıtpara++;
                girdi = girdi - 50;

            } else if (girdi >= 25 && girdi < 50) {
                kagıtpara++;
                girdi = girdi - 25;
            } else if (girdi >=10 && girdi <25) {
                kagıtpara++;
                girdi = girdi - 10;

            } else if (girdi >= 5 && girdi < 10) {
                kagıtpara++;
                girdi = girdi - 5;
            }
        }

        if (elde > 0) {
            System.out.println(kagıtpara + "kağıt para –" + elde + "TL mi yediniz :(");
        } else if (elde < 0) {
            elde = elde * -1;
            System.out.println(kagıtpara + "kağıt para - " + elde + "TL nizi yedim : )");
        } else {
            System.out.println(kagıtpara + "kağıt para");
        }
         */

    }
}
