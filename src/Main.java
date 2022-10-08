import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz : ");
        n = input.nextInt();

        double sonuc = 0;
        for (double i = 1; i <= n; i++) {

            sonuc = sonuc+ Math.pow(i,-1);

        }
        System.out.println("sonuç : " + sonuc);
    }
}