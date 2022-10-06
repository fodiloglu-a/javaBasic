import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println( "Please Enter List Size:");
        int size=input.nextInt();
        int[] list=new int[size];
        for (int i=0;i< list.length;i++){
            System.out.println("Enter List:["+i+"]");

            list[i]= input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("list min element="+list[0]);

        System.out.println("list max element="+list[list.length-1]);







    }
}
