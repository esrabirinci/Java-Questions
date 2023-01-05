package stringmanipulation;
public class soru11 {

    public static void main(String[] args) {
/*
    Bir String'in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
    Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
    'Ali' için kodunuz konsolda true yazmalıdır
*/


        String a = "Ali";
        String b = a.trim();
        boolean c= b.length()-a.length()==0;
        System.out.println(c);

        //2.YOL
        String x = "Ali ";
        String y = x.trim();
        boolean sonuc = x.equals(y);
        System.out.println(sonuc);








    }

}
