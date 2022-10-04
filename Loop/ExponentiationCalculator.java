package Loop;

import java.util.Scanner;

public class ExponentiationCalculator {
    public static void main(String[] args) {
        /*
        We write a program that calculates exponential
         numbers with the values entered by the user in Java.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to my exponentiation numbers calculator program ");
        System.out.println("////////////////////////////////////////////////////////");

        System.out.println("Number^power");
        System.out.println("Enter Number:");
        int number=input.nextInt();
        System.out.println("Enter Power:");
        int power= input.nextInt();
        int expo=1;
        for (int i=1;i<=power;i++){
            expo*=number;

        }
        System.out.println(number+"^"+power+"="+expo);
    }
}
