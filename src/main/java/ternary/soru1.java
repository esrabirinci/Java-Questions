package ternary;

public class soru1 {
    public static void main(String[] args) {

        //  Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
   //Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
   // Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"

      String parola = "asb256 y";
     boolean parola1 = parola.replaceAll(" ", "").length()>8;
        System.out.println(parola1 ? "geçerli":"geçersiz");




  }
}
