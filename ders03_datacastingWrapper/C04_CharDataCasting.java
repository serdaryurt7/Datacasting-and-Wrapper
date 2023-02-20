package ders03_datacastingWrapper;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        System.out.println('a'+ 'b'); // 97 + 98 ASCII

        //kullanıcıdan char bir karakter alın ve o karakterden sonra gelen 3 karakteri yazdırın.
        // ornek input: a, output : bcd

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter giriniz.");
        char girilenKarakter = scanner.next().charAt(0);

        System.out.println(""+(char)(girilenKarakter + 1) + (char)(girilenKarakter+2) + (char)(girilenKarakter+3));

        
    }
}
