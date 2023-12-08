package javaprogram;

public class Array {
    public static void main(String[] args) {

        //assignment
        //tipedata[] namaVariable = {1,2,3,4,5}
        System.out.println("assignment Array");
//                           0 1 2 3 4
        int[] arrayInteger = {1,2,3,4,5};

        arrayInteger[2] = 6;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        System.out.println(arrayInteger[4]);

        //Deklarasi
        //tipedata[] namaVariable = new tipedata[5]
        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];

        arrayFloat[4] = 11.5f;
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);


    }
}