package week1.UcgenAlanıHesaplama;

import java.util.Scanner;

public class UcgenAlaniHesapla {
    public static void main(String[] args) {
        double k1,k2,k3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci kenar uzunluğunu giriniz :");
        k1= scan.nextDouble();

        System.out.println("İkinci kenar uzunluğunu giriniz :");
        k2= scan.nextDouble();

        System.out.println("Üçüncü kenar uzunluğunu giriniz :");
        k3= scan.nextDouble();

        double u = (k1+k2+k3)/2;
        double cevre = 2*u;
        double alan = Math.sqrt(u * (u-k1) * (u-k2) * (u-k3));

        System.out.println("Üçgenin çevresi: " + cevre );
        System.out.println("Üçgenin alanı: " + alan);

    }
}
