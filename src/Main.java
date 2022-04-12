import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String masterCard;

        System.out.print("Enter id number: ");
        masterCard = scanner.nextLine();

        String number = new CardNumberGenerator().generate(masterCard);

        System.out.println(number);
    }
}
