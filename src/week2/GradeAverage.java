package week2;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        double matematik, fizik, kimya, turkce, muzik;
        double ortalama;
        double toplamnot = 0;
        int sayac = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matematik = input.nextDouble();
        if (0<matematik && matematik<100) {
            toplamnot += matematik;
            sayac +=1;
        }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextDouble();
        if (0<fizik && fizik<100 ){
            toplamnot += fizik;
            sayac += 1;
        }

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextDouble();
        if (0<kimya && kimya<100) {
            toplamnot += kimya;
            sayac += 1;
        }

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        if (0<turkce && turkce <100) {
            toplamnot += turkce;
            sayac += 1;
        }

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextDouble();
        if (0<muzik && muzik<100) {
            toplamnot += muzik;
            sayac += 1;
        }
        ortalama = toplamnot / sayac;
        if (ortalama > 55) {
            System.out.println("Tebrikler Geçtiniz... Not Ortalamanız: " + ortalama);
        } else {
            System.out.println("Maalesef Kaldınız!!! Not Ortalamanız: " + ortalama);
        }
    }
    }

