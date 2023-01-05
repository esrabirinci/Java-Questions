package loops;

public class Soru13 {
    public static void main(String[] args) {
        //3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.

        int sum= 0;
        for (int i = 3; i < 15; i++) {
            sum= sum + i;
            i++;

        }
        System.out.println(sum);
    }

}
