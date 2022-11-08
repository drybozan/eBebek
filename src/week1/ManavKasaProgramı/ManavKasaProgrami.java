package week1.ManavKasaProgramı;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut =2.14, elma =3.67, domates=1.11, muz = 0.95, patlican = 5.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        double armutKg = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        double elmaKg = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? :");
        double domatesKg = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? :");
        double muzKg = scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? :");
        double patlicanKg = scanner.nextDouble();

        double toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);

        System.out.println("Toplam tutar :" +toplam);
    }
}
