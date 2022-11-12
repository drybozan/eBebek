package week3;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz :");
        int num1 = scanner.nextInt();

        System.out.print("Üs olacak sayıyı giriniz :");
        int num2 = scanner.nextInt();
        int total = 1;
        for (int i = 0; i<num2 ; i++){
           total *=num1;
        }
        System.out.println("Sonuc :" + total);
    }
}
