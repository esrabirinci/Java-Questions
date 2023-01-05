package variables_01;

public class soru3 {


    //Basit faizi bulmak için bir kod yazınız.
    //Not: Basit faiz formülü = anapara * oran * yılDegeri /100

    public static void main(String[] args) {

        double anapara = 10250;
        double oran = 12.5;
        double yilDegeri = 1;

        double faizOran = anapara*oran*yilDegeri/100;
        System.out.println(faizOran);
    }
}
