package week3;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0;
        int sum=0;
        do {
            System.out.println(" Sayı girin :");
             n = scan.nextInt();
            if((n % 2 ==0 ) && (n % 4 ==0)){
                sum = sum+n;
            }

        }while (n % 2 ==0);
        System.out.println("Toplam :" + sum);
    }
}
