package nyplab.Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Calisma 1
/*
        int x;
        int uzunluk;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sayac = 0;
        Scanner girdi = new Scanner(System.in);
        while (true) {
            System.out.println("Lütfen bir sayı giriniz. Eğer çıkmak istiyorsanız 0’a basınız. ");
            x = girdi.nextInt();
            if (x == 0) {
                break;
            } else {
                if (x < 0) {
                    x = x * -1;
                }
                list.add(x);
            }
        }
        Collections.sort(list);

        if ((list.size() % 2 == 1)) {
            int y = (((list.size() + 1) / 2) - 1);
            System.out.println("Medyan = " + list.get(y));
        } else {
            double iki = list.size() / 2.0;
            double ortanca = ((list.get((int) iki - 1) + list.get((int) iki)) / 2.0);
            System.out.println("Medyan = " + ortanca + " ");

        }*/
        // Calisma 2
        /*
        System.out.println("Kaç adet sayı gireceksiniz:");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int fark;int maxfark=0;
        int[]table =new int [n];
        for (int i = 0; i < n; i++) {
            table[i]=scan.nextInt();
            
        }
        for (int i = 0; i < n-1; i++) {
            if(table [i]<table[i+1]){
            
            fark=table[i+1]-table[i];
                if (maxfark<fark) {
                    maxfark=fark;
                }
                    
                }          
            
            }
        System.out.println(" maks fark "+maxfark);
         */
        //Calisma 3
        /*
         String s= "Java Programlama Dersi Fall 2012 " ;
         System.out.println(s.substring(s.indexOf("Java"), 5)+s.substring(s.indexOf("Fall"),32));
         */
    }
}
