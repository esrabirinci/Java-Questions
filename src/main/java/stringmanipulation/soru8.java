package stringmanipulation;
public class soru8 {
    public static void main(String[] args) {


        /*
    Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsoldabüyük harfle yazdırınız.
    Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız

*/
        String a = "Java";
        String b = a.toUpperCase().substring(0,a.length()-1);
        System.out.println(b);

        //2. YOL
        String c= "Java";
        String d = c.toUpperCase();
        int sonkarakter= c.length()-1;
        String sonuc = b.substring(0,sonkarakter);
        System.out.println(sonuc);




    }

}
