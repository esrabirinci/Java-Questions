package stringmanipulation;

public class soru16 {
    public static void main(String[] args) {

        /*
        Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        Not: İkinci isim kapsam dışındadır.
        Örnek: Tom Hanks ==> TH, Mary Star ==> MS
    */

        String a = "Esra Birinci";
        char isim = a.charAt(0);
        char soyisim = a.split(" ")[1].charAt(0);
        System.out.println(" " + isim+ soyisim);


        a = a.substring(0,1)+ a.split(" ")[1].charAt(0);
        System.out.println(a);
    }
}
