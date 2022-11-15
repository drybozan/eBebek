package week3;

import java.util.Scanner;

public class UsHesabiYapanProgram {
    /* örn:
    recursive metot ile üs alma ;
 2^4 = 2 * 2^3
 2^3 = 2 * 2^2

  */
    static int pow(int x, int y){
        if(y == 0) return 1;
        return x * pow(x , y - 1);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int num1 = scanner.nextInt();

        System.out.print("Üs değerini giriniz:");
        int num2 = scanner.nextInt();


        System.out.println("Sonuc :" + pow(num1,num2));
    }
}
