package loops;

public class Soru21 {
    public static void main(String[] args) {

/*
        Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
        Örnek:12133455 ´ 2+4=6
    */

        int a = 12133455;
        String a1 =String.valueOf(a);
        int top=0;
        for (int i = 0; i <a1.length() ; i++) {
            String b=a1.substring(i,i+1);
            if (a1.indexOf(b)==a1.lastIndexOf(b)){
                top=top+Integer.valueOf(b);
            }
        }
        System.out.println(top);
    }


}
