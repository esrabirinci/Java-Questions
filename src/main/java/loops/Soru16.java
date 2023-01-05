package loops;

public class Soru16 {
    public static void main(String[] args) {

        // Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.

        String s= "Annemin Mustafası";
        for (int i = 0; i <s.length() ; i++) {
            String c = s.substring(i,i+1);

        if (c.equals("m")){
            break;
        }
            System.out.print(c);
        }

    }
}
