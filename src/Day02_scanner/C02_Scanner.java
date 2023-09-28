package Day02_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // soru 4- kullanicidan bir dikdörtgenin 2 kenar
        //         uzunlugunu alip, dikdortgenin alanini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdörtgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani:" + kenar1*kenar2);

    }
}
