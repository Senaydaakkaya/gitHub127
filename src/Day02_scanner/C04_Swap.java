package Day02_scanner;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        // Soru 7 - kullanicidan iki sayı alip
        //          ikisinin degerlerini degistirin (swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen ilk tamsayiyi sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen ikinci tam sayi giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("Girdiginiz degerler: sayi1=" + sayi1+",sayi2="+sayi2);

        int bosKova = 0;

        bosKova = sayi2;

        sayi2 = sayi1;

        sayi1 = bosKova;


        System.out.println("Degistirilen: sayi1 = " + sayi1 +", sayi2"+ sayi2);








    }
}
