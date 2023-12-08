package javaprogram;

import java.util.Scanner;

public class OperasiAritmatika {

    public static void main(String[] args) {
        int nilaiA;
        int nilaiB;
        int hasil;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("input nilai A :");
        nilaiA = inputUser.nextInt();
        System.out.println("input nilai B");
        nilaiB = inputUser.nextInt();

        //penjumlahan
        hasil = nilaiA + nilaiB;
        System.out.printf("%d +%d = %d \n",nilaiA,nilaiB,hasil);

        //pengurangan
        hasil = nilaiA - nilaiB;
        System.out.printf("%d - %d = %d \n",nilaiA,nilaiB,hasil);

        //perkalian
        hasil = nilaiA * nilaiB;
        System.out.printf("%d * %d = %d \n",nilaiA,nilaiB,hasil);

        //pembagian
        hasil = nilaiA / nilaiB;
        System.out.printf("%d / %d = %d \n",nilaiA,nilaiB,hasil);

        //modulus
        hasil = nilaiA % nilaiB;
        System.out.println(hasil);
    }
}
