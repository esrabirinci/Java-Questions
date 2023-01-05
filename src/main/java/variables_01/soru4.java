package variables_01;

public class soru4 {


    //Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
    //toplamını ve çarpımını String ile yazdırınız.

    public static void main(String[] args) {

        String islem= " işlem";
        long sayi1 = 10200l;
        long sayi2 = 20400l;
        long toplam = sayi1+sayi2;
        long  carpim = sayi1*sayi2;

        System.out.println(islem + " "+  toplam);
        System.out.println(islem + " " + carpim);

    }
}
