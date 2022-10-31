import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c,u;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci Kenarı Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

    }
}