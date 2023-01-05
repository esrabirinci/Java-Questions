package loops;

public class Soru09 {
    public static void main(String[] args) {

       // String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
      //  Örneğin; 'Ali Can?' ==> l*i*a*n*

        String str = " Ali Can?";

        str=str.replaceAll("[^a-z]", "");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            String c = str.charAt(i)+"*";
            System.out.print(c);

        }


    }
}
