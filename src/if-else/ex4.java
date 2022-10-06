package KosulEx;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
                 */

        System.out.println("Please enter the temperrature:");
        byte temp=input.nextByte();
        if (temp<5){
            System.out.println("Activity:SKI");
        }
        else if (5<=temp&&temp<15){
            System.out.println("Activity:CINEMA");

        } else if (15<=temp&& temp<25) {
            System.out.println("Activity:PICNIC");
        }else if (25<=temp){
            System.out.println("Activity:SWİMİNG");
        }
    }
}
