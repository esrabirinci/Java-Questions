package ternary;

public class soru5 {
    public static void main(String[] args) {

        /*
        Nested Ternary kullanarak;
        Şifreyi kontrol etmek için kodu yazınız.
        8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
     */

    String sifre = "Ksisaa?";

    System.out.println(sifre.length() > 8 ? ((sifre.charAt(0) == 'i') ? "Geçerli Şifre " : " Geçersiz Şifre") :
                ((sifre.charAt(0) == 'K') ? "Geçerli Şifre" : "Geçersiz Şifre"));

    }
}
