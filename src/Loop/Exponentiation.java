package Loop;

import java.util.Scanner;

public class Exponentiation {

    /*
    We write a program that prints powers of 2 up to the number entered with Java loops.
    We write a program that prints powers of 4 and 5 up to the number entered with Java loops.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter power number:");
        int power= input.nextInt();
        int a=2,b=4,c=5;

        for (int i=1;i<power;i++){

            a*=2;
            b*=4;
            c*=5;
        }
        System.out.println("2^"+power+"="+a);
        System.out.println("4^"+power+"="+b);
        System.out.println("5^"+power+"="+c);

    }
}
