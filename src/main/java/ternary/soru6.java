package ternary;

public class soru6 {
    public static void main(String[] args) {


        /*
        Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

 */

        int sayi = -15;
        int mutlakDeger = sayi>=0 ? sayi : (sayi*-1);
        System.out.println(mutlakDeger);
    }
}
