package javaprogram;

import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        double nilaiA;
        double nilaiB;
        double hasil;
        int input;
        Scanner inputUser = new Scanner(System.in);

        System.out.printf("input nilai A : ");
        nilaiA = inputUser.nextDouble();
        System.out.printf("input nilai B : ");
        nilaiB = inputUser.nextDouble();

        Kalkulator calc = new Kalkulator(nilaiA, nilaiB);

        System.out.println("Masukkan tipe operasi yang diinginkan");
        System.out.println("-------------------------------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.printf("Kode tipe operasi : ");
        input = inputUser.nextInt();
        switch(input){
            case 1:
                hasil = calc.penjumlahan(nilaiA, nilaiB);
                System.out.println("Hasil Penjumlahan dari " + nilaiA + " dengan " + nilaiB + " = " + hasil);
                break;
            case 2:
                hasil = calc.pengurangan(nilaiA, nilaiB);
                System.out.println("Hasil Pengurangan dari " + nilaiA + " dengan " + nilaiB + " = " + hasil);
                break;
            case 3:
                hasil = calc.perkalian(nilaiA, nilaiB);
                System.out.println("Hasil Perkalian dari " + nilaiA + " dengan " + nilaiB + " = " + hasil);
                break;
            case 4:
                hasil = calc.pembagian(nilaiA, nilaiB);
                System.out.println("Hasil Pembagian dari " + nilaiA + " dengan " + nilaiB + " = " + hasil);
                break;
            case 5:
                hasil = calc.modulus(nilaiA, nilaiB);
                System.out.println("Hasil Modulus dari " + nilaiA + " dengan " + nilaiB + " = " + hasil);
                break;
            default:
                System.out.println("Tipe Operasi tidak ditemukan.");
                break;
        }
    }
}

class Kalkulator {
    double nilai1;
    double nilai2;
    public Kalkulator (double x1, double x2){
        nilai1 = x1;
        nilai2 = x2;
    }
    public double modulus(double x1, double x2){
        var hasil = x1 % x2;
        return hasil;
    }
    public double penjumlahan(double x1, double x2){
        var hasil = x1 + x2;
        return hasil;
    }
    public double pembagian(double x1, double x2){
        var hasil = x1 / x2;
        return hasil;
    }
    public double perkalian(double x1, double x2){
        var hasil = x1 * x2;
        return hasil;
    }
    public double pengurangan(double x1, double x2){
        var hasil = x1 - x2;
        return hasil;
    }
}
