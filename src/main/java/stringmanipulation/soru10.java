package stringmanipulation;
public class soru10 {
    public static void main(String[] args) {

        /*
    Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.

    Örnek:  'Ali   Can' için konsolda false yazmalıdır.
            ‘  AliCan  ’ için konsolda false yazmalıdır.
            ‘ Ali    Can ’ için konsolda false yazmalıdır.
            'Ali Can' için konsolda true yazmalıdır.
*/

        String x = "Ali Can";
        String y = x.trim().replaceAll("\\s+", " ");
        boolean z = x.equals(y);
        System.out.println(y);
        System.out.println(z);


//        String b = a.replaceAll("\\s", "");
//        System.out.println(b);
//        Boolean d = a.length() - b.length()==1;
//        System.out.println(d);
//
    }

}
