package KosulEx;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner iinput=new Scanner(System.in);

        System.out.println("Lütfen mesafeyi giriniz:");
        int mesafe= iinput.nextInt();
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas= iinput.nextInt();
        System.out.println("Lütfen yolculuk türünü seçiiniz");
        System.out.println("1-Tek yön");
        System.out.println("2-Çift yön");
        byte yon= iinput.nextByte();

        double toplam=mesafe*0.10;
        if ((mesafe<=0)|| (yas<=0)||(yon<=00)){
            System.out.println("Yanlış değer girdiniz Lütfen tekrar deneyiniz!");


        }
        if (yas<=12){
            double indirim=toplam*50/100;
            toplam -=indirim;

        } else if (12<yas&&yas<24) {
            double indirim=toplam*10/100;
            toplam -=indirim;


        }
        if (yon==2){
            double indirim =toplam*20/100;
            toplam -=indirim;

        }
        System.out.println("Toplam ödenecek miktar:"+toplam+"TL");


    }
}
