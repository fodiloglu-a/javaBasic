import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

    Alan Formülü : π * r * r;

    Çevre Formülü : 2 * π * r;

    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360
         */


        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz:");
        float r= input.nextFloat();
        System.out.println("Dairenin merkez açısını giriniz giriniz:");
        float aci= input.nextFloat();

        float alan,aalan,cevre;
        alan=r*r*3.14f;
        aalan= (3.14f * (r*r) * aci) / 360;
        cevre=2*3.14f*r;
        System.out.println("Dairenin alanı="+alan);
        System.out.println("Dairenin cevresi="+cevre);
        System.out.println("Dairenin açılı alanı="+aalan);









    }
}
