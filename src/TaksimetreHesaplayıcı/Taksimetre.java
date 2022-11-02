package TaksimetreHesaplayıcı;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double perKm=2.20 ,startPrice = 10, totalPrice;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        double km = scanner.nextDouble();

        totalPrice= startPrice +(km*perKm);
        totalPrice= (totalPrice < 20) ? 20 : totalPrice;

        System.out.println("Toplam Tutar : " + totalPrice);

    }
}
