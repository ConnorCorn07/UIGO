import java.util.Scanner;

public class Misc {

    public static int getBet(Scanner sysin) {
        return getBet(sysin, 0);
    }

    public static int getBet(Scanner sysin, int max) {
        int bet;
        while (true) {
            System.out.print(Colors.TEXT_BRIGHT_WHITE + "Place your bet");
            if (max > 0) {
                System.out.println(" | Max : " + max);
            } else { System.out.println(); }

            System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have " + Colors.TEXT_BRIGHT_GREEN + Main.money + Colors.TEXT_BRIGHT_WHITE + " Chips");

            try {
                bet = Integer.parseInt(sysin.nextLine());
            } catch (NumberFormatException e) { bet = 0; }

            if (!Checksum.bet(bet) || (max > 0 && bet > max)) {
                System.out.println(Colors.TEXT_RED + "That is not a valid input");

            } else {
                System.out.println(Colors.TEXT_BRIGHT_WHITE + "Your bet is " + Colors.TEXT_BRIGHT_GREEN + bet + Colors.TEXT_BRIGHT_WHITE + " Chips");
                return bet;

            }

        }
    }

    public static void execBet(int bet) {
        if (Checksum.bet(bet)) {
            Main.money -= bet;
        } else {
            throw new RuntimeException("Unable to execute bet");
        }
    }


}
