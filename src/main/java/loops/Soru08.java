package loops;

public class Soru08 {

    public static void main(String[] args) {

/*
        20'den 3'e kadar olan tek tamsayıları aynı satırda ardısık olacak sek!lde aralarında bosluk
        bırakarak yazdırmak !ç!n gereken kodu yazınız.
    */


        for (int i = 20; i > 2; i--) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}




