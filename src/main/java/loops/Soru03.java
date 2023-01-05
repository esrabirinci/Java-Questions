package loops;

public class Soru03 {
    public static void main(String[] args) {

        /*
       Bir String‘in palindrom olup olmadıgını kontrol etmek için kod yazınız. Bir String, tersi ile
       aynıysa, buna palindrom denir.
       Örnegin; “anna”, “123321” palindromlardır.
    */

                   String str ="anna";
            String tersStr ="";
            for (int i = str.length()-1; i>-1;i--){
                String harf = str.substring(i,i+1);
                tersStr=tersStr+harf;
            }
            if (str.equals(tersStr)){
                System.out.println("Palindromdur");
            }else System.out.println("Palindrom değildir");


    }
}
