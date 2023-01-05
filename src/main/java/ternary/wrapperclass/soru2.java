package ternary.wrapperclass;

public class soru2 {
    //Data tipi String olan "103" değerini byte data tipine dönüştürmek için bir kod yazınız ve
    //yine data tipi String olan "2351" değerini short data tipine dönüştürüp konsolda iki
    //değişken arasındaki farkı yazdırınız.

    public static void main(String[] args) {
     String a= "103";
     Byte b= Byte.valueOf(a);
        System.out.println(b);

     String x = "2351";
     short y = Short.valueOf(x);
        System.out.println(y);
        System.out.println(b-y);


    }
}
