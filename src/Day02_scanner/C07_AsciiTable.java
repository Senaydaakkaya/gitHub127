package Day02_scanner;



import java.util.Scanner;

public class C07_AsciiTable {
    public static void main(String[] args) {


        // kullanicidan bir char alip acsii table'da
        // o karakterden sonra gelen 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ascii table'dan bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonraki karakter: " + (char) (krk + 1));
        System.out.println("girilen karakterden 2 sonraki karakter: " + (char) (krk + 2));
        System.out.println("girilen karakterden 3 sonraki karakter: " + (char) (krk + 3));


    }





    }
