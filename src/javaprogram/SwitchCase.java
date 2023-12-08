package javaprogram;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Panggil nama : ");
        input = inputUser.next();

        switch (input){
            case "Lautaro":
                System.out.println("Lautaro hadir pak");
                break;
            case "Barella" :
                System.out.println("Barella hadir pak");
                break;
            default:
                System.out.println("tidak hadir");
        }
        System.out.println("ini akhir dari program");
    }
}
