package loops;

public class Soru06 {
    public static void main(String[] args) {
        /*

   Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            A
            A A
            A A A
            A A A A

         */

        int satir=4;
//        for(int i=1; i<=satir; i++){
//            String k="";
//            for(int j=1;j<=i; j++){
//                k= k +"A ";
//            }
//            System.out.println(k);
//        }


        for (int i =1;i<=satir;i++){
            for (int k=(satir-1); k>=i;k--){
                System.out.print(" ");
            }
            for (int j =1; j<=i;j++){
                System.out.print("a");
            }
            System.out.println("");
        }








    }
}
