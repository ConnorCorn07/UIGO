import java.util.Scanner;



public class Main {
    public static int money = 100;

    @SuppressWarnings({"unused"})
    static void main(String[] args) throws InterruptedException {
        Scanner sysin = new Scanner(System.in);

        System.out.println(Colors.TEXT_BRIGHT_WHITE + "Choose your gamemode:");
        Thread.sleep(250);
        gamemode(sysin);
    }

    public static void gamemode(Scanner sysin) throws InterruptedException {
        if (!Checksum.balance()) {
            throw new RuntimeException("Player balance is invalid (" + money + ")");
        }

        System.out.println(Colors.TEXT_BRIGHT_GREEN + "Slots (s) " + Colors.TEXT_BLUE + "|" + Colors.TEXT_BRIGHT_BLACK + " Blackjack (bj) " + Colors.TEXT_BLUE + "|" + Colors.TEXT_GOLD + " Coin Flip (cf)" + Colors.TEXT_BLUE + "|" + Colors.TEXT_RED + " Russian Roulette (r)");

        String choice = sysin.nextLine().trim().toLowerCase();
        switch (choice) {
            case "s" -> Slots.initial(sysin);
            case "bj" -> Blackjack.initial(sysin);
            case "cf" -> Coinflip.initial(sysin);
            case "r" -> Russia.initial(sysin);
            default -> {
                System.out.println(Colors.TEXT_RED + "That is not a valid choice. Please type s, bj, cf, or r.");
                gamemode(sysin);
            }
        }
    }

    public static int GetBalance() {
        if (!Checksum.balance()) {
            throw new RuntimeException("Player balance is invalid (" + money + ")");
        } else return money;
    }

    public static void AddBalance(int add) {
        if (!Checksum.balance()) {
            throw new RuntimeException("Player balance is invalid (" + money + ")");
        } else money += add;
    }
}
