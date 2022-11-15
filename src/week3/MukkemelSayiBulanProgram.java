package week3;

import java.util.Scanner;

public class MukkemelSayiBulanProgram {
    /*
    Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
kendisine eşit olan sayıya mükemmel sayı denir.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        int sum=0;
        for(int i=1; i<number; i++){
            //çarpanları bulunur
            if(number % i ==0){
                // çarpanları toplanır
                sum +=i;
            }
        }
        String s = number == sum ? number+" Mükemmel sayıdır.": number+" Mükemmel sayı değildir.";
        System.out.println(s);
    }
}
