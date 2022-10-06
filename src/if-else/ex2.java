package KosulEx;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
                /*
                Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
          unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
          "Şifre oluşturulamadı, lütfen başka şifre giriniz."
         sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
                 */


        Scanner input =new Scanner(System.in);

        System.out.println("Plesade login password:");
        String pass=input.nextLine();

        String oldPass="Pass";

        if (pass==oldPass){
            System.out.println("Password is true");
        } else  {
            System.out.println("'WRONG!!' Do you want to reset password '1/0");
            byte a=input.nextByte();
            if (a==1){
                System.out.println("Please enter new password:");
                String newPass=input.nextLine();

                if (newPass==oldPass){
                    System.out.println("You are enter old password.Password not generated!!!");

                }else {
                    System.out.println("you are change password sucess!");
                    oldPass=newPass;

                }
            }else {
                System.out.println("Exit the code!!!");
            }



        }


    }
}
