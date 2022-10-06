package KosulEx;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        /*
        Koç Burcu : 21 Mart - 20 Nisan

        Boğa Burcu : 21 Nisan - 21 Mayıs

        İkizler Burcu : 22 Mayıs - 22 Haziran

        Yengeç Burcu : 23 Haziran - 22 Temmuz

        Aslan Burcu : 23 Temmuz - 22 Ağustos

        Başak Burcu : 23 Ağustos - 22 Eylül

        Terazi Burcu : 23 Eylül - 22 Ekim

        Akrep Burcu : 23 Ekim - 21 Kasım

        Yay Burcu : 22 Kasım - 21 Aralık

        Oğlak Burcu : 22 Aralık - 21 Ocak

        Kova Burcu : 22 Ocak - 19 Şubat

        Balık Burcu : 20 Şubat - 20 Mart

        Ödev
        Aynı örneği switch-case kullanmadan yapınız.
         */

        System.out.println("Please enter your birth (numeric)month:");
        byte month= imput.nextByte();
        System.out.println("Please enter your birth day:");
        byte day= imput.nextByte();

        if (month==1){
            if (day<=21){
                System.out.println("You are Capricon");
            }
            else {
                System.out.println("You are Aquarius");
            }

        } else if (month==2) {
            if (day<=19){
                System.out.println("You are Awuarius");
            }
            else {
                System.out.println("You are Pisces");
            }

        } else if (month==3) {
            if (day<=20){
                System.out.println("You are Pisces");
            }else{
                System.out.println("You are Arius");
            }

        } else if (month==4) {
            if (day<=20){
                System.out.println( "You are Arius");
            }else {
                System.out.println("You are Taurus");
            }

        } else if (month==5) {
            if (day<=21){
                System.out.println("You are Taurus");
            }else {
                System.out.println("Gemini");
            }
            
        } else if (month==6) {
            if (day<=22){
                System.out.println("You are Gemini");
            }else {
                System.out.println("You are Cancer");
            }

        } else if (month==7) {
            if (day<=22){
                System.out.println( "You are Cancer");
            }else {
                System.out.println("You are Leo");
            }

        } else if (month==8) {
            if (day<=22){
                System.out.println("You are Leo");
            }else {
                System.out.println("You are Virgo");
            }

        } else if (month==9) {
            if (day<=21){
                System.out.println("You are Virgo");
            }else {
                System.out.println("You are Libra");
            }
        } else if (month==10) {
            if (day<=22){
                System.out.println("You are Libra");
            }else{
                System.out.println( "You are Scorpio");
            }

        } else if (month==11) {
            if (day<=21){
                System.out.println( "You are Scorpio");
            }
            else {
                System.out.println("You are Sagittarius");
            }

        } else if (month==12) {
            if (day<=21){
                System.out.println("You are Sagittarius");
            }else {
                System.out.println("you are Carpicorn");
            }

        }


    }
}
