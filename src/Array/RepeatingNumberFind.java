import java.util.Arrays;
import java.util.Scanner;

public class RepeatingNumberFind {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] list=new int[5];
        for (int i=0;i< list.length;i++){
            System.out.println("Please Enter list["+i+"]");
            list[i]=input.nextInt();

        }

        for (int i =0;i<list.length;i++){
            for (int j=0;j< list.length;j++){
                if ((list[i]==list[j])&&(i!=j)){
                    System.out.println("Tekara eden değer=>"+list[i]);
                    i++;
                }


            }


        }
    }
}
