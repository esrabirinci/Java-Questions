package ifstatement;

public class soru1 {
    public static void main(String[] args) {
      /*  Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"
        */

    String x = "";

    if (x.equalsIgnoreCase("Aralık") || x.equals("Ocak") || x.equals("Şubat"));
        System.out.println("Kış");
    if (x.equals("Mart") || x.equals("Nisan") || x.equals("Mayıs"));
        System.out.println("İlkbahar");
    if (x.equals("Haziran") || x.equals("Temmuz") || x.equals("Ağustos"));
        System.out.println("Yaz");
    if (x.equals("Eylül") || x.equals("Ekim") || x.equals("Kasım"));
        System.out.println("Sonbahar");


    }

}
