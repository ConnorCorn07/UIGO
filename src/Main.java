//import java.util.Random;
import java.util.Scanner;



public class Main {
    public static int money = 100;

    public static void main(String[] args) throws InterruptedException {


        System.out.println(colors.TEXT_BRIGHT_WHITE + "Choose your gamemode:");
        Thread.sleep(250);
        gamemode();
    }

    public static void gamemode() throws InterruptedException {
        if (!checksum.balance()) {
            throw new RuntimeException("Player balance is invalid (" + money + ")");
        }
        Scanner sysin = new Scanner(System.in);

        System.out.println(colors.TEXT_BRIGHT_GREEN + "Slots (s) " + colors.TEXT_BLUE + "|" + colors.TEXT_BRIGHT_BLACK + " Blackjack (bj) " + colors.TEXT_BLUE + "|" + colors.TEXT_GOLD + " Coin Flip (cf)" + colors.TEXT_BLUE + "|" + colors.TEXT_RED + " Russian Roulette (r)");

        String choice = sysin.nextLine();
        if (choice.contains("s")) {
            slots.initial();
        }
        if (choice.contains("bj")) {
            blackjack.initial();
        }
        if (choice.contains("cf")) {
            coinflip.initial();
        }
        if (choice.contains("r")) {
            russia.initial();
        }
    }

    public static int GetBalance() {
        if (!checksum.balance()) {
            throw new RuntimeException("Player balance is invalid (" + money + ")");
        } else return money;
    }

    public static void AddBalance(int add) {
        if (!checksum.balance()) {
            throw new RuntimeException("Player balance is invalid (" + money + ")");
        } else money = money + add;
    }
}