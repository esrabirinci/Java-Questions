package ifstatement;

public class soru2 {
    public static void main(String[] args) {
/*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
            a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre" yazsın
            b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız" yazsın
            c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre" yazsın
            Not: Çözümdeki koşulların sıralarına dikkat ediniz.
            String sifre = "a1b2c3d4";
     */
        String sifre = "a1b2c3d4";
        if(sifre.contains(" ")){
            System.out.println("Şifrede boşluk karakteri kullanmayınız");
        }else if (sifre.length()>7 && !sifre.contains(" ")){
            System.out.println("Geçerli Şifre");
        }else {
            System.out.println("Geçersiz Şifre");
        }

        //2.YOL
        String sifre2 = "a1b2c3d4";
        if(sifre2.replaceAll("\\S", "").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");
        }else if(sifre2.replaceAll("\\s", "").length()>=8){
            System.out.println("Gecerli Sifre");
        }else{
            System.out.println("Gecersiz Sifre ");
        }
    }
}
