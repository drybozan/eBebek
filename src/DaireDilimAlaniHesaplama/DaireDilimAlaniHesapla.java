package DaireDilimAlaniHesaplama;

import java.util.Scanner;

public class DaireDilimAlaniHesapla {
    public static void main(String[] args) {
        double pi =3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin çapı: ");
        int r = scanner.nextInt();

        System.out.println("Dairenin merkez açısı: ");
        int a= scanner.nextInt();
        double sonuc = (pi * (r*r) * a) / 360;

        System.out.println(" Alan :" + sonuc);
    }
}
