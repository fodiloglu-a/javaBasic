package Loop;

import java.util.Scanner;

public class FaktorialAndCombination {

    /* We are writing a program that calculates factorial in Java.

          Homework
          Different structures in the structure to be created with the elements of a set with N elements are called. It is denoted as C(n,r) with r of N.

          Program that calculates in Java.

          Combination formula
          C(n,r) = n! / (r! * (n-r)!)

     */
    public static int calcFactoorial(int n){
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial*=i;

        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter calculator for Factorial number:");
        int n=input.nextInt();
        System.out.println(calcFactoorial(n));
        System.out.println("Plese enter  calculator for Combination number:");
        int r=input.nextInt();
        int combination=calcFactoorial(n)/(calcFactoorial(r)*calcFactoorial((n-r)));
        System.out.println("C("+n+","+r+")="+combination);





    }
}
