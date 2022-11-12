package week2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği yılın artık olup olmadığını bulan program
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        int year = scan.nextInt();

        boolean artik = false;
 // yıl 100' e kalansız bölünüyor mu
       if(year % 100 ==0){
           // yıl 400' e kalansız bölünüyor mu
           if(year % 400 == 0)
               artik= true; //bölünüyorsa artık yıl
     // yıl 4' e kalansız bölünüyor mu
       }else if (year % 4 ==0){
           artik = true; //bölünüyorsa artık yıl
       }else {
           System.out.println(" Girdiğiniz bilgileri kontrol edin.");
       }

        String s = artik ? year + " yili artik yildir." : year + " yili artik yıl değildir.";
        System.out.println(s);

    }
}
