package stringmanipulation;

public class soru3 {
    public static void main(String[] args) {

/*
    Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
    Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
*/

        String a = " Miami 33018!!! ";
       // a= a.replaceAll("\\s",""); buna gerek yokmuş
        String harf= a.replaceAll("[^0-9a-zA-Z]","");
       // System.out.println(harf);
        System.out.println(harf.length());





    }
}
