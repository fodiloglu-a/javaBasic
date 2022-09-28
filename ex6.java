import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        /*Vücut Kitle İndeksi Hesaplama
            Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
             Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

            Formül
        Kilo (kg) / Boy(m) * Boy(m)*/

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");

        float m= input.nextFloat();

        System.out.println("Lütfet kg cindinden kilonuzu giriniz:");

        float kg= input.nextFloat();

        float endeks=  kg / (m*m);

        System.out.println( "Vücut kitle endeksiniz="+endeks);



    }
}
