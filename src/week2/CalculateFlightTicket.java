package week2;

import java.util.Scanner;

public class CalculateFlightTicket {
    public static void main(String[] args) {

        int distance , age, tripType;
        double discountedAmount;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafe bilgisini km cinsinden yazınız: ");
        distance = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen yolculuk tipini seçiniz \n1-Tek Yön \n2-Gidiş-Dönüş");
        System.out.print("\nSeçiminiz: ");
        tripType = input.nextInt();
    //kullanıcının istenen değerler arasında veri girmiş mi kontrolü
        if(distance>0 && age >0 && (tripType==1 || tripType==2)){

            //girmiş ise normal tutarı hesaplar
            double amount = distance * 0.10;
            System.out.println("normal:" + amount);

            //yaşı 12 denküçükse %50 indirim uygular
            if(age<12){

                //yolculuk tipi gidiş geliş ise bilet fiyatı üzerinden %20 indirim uygular
                if(tripType==2){
                    double _discountedAmount = amount * 0.20;
                    amount = amount-_discountedAmount;
                    System.out.println("Toplam tutar :"+ amount*2);
                }else{
                    discountedAmount = distance * 0.50;
                    amount= amount-discountedAmount;
                    System.out.println("Toplam tutar :"+amount);
                }
            }else if(12<age && age<24){

                //yolculuk tipi gidiş geliş ise bilet fiyatı üzerinden %20 indirim uygular
                if(tripType==2){
                    double _discountedAmount = amount * 0.20;
                    amount = amount-_discountedAmount;
                    amount=amount*2;
                    System.out.println("Toplam tutar :"+amount);
                }else{
                    discountedAmount = distance * 0.10;
                    amount = amount-discountedAmount;
                    System.out.println("Toplam tutar :"+amount);
                }


            }else if(65<age){

                //yolculuk tipi gidiş geliş ise bilet fiyatı üzerinden %20 indirim uygular
                if(tripType==2){
                    double _discountedAmount = amount * 0.20;
                    amount = amount-_discountedAmount;
                    System.out.println("Toplam tutar  :"+amount*2);
                }
                else{
                    discountedAmount = distance * 0.30;
                    amount = amount-discountedAmount;
                    System.out.println("Toplam tutar :"+amount);
                }
            }
            System.out.println("Toplam tutar  :"+amount);
        }else{
            System.out.println("Hatalı bilgi girdiniz.");
        }

    }
}
