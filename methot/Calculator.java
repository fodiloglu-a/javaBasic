package methots;

import java.util.Scanner;

public class Calculator {
    /*  1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama


     */
    static  void  toplam(int a,int b){
        int top=a+b;
        System.out.println("Toplam="+top);
    }
    static void cıkarma (int a, int b){
        int cık=a-b;
        System.out.println("Çıkarma="+cık  );
    }
    static void  carp(int a,int b ){
        int car=a*b;
        System.out.println("Çarpma="+car  );

    }
    static void  bol(int a,int b ){
        int bo=a/b;
        System.out.println("Bölme="+bo  );

    }
    static void  üs(int a,int b ){
        int base=a,taban=a;
        int exp=b;
        for (int i=1;i<exp;i++){


            base*=taban;

        }



        System.out.println("Sonuç="+base  );

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama");
        System.out.println("Lütfen işleminizi seçiniz:");
        int secim=input.nextInt();
        System.out.println("Lütfen ilk sayıyı giriniz:");
        int a=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int b=input.nextInt();

        switch (secim){

            case 1:toplam(a,b);
                    break;
            case 2:cıkarma(a,b);
            break;
            case 3:carp(a,b);
            break;
            case 4:bol(a,b);
            break;
            case 5:üs(a,b);
            break;
            default:
                System.out.println("Yanlıs islem girdiniz!!!");




        }
    }






}
