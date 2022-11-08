package week1.KdvTutarıHesaplama;

import java.util.Scanner;

public class KdvTutariHesapla {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ücreti giriniz:");
        double ucret = scanner.nextDouble();

        double kdvTutari = (ucret>0 && ucret<1000)? ucret*0.18:ucret*0.08;
        double kdvliTutar = ucret+ kdvTutari;
        System.out.println("KDV'siz tutar : " + ucret);
        System.out.println("KDV'li tutar : " +kdvliTutar);
        System.out.println("KDV tutarı : " +kdvTutari);
    }
}
