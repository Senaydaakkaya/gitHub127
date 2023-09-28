package Practise;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {


        // double olarak verilen 3 sayının toplamını int olarak yazdırın
        // ipucu: double büyüktür float büyüktür long büyüktür int büyüktür short büyüktür byte


        double  a=3, b=7 , c=3.12;
        int toplam= (int) (a+b+c);

        System.out.println("toplam = " + toplam);


        //System.out.println("a =" + a");

        // kullanıcıdan bir harf girmesini isteyin. 0 harften sonra gelen harfleri
        // girdiginiz harf;
        // girdiginiz harften sonraki 3 harf;
        // seklinde yazdırın.
        // ipucu: char

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz");

        char harf = scan.next().charAt(0);
        System.out.println("Girdiginiz harf: "+harf);
        System.out.println("Girdiğiniz harften sonraki 3 harf: "+(char)(harf+1)+", "+(char)(harf+2)+", "+(char)(harf+3)+"'dir.");




    }
}