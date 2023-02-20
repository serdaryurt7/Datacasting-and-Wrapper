package ders03_datacastingWrapper;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi = 10;
        String str ="Java cok guzel";

        // Primitive data türleri sadece değer barındırırlar, hazır methodları yoktur.
        // Java primitive data türleri ile bazı hazır methodların kullanılabilmesi için Wrapper Class'ları oluşturmuştur.
        // Wrapper class'lar primitive data türlerindeki değerleri alırlar ancak methodları'da vardır.

        char krk = 'b';
        Character krkWrapper = 'c';

        System.out.println(Character.isLetter('5')); // false çünkü 5 harf değildir.
        System.out.println(Character.isDigit('5')); // true çünkü 7 sayıdır.

        String str1 = "123";
        String str2 = "12";

        //str1 ve str2 nin değerlerini matematiksel olarak toplayın.

        System.out.println(str1 + str2); // 12312

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 135

        // Integer.parseInt(str) içine yazılan str rakamlardan oluşuyorsa str'i integer'a çevirir.
        // ancak 1 karakter bile rakam değilse hata verir.("123s")

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

    }
}
