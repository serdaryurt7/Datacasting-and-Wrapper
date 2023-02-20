package ders03_datacastingWrapper;

public class C01_DataCasting {

    public static void main(String[] args) {

        //bazı data türleri asla birbirlerine cast edilemez
        /*
         String str = 20;

        boolean  mutluMu = "true";

        int a = true;
        */

        double s = 20;

        int sayi = 15;

        long ln = sayi;  //eşitliğin sol tarafı long, sağ tarafı yani değer int.

        // dar data türünden bir değeri geniş data türündeki değişkene atama yaparsanız java otomatik yapar.

        //aksi durumda yani büyük data türündeki bir veriyi, küçük data türündeki bir değişkene atamak istediğimizde java kabul etmez.

        short sh = 23;

        int a = sh;

        long lng = sh;

        float fl = lng;


        double dbl = 20;

        // a= dbl;

        // short abc = dbl;

    }

}
