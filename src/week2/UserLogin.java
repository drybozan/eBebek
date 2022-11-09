package week2;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {


        String username = "user", password = "12345";
        String inputUsername, inputPassword, inputNewPassword;

        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.print("Kullanıcı adınızı giriniz: ");
        inputUsername = sc.next();
        System.out.print("Şifreniz : ");
        inputPassword = sc.next();

        // girilen bilgiler doğru ise kullanıcı sisteme giriş yapabilecek
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Giriş yapıldı");
            break;
        }
        else {

            //hata göster
            System.out.println("Kullanıcı bilgileriniz hatalı!");

            //eğer şifresi doğru değilse değiştirmek isteyip istemeyeceğini sor
            if(!inputPassword.equals(password))

            System.out.print("Şifrenizi değiştirmek ister misiz ? (evet/hayır) : ");
            while (true) {
            //değiştirmek istiyorsa
            if (sc.nextLine().equals("evet")) {

                    System.out.println("Yeni bir şifre oluşturunuz : ");
                    inputNewPassword = sc.next();

                    //girdiği şifre eski şifreye eşit olmamalı ve yenilediği şifre doğru olmalı
                    if (!inputNewPassword.equals(password) && !inputNewPassword.equals(inputPassword)) {
                        password = inputNewPassword;
                        System.out.println("Şifre başarıyla oluşturuldu");
                       break;
                    } else {
                        System.out.println("Şifrenizi oluşturamadınız lütfen daha sonra tekrar deneyiniz.");

                    }
                }
            }
        }
    }
}}




