import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        /*This project make average of array*/
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter List Size:");
        int size=input.nextInt();

        int []list=new int[size];
        System.out.println(list.length);

        for (int i=0;i< size;i++){
            System.out.println("Please Enter List Element:["+i+"] ");
            list[i]=input.nextInt();}

        int sum=0;

        for (int i:list){
            sum+=list[i];

        }
        System.out.println("Sum list[]="+sum);
        int average=sum/list.length;
        System.out.println("Average list[]="+average);

    }

}
