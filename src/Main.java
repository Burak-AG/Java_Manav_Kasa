import java.util.Scanner;
// Manav-Kasa Programı
public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo aldın? : ");
        int armutKilo = input.nextInt();
        System.out.print("Elma kaç kilo aldın? : ");
        int elmaKilo = input.nextInt();
        System.out.print("Domates kaç kilo aldın? : ");
        int domatesKilo = input.nextInt();
        System.out.print("Muz kaç kilo aldın? : ");
        int muzKilo = input.nextInt();
        System.out.print("Patlıcan kaç kilo aldın? : ");
        int patlicanKilo = input.nextInt();

        double toplam = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) +
                (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);
        System.out.println("Toplam tutar : " + toplam + " TL");
    }
}
