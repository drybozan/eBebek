package week3;

import java.util.Scanner;

public class AsalSayiBul {
    /*
    Kendisi dışında başka böleni olmayan sayılara asıl sayılar denir.
    Recursice metot ile asal sayı kontrolü yapan program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int num = scanner.nextInt();

        AsalMi(num,2);

    }

    static boolean AsalMi(int number, int i){
        if(i == number) {
            System.out.println(number + " sayısı ASALDIR.");
            return true;
        }
        else if (number % i == 0){
            System.out.println(number + " sayısı ASAL DEĞİLDİR.");
            return false;
        }
        return AsalMi(number,i+1);
    }
}
