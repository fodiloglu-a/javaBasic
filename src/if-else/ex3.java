package KosulEx;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

            Geçme Notu : 55

            Ödev
            Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

         */
        double toplam=0;
        System.out.println("Please enter Mathematic Point:");
        double mat=input.nextDouble();
        if (0<mat && mat<101){
            toplam +=mat;
        }

        System.out.println( "Please enter Physics Point:");
        double phy= input.nextDouble();
        if (0<phy && phy<101){
            toplam +=phy;
        }

        System.out.println("Please enter Turkish Point:");
        double trk= input.nextDouble();
        if (0<trk && trk<101){
            toplam +=trk;
        }
        System.out.println("Please enter Chemical Point");
        double che= input.nextDouble();
        if (0<che && che<101){
            toplam +=che;
        }
        System.out.println("Please enter Music Point:");
        double mus= input.nextDouble();
        if (0<mus && mus<101){
            toplam +=mus;
        }

        double ortalama=toplam/5;
        if (ortalama>=55){
            System.out.println("Average: "+ortalama+"  PASSED");
        }else {
            System.out.println("Average:  "+ortalama+"  LEFT");
        }






    }
}
