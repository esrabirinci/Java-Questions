package loops;

public class Soru11 {
    public static void main(String[] args) {


        // Bir String’i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

        String str ="Gürkay";
        String s = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            s= s+str.charAt(i);

        }
        System.out.println(s);
    }
}
