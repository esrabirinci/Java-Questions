package stringmanipulation;

public class soru2 {
    public static void main(String[] args) {

        /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
        */
        String a= "Ali Can";
        String b = "Merve Star";
        String c = "Mark Tom";

        a = a.replaceAll(" ", ""); //AliCan
           System.out.println(a);

        b = b.replaceAll(" ", "");//MerveStar
           System.out.println(b);

        c = c.replaceAll(" ", "");//MarkTom
           System.out.println(c);

           System.out.println(a.length()+b.length()+c.length()); //22


    }
}
