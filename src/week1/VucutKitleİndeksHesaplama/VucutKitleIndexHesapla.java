package week1.VucutKitleİndeksHesaplama;

import java.util.Scanner;

public class VucutKitleIndexHesapla {
    public static void main(String[] args) {
        double kg , m , Vindex;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        m = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :" );
        kg = scan.nextDouble();

        Vindex = kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz :" + Vindex);
    }
}
