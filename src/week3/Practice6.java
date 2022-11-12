package week3;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int num = input.nextInt();
        int basamakDeger,basamakToplami=0;

        while(num != 0){
            basamakDeger = num % 10;
            basamakToplami += basamakDeger;
            num /= 10;
        }
        System.out.println(" Sayısının basamakları toplamı = "+basamakToplami);
    }
}
