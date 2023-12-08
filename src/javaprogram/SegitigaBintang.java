package javaprogram;

public class SegitigaBintang {

        public static void main(String[] args) {
            int rows = 5;

            for (int i = 1; i <= rows * 2; i++) {
                if (i <= rows) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                }
                else {
                    for (int j = i; j <= rows * 2; j++){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }