package Day02_scanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        // 1- kullanıcıdan uc farkli ata turunde deger alip,
         // girilen degerleri aciklamariyla yaziniz

        // adim1 -  scanner objesi olusturalim

        Scanner scanner = new Scanner(System.in);

        // adim2 - kulaniciya ne istediginizi soyleyin
        System.out.println("Lutfen isminizi giriniz");

        // adim3 - girilen bilgiye uygun bir variable olusturup
        //         data turune uygun nex... () ile bilgiyi alip kaydedin
       // String girilenIsim= scanner. next(); // sadece ilk ismi alir

        String girilenIsim = scanner.nextLine();
        System.out.println("Girdiginiz isim: " + girilenIsim);

        // ikinci olarak bir tam sayi isteyelim mesel yas

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Yasiniz :" + yas);

        // emekli misiniz? true / false
        System.out.println("Emekli misiniz ? true veya false olarak giriniz");
        boolean emekliMi = scanner.nextBoolean();

        System.out.println("Emekli misiniz:" + emekliMi);











    }
}
