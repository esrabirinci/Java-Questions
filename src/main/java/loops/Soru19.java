package loops;

public class Soru19 {
    public static void main(String[] args) {


       // Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.

        String s = "Annesinin Mustafa'sı, bugün annes,ni aradı. :) !!!";
//        s = s.replaceAll("\\s","").replaceAll("[\\p{Punct}]","");
//        System.out.println(s.length());

        //For ile çöz

        String a="";

        for (int i = 0; i < s.length(); i++){
            char ch=s.charAt(i);
            if (ch>=32&&ch<=64){
                continue;
            }
            a+=ch;
        }
        System.out.println(a.length());
    }



    }

