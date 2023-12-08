package javaprogram;

public class SwitchCaseEnum {

    public static void main(String[] args) {
        Color color = Color.GREEN;
        switch (color){
            case RED :
                System.out.println("Red");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            default:
                System.out.println("warna tidak tersedia");
        }
    }
}
