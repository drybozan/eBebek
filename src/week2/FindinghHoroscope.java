package week2;

import java.util.Scanner;

public class FindinghHoroscope {
    public static void main(String[] args) {
        /*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğdunuz gün  :");
        int birthDay = scanner.nextInt();

        System.out.println("Doğdunuz ay (Lütfen rakam ile giriniz):");
        int birthMonth = scanner.nextInt();

        if (birthMonth == 1) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 21) {
                    System.out.println("Burcunuz : Oğlak");
                } else {
                    System.out.println("Burcunuz : Kova");
                }
            }
        } else if (birthMonth == 2) {
            if (birthDay >= 1 && birthDay <= 28) {
                if (birthDay <= 19) {
                    System.out.println("Burcunuz : Kova");
                } else {
                    System.out.println("Burcunuz : Balık");
                }
            }
        } else if (birthMonth == 3) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 20) {
                    System.out.println("Burcunuz : Balık");
                } else {
                    System.out.println("Burcunuz : Koç");
                }

            }
        } else if (birthMonth == 4) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 20) {
                    System.out.println("Burcunuz : Koç");
                } else {
                    System.out.println("Burcunuz : Boğa");
                }
            }
        } else if (birthMonth == 5) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 21) {
                    System.out.println("Burcunuz : Boğa");
                } else {
                    System.out.println("Burcunuz : İkizler");
                }
            }
        } else if (birthMonth == 6) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 22) {
                    System.out.println("Burcunuz : İkizler");
                } else {
                    System.out.println("Burcunuz : Yengeç");
                }
            }
        } else if (birthMonth == 7) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 22) {
                    System.out.println("Burcunuz : Yengeç");
                } else {
                    System.out.println("Burcunuz : Aslan");
                }
            }
        } else if (birthMonth == 8) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 23) {
                    System.out.println("Burcunuz : Aslan");
                } else {
                    System.out.println("Burcunuz : Başak");
                }
            }
        } else if (birthMonth == 9) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 22) {
                    System.out.println("Burcunuz : Başak");
                } else {
                    System.out.println("Burcunuz : Terazi");
                }
            }
        } else if (birthMonth == 10) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 22) {
                    System.out.println("Burcunuz : Terazi");
                } else {
                    System.out.println("Burcunuz : Akrep");
                }
            }
        } else if (birthMonth == 11) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 21) {
                    System.out.println("Burcunuz : Akrep");
                } else {
                    System.out.println("Burcunuz : Yay");
                }
            }
        }else if (birthMonth == 12) {
                if (birthDay >= 1 && birthDay <= 31) {
                    if (birthDay <= 21) {
                        System.out.println("Burcunuz : Yay");
                    } else {
                        System.out.println("Burcunuz : Oğlak");
                    }
                }
        }

       else {
                System.out.println("Hata! Lütfen doğum tarihinizi kontrol edin.");
       }
    }

    }

