package stringmanipulation;
public class soru9 {
    public static void main(String[] args) {


        /*
    Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tümkarakterleri büyük harflerle yazdırınız.
    Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
*/

        String a = "Java";
        String b = a.toUpperCase().substring(1,a.length()-1);
        System.out.println(b);



    }

}
