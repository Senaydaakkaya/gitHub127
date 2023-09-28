package Practise;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        // kulanıcıdan gun ismi alın ve haftaıcı veya haftasonu oldugunu yazdırn
        // ornek: gun= pazar output = "hafta sonu" gun= salı output = "hafta ici"
        // string icin equals methodunu salı kullanın


        Scanner scan = new Scanner(System.in);
        System.out.print("Bugün günlerden hangi gün: ");
        String gun = scan.next().toLowerCase();
        /*
        ||: veya (herhangi biri)  or
        &&: ve (her ikisi de)  and
         */
        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Bugün Haftaiçi bir gün");
        }
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bugün Haftasonu bir gün");
        }
        if (!(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")
                || gun.equals("cumartesi") || gun.equals("pazar"))) {
            System.out.println("O girdiğiniz bir gün değil. Yanlış girdiniz");
        }



    }
}
