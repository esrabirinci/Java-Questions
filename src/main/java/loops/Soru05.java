package loops;

public class Soru05 {
    public static void main(String[] args) {

        /*
    Asagıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                     A A A A A
                     A A A A A
                     A A A A A
     */

        int satir= 3;
        int sutun =5;
        for (int i= 1; i<=satir; i++){
            String k= "";
            for (int j= 1; j<=sutun; j++){

                k= k+ "A ";
            }
            System.out.println(k);
        }



    }
}
