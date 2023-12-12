import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance;
        double fare = 2.20, amount;
        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi KM cinsinden giriniz : ");

        distance = inp.nextInt();

        amount = distance * fare + 10;

        if (amount < 20) {

            amount = 20;
        }
        System.out.print("Toplam Tutar : " + amount + "TL");
    }
}