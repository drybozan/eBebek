package week2;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the air temperature : ");
        double  heat = input.nextDouble();

        if (heat<5){
            System.out.println("Do skiing.");
        } else if (heat>5 && heat<15) {
            System.out.println("Go to the movies.");

        } else if (heat>15 && heat<25) {
            System.out.println("Picnic.");

        } else if (heat>25) {
            System.out.println("Go swimming.");

        }

    }
}
