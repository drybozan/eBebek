package week2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        // define variable
        int n , m , h;

        // take data from user
        Scanner input= new Scanner(System.in);
        System.out.print( "ilk sayinizi giriniz :");
        n= input.nextInt();

        System.out.print( "ikinci sayinizi giriniz :");
        m= input.nextInt();

        System.out.println( "\n toplam 1\n cikarma 2\n carpma 3\n bolme 4 sekilde  seciniz");
        System.out.println( "seciminiz : ");
        h= input.nextInt();

        switch (h) {
            case 1 :
                System.out.println( "Toplam : " + (n + m));
                break;
            case 2 :
                System.out.println( "Çıkarma : " + (n - m));
                break;
            case 3 :
                System.out.println( "Çarpma : " + (n * m));
                break;
            case 4 :
                if (m != 0){
                    System.out.println("Bölme : " + n / m);
                }
                else {
                    System.out.println("0 bölünmez");
                }
                break;
            default :

                System.out.println("Yanlis Secim Sectiniz");


        }
    }


}
