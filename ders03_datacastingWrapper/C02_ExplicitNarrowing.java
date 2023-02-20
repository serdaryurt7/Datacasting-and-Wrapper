package ders03_datacastingWrapper;

public class C02_ExplicitNarrowing {


    public static void main(String[] args) {


        int sayi = 20;

        // Geniş data türündeki bir değeri, dar data türündeki bir değişkene atamak istersek java sorumluluğu almamızı ister.
        // cast edeceğimiz değerin önüne, cast etmek istediğimiz data türü yazılır.

        //ancak bu durumda veri kayıpları(double'dan int'e geçerken virgülden sonrası silinir.)
        //veya başkalaşım olabilir (int'i byte'a çevirirsek tekrar tekrar başa döner)

        short sh = (short) sayi;

        System.out.println(sh); //20

        double dbl = 23.5;

        int say = (int)dbl;

        System.out.println(say); //23

        say =256;

        byte byt = (byte) say;

        System.out.println(byt);

    }

}
