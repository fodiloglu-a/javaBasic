package methots;

import java.util.Scanner;

public class polindomNum {

    static boolean isPolindoom(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber==number){
            return true;
        }else {
            return false;
        }



    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number=input.nextInt();

        boolean deg =isPolindoom(number);
        System.out.println(deg);









    }
}
