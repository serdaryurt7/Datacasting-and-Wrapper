package ders03_datacastingWrapper;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı alın
        //Kullanıcı hangi değeri girerse konsolda -128 ile +127 arasında bir sonuç yazdıracak kodu yaz.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");

        int girilenSayi = scanner.nextInt();

        byte donusenSayi  = (byte) girilenSayi;

        System.out.println("Girilen sayı: " + girilenSayi + "'nın dönüşmüş hali: " + donusenSayi);


    }
}
