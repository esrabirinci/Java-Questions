package stringmanipulation;

public class soru1 {

    public static void main(String[] args) {
                /*
    Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
    ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsoldayazdırınız.
    Örnek: mIAMI - Miami
    miami - Miami
    MIAMI - Miami
    mIaMi - Miami vb.
 */



        String sehirismi = "Ankara";
        String yenisehir = sehirismi.toLowerCase();
        System.out.println(yenisehir);
       yenisehir = yenisehir.substring(0,1).toUpperCase()+ yenisehir.substring(1);
        System.out.println(yenisehir);


        //2. YOL
        String sehir = "amasya";
        System.out.println(sehir.substring(0,1).toUpperCase()+sehir.substring(1).toLowerCase());
    }
}
