package KosulEx;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex1 {
    //swich case kullanarak hesap makinisi yapmak...
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



        System.out.println("1-TOPLA");
        System.out.println("2-ÇIKAR");
        System.out.println("3-ÇARP");
        System.out.println("4-BÖL");

        System.out.println("*****************");

        System.out.println("İşlem numarası giriniz:");
        byte secim=input.nextByte();

        System.out.print("İlk sayıyı giriniz:");
        float ilkSayi=input.nextFloat();
        System.out.print("İkinci sayıyı giriniz:");
        float ikinciSayi= input.nextFloat();

        switch (secim){
            case 1:
                System.out.println("Toplam="+(ilkSayi+ikinciSayi));
                break;
            case 2:
                System.out.println("Çıkar="+(ilkSayi-ikinciSayi));
                break;

            case 3:
                System.out.println("Çarp="+(ilkSayi*ikinciSayi));
                break;
            case 4:
                System.out.println("Böl="+(ilkSayi/ikinciSayi));
                break;

            default:
                System.out.println("HATA!");
        }









    }


}
