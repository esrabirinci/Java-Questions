package loops;

public class Soru15 {
    public static void main(String[] args) {
              /*
    Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.
    */

            char c = 'C';
            do {
                System.out.print(c+" ");
                c--;
            }while (c>='A');
        }

}
