import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        String [][] liste=new String[][] {
                {"*","*","*","*","*"},
                {"*"," "," "," ","*"},
                {"*","*","*","*","*"},
                {"*"," "," "," ","*"},
                {"*"," "," "," ","*"},
        };

       for (int i = 0; i< liste.length; i++)
       {
           for (int j=0;j<liste.length;j++){
               System.out.print(liste[i][j]);


       }
           System.out.println();
       }







    }
}







