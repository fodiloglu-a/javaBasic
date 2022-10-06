package KosulEx;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

         */
        System.out.println("Please Enter  Number:");
        int first= input.nextInt();
        System.out.println("Please Enter  Number:");
        int second= input.nextInt();

        System.out.println("Please Enter  Number:");
        int three= input.nextInt();

        int bigNum=0;
        if (first>bigNum ){
            bigNum=first;

        } if (second>bigNum){
            bigNum=second;
        }  if (three>bigNum) {
            bigNum=three;

        }
        System.out.println("the sMore big number: "+bigNum);


    }



}
