package Loop;

import java.util.Scanner;

public class EvenNumberAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Looop Number:");
        int number= input.nextInt();
        int summ=0;
        int sayac=0;

        for (int i=1;i<=number;i++){
            System.out.println(i);
            if (i%2==0){
                summ +=i;
                sayac +=1;
            }

        }
        System.out.println("Total even number:"+summ);
        System.out.println("Average even number:"+(summ/sayac));

    }
}
