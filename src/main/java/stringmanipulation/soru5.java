package stringmanipulation;

public class soru5 {
    public static void main(String[] args) {

        /*
    Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son karakteri yazdırınız.
    Örnek:'Ali Can' için n yazdırmalısınız.
    'Miami' için i yazdırmalısınız

*/
        String a= "Ali Can";
        a = a.trim();
        char sonharf= a.charAt(a.length()-1);
        System.out.println(sonharf);

    }
}
