package stringmanipulation;

public class Soru4 {
    public static void main(String[] args) {
        /*
    Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
    Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir
*/
        String a = "1a3Bcf4!...";
        String karakter = a.replaceAll("[0-9]","");
        System.out.println(karakter.length());
    }
}
