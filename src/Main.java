public class Main {

    public static void main(String[] args) {
        final String masterCard = "2221";

        String number = new CardNumberGenerator().generate(masterCard);

        System.out.println(number);
    }
}
