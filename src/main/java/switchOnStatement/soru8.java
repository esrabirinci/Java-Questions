package switchOnStatement;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);
        System.out.println("Lütfen milden km'ye için 1, \n saniyeden saate için 2, \n fahrenhayttan santigrata için 3, \n dönüşümlerinden birini seçiniz");
    int secenek=input.nextInt();
    //(mil*1.60934)
    //saniye/60)/60
    //(fahrenayt-32)*5/9)
        System.out.println("Dönüştürülecek değeri giriniz:");
    double dns=input.nextDouble();
        switch (secenek){
        case 1:
            System.out.println((dns * 1.6)+"km'dir");
            break;
        case 2:
            System.out.println(((dns /60)/60)+"saat'tir");
            break;
        case 3:
            System.out.println((dns -32)*5/9+"santigrat'tir");
            break;
        default:
            System.out.println("Bu operatör, o dönüştürücü için tanımlanmadı");
    }
}
}
