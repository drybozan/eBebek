package week3;

import java.util.Scanner;

public class FibbonacciSerisi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Fibonnaci serisinin elaman sayisi :");
        int num = scanner.nextInt();
        Countfibonacci(num);

    }

    static void Countfibonacci(int n){
       int result=0 , num1 , num2 =1;
        for(int i=0; i<=n; i++){
            num1 = num2;
            num2 = result;
            result = num1 + num2;

            System.out.println(num1 + " + " + num2 + " = " + result);

        }


    }
}
