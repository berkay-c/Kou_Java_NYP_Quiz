package nyplab.Lab4;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        //Birinci Çalışma

        int[][] table = new int[3][3];
        Scanner scan = new Scanner(System.in);
        int cift = 0;
        int tek = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Dizi [" + i + "," + j + "]=");
                table[i][j] = scan.nextInt();

            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] % 2 == 0) {
                    cift++;

                }

                if (table[i][j] % 3 == 0) {
                    if (table[i][j] == 0) {
                        tek--;

                    }
                    tek++;

                }

            }

        }
        System.out.println(+cift + " tane çift sayı vardır.");
        System.out.println("3 ün katı olan " + tek + " tane sayı vardır.");

        /*  // İkinci Çalışma
        System.out.println("Kaç adet sayı gireceksiniz:");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int max=0; int cout=0; int temp=0;
        int[]table =new int [n];
        for (int i = 0; i < n; i++) {
            table[i]=scan.nextInt();
            
        }
        for (int i = 0; i < n-1; i++) {
            if(table [i]<table[i+1]){
                cout++;
                max=cout;
            
        }else if(table[i]>=table[i+1])
        {
            cout=0;
            if(temp<max)
            {
                temp=max;
            }
        }
        
         
    }
      System.out.println("En uzun artan dizinin uzunluğu:"+temp);*/
    }
}
