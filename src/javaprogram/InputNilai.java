package javaprogram;

import java.util.Scanner;
public class InputNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Input nilai pertama :");
            int n1 = input.nextInt();
            System.out.print("Input nilai kedua :");
            int n2 =input.nextInt();

            int sum=n1/n2;
            System.out.println(sum);
        }catch (Exception e){
            System.out.println("You cant do that");
        }
    }


}
