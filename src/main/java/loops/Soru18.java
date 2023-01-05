package loops;

public class Soru18 {
    public static void main(String[] args) {

       // Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.

        String s= "Hello";
        for (int i = 0; i <s.length() ; i++) {
            String z=  s.substring(i,i+1);
            if (s.indexOf(z)==s.lastIndexOf(z)){
                System.out.print(z);
            }
        }


        //2. YOL

    }
}
