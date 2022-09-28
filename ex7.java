import java.sql.SQLOutput;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        /*Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

        Scanner input=new Scanner(System.in);
        System.out.println("Armut miktarını giriniz");
        float armut= input.nextFloat();
        System.out.println("Elma miktarını giriniz");
        float elma= input.nextFloat();
        System.out.println("Domates miktarını giriniz");
        float domates= input.nextFloat();
        System.out.println("Muz miktarını giriniz");
        float muz= input.nextFloat();
        System.out.println("Patlıcan miktarını giriniz");
        float patlican= input.nextFloat();

        System.out.println("ALINAN ÜRÜNLER VE MİKTARLARI");
        System.out.println("****************************");
        System.out.println("Armut="+armut);
        System.out.println("Elma="+elma);
        System.out.println("Domates="+domates);
        System.out.println("Muz="+muz);
        System.out.println("Patlıcan="+patlican);

        float tutar=(armut*2.14f)+(elma*3.67f)+(domates*1.11f)+(muz*0.95f)+(patlican*5.00f);


        System.out.println("TOPLAM ÖDENECEK TUTAR="+tutar+"TL");

















    }
}
