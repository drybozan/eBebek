package week3;

import java.util.Scanner;

public class Practice3 {
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

            int number,firstTotal=1,secondTotal=1;

            System.out.print("Sayı giriniz : ");
            if(scan.hasNextInt()) {
                number = scan.nextInt();

                System.out.print("4 un kuvvetleri: ");
                while(firstTotal<number){
                    System.out.print(firstTotal+" ");
                    firstTotal*=4;

                }
                System.out.print("\n 5 in kuvvetleri : ");

                while (secondTotal<number){
                    System.out.print(secondTotal+" ");

                    secondTotal*=5;
                }

            }
        }

}
