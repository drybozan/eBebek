package NotOrtalamasıHesaplama;

import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        float mat = scan.nextFloat();

        System.out.print("Fizik notunuzu giriniz:");
        float fzk = scan.nextFloat();

        System.out.print("Kimya notunuzu giriniz:");
        float kmy = scan.nextFloat();

        System.out.print("Turkce notunuzu giriniz:");
        float trkc = scan.nextFloat();

        System.out.print("Tarih notunuzu giriniz:");
        float trh = scan.nextFloat();

        System.out.print("Muzik notunuzu giriniz:");
        float mzk = scan.nextFloat();

        float ortalama = (mat+fzk+kmy+trh+trkc+mzk)/6;
        System.out.println("Ortalamanız :" + ortalama);

        boolean durum = ortalama>=60;

        String sonuc = durum ? "Geçtiniz": "Kaldınız";
        System.out.println("Sonuç :" + sonuc);
    }
}
