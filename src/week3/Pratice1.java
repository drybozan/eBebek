package week3;

import java.util.Scanner;

public class Pratice1 {
    public static void main(String[] args) {
        int k, c= 1, i,sum =0;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Lütfen bir sayı giriniz: ");
            k = inp.nextInt();
        }

        for (i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum +=i;
                ++c;

            }

        }
        System.out.print("Ortalama : "+sum/c);
    }

}
