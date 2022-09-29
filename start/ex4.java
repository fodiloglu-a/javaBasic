import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        /*
                Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
                 */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen KM miktarını giriniz:");
        float km= input.nextFloat();
        float acilis=10.0f;

        float tutar= (km*2.20f)+acilis;

        if (tutar<20){
            System.out.println("Seyehat ücretiniz=20TL ");




        }
        else {
            System.out.println("Seyehat ücretiniz="+tutar+"TL");

        }






    }
}
