import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        /*
                    Dik Üçgende Hipotenüs Bulan Program
            Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

            Ödev
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

            Formül
            Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

            𝑢 = (a+b+c) / 2

            Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
                     */
        Scanner input=new Scanner(System.in);

        System.out.println("Üçgenin 1. kenarını giriniz:");
        int kenar1 = input.nextInt();

        System.out.println("Üçgenin 2. kenarını giriniz:");
        int kenar2=input.nextInt();

        System.out.println("Üçgenin uzun kenarını giriniz:");
        int kenarUzun= input.nextInt();

        int cevre= (kenar1+kenar2+kenarUzun)/2;
        System.out.println("ücgenin çevresi="+cevre);

        float alan=cevre*(cevre-kenar1)*(cevre-kenar2)*(cevre-kenarUzun);
        System.out.println("Üçgenin alanı="+alan);

        float  alan2=((kenar2*kenarUzun)/2);

        System.out.println("Farklı formül ile alan="+ alan2);
    }
}
