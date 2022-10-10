package Loop;

import java.util.Scanner;

public class armstrongNumber {
    public static int ExpoCalculator(int number,int power){
        int expo=1;

        for (int i=1;i<=power;i++){
            expo*=number;

        }
        return expo;


    }

    public static int findStep(int number){
        int step=1;
        int bolum;
        while(true){
            bolum=number/10;
            number=bolum;
            step++;
            if (number<10){
                return step;
            }




        }


    }
    public  static int findStepp(int number){


        while (true){

            if (number<10){
                return number;
            }
                int kalan=number%10 ;

                int bolum=number/10;
                number=bolum;

                return kalan;


               }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter Number:");
        int number=input.nextInt();
        int oldNumber=number;
        int sum=0;

        int a=(findStep(number));//loop continue a
        for (int i =0;i<a;i++){

           int b=findStepp(number);
           int bolum=number/10;
            number=bolum;
          int c=ExpoCalculator(b,a);
          sum +=c;


        }
        System.out.println(sum);
        if (sum==oldNumber){
            System.out.println( "It is a Armstrong Number:"+oldNumber);
        }else {
            System.out.println("It is not a Armstrong Number:"+oldNumber);
        }









        }







    }

