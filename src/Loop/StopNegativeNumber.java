package Loop;

import java.util.Scanner;

public class StopNegativeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*With Java loops, we write a program that accepts input from the user until a negative value
         is entered and collects the odd numbers from the entered values and prints it on the screen.
         */
        int sum=0;
        while (true){
            System.out.println("Please Enter any Number:");
            int number=input.nextInt();

            if (number<0){
                System.out.println("Your Enter a negative number:"+number);
                System.out.println("Sum of numbers that are not divisible by two:"+sum);
                break;
            }
            if (number%2!=0){
                sum +=number;

            }

        }

        /*With Java loops, we write a program that accepts inputs from the user until a single number is
         entered and collects even and multiples of 4 from the entered values and prints it on the screen.
         */
        while(true){
            System.out.println("Please Enter any Number:");
            int number=input.nextInt();

            if ((number%2==0)&&(number%4==0)){
                sum+=number;

            }
            if (number%2==0){
                System.out.println("Your enter a single number:"+number);
                System.out.println("Sum of the even and devision by four:"+sum);
                break;
            }

        }

    }
}





