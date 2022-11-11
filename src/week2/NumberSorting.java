package week2;

import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {

       //kullanıcıdan veri almak için değişken tanımlıyoruz.
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıralamak istediğiniz 3 sayıyısı sırasıyla giriniz:");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();

        if(num1>num2 && num1>num3){
            if(num2>num3)
                System.out.println(num1+">"+ num2 +">"+num3);
            else if(num2==num3)
                System.out.println(num1+">"+num2+"="+num3);
            else
                System.out.println(num1+">"+num3+">"+num2);
        }
        else if(num2>num1 && num2>num3){
            if(num1>num3)
                System.out.println(num2+">"+num1+">"+num3);
            else if(num1==num3)
                System.out.println(num2+">"+num1+"="+num3);
            else
                System.out.println(num2+">"+num3+">"+num1);
        }
        else if(num3>num2 && num3>num1){
            if(num2>num1)
                System.out.println(num3+">"+num2+">"+num1);
            else if(num2==num1)
                System.out.println(num3+">"+num2+"="+num1);
            else
                System.out.println(num3+">"+num2+">"+num1);
        }else{
            System.out.println(num1+" = "+num2+" = "+num3);
        }

    }
}
