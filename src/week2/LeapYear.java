package week2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        int year = scan.nextInt();

        boolean artik = false;

       if(year % 100 ==0){
           if(year % 400 == 0)
               artik= true;

       }else if (year % 4 ==0){
           artik = true;
       }else {
           System.out.println(" Girdiğiniz bilgileri kontrol edin.");
       }

        String s = artik ? year + " yili artik yildir." : year + " yili artik yıl değildir.";
        System.out.println(s);

    }
}
