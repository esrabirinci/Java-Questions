package stringmanipulation;
public class soru12 {

    public static void main(String[] args) {

        /*
        Bir String’in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
            Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
            ‘ali.’ için kodunuz konsolda false yazdırmalıdır
            ‘  Ali.  ’ için kodunuz konsolda false yazdırmalıdır
            ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
            ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
            String s = "Tom Hanks.";
    */

        String str= "Tom Hanks.";
        char ilk = str.charAt(0), son = str.charAt(str.length()-1);
        Boolean ilkControl = ilk >='A' && son <='Z';
        Boolean sonControl= son =='.';
        Boolean ilkSonControl = ilkControl && sonControl;
        System.out.println("ilkSonControl = " + ilkSonControl);

        //////

        String s = "Ali.";
        boolean p = s.charAt(0)>='A' &&  s.charAt(0)>='Z' && s.length()-1=='.';
        System.out.println(p);

        //// bu yolda çalışşşşşş



    }

}
