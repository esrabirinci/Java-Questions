package loops;

public class Soru10 {
    public static void main(String[] args) {

      /*
        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 75.4238 ´ *4*2*3*8
       */

       double a = 75.4238;
       String s= String.valueOf(a);

       s= s.split("\\.")[1];
        System.out.println(s);

        for (int i = 0; i <s.length() ; i++) {
            char c =s.charAt(i);
            System.out.print("*"+ c);

        }





    }
}
