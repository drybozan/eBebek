package week3;

import java.util.Scanner;

public class DeseneGoreMetotOlusturucu {
    /*
    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı gir : ");
        int num = input.nextInt();

        pattern(num,num,0);
    }

    static void pattern(int number,int temp,int n){
        if(number > 0 && n == 0){
            System.out.print(number + " ");
            number -=5;
            pattern(number,temp,0);
        }
        else if (number <= 0) {
            System.out.print(number + " ");
            number +=5;
            pattern(number,temp,1);
        }
        else if(number > 0 && number <= temp && n == 1){
            System.out.print(number + " ");
            number  +=5;
            pattern(number,temp,1);
        }
    }
}
