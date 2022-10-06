import java.util.Scanner;

public class exOne {
    public static void main(String[] args) {
        //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
        // puanlarını
        // kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.


        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen Matematik dersinin puanını giriniz:");
        byte matematik= input.nextByte();
        System.out.println("Lütfen Fizik dersinin puanını giriniz:");
        byte fizik= input.nextByte();
        System.out.println("Lütfen Kimya dersinin puanını giriniz:");
        byte kimya= input.nextByte();
        System.out.println("Lütfen Türkçe dersinin puanını giriniz:");
        byte turkce= input.nextByte();
        System.out.println("Lütfen Tarih dersinin puanını giriniz:");
        byte tarih= input.nextByte();
        System.out.println("Lütfen  Müzik dersinin puanını giriniz:");
        byte muzık = input.nextByte();


        float ortalama=(matematik+tarih+fizik+kimya+turkce+muzık)/6;

        System.out.println("Girdiğiniz notların ortalaması="+ortalama);

    }
}
