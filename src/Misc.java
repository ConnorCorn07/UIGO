import java.util.Scanner;

public class Misc {

    public static int getBet(Scanner sysin) throws InterruptedException {
        int bet = 0;
        while (true) {
            System.out.println(colors.TEXT_BRIGHT_WHITE + "Place your bets");
            Thread.sleep(150);
            System.out.println(colors.TEXT_BRIGHT_WHITE + "You have " + colors.TEXT_BRIGHT_GREEN + Main.money + colors.TEXT_BRIGHT_WHITE + " Chips");
            try {
                bet = Integer.parseInt(sysin.nextLine());
            } catch (NumberFormatException e) {
            }

            if (!checksum.bet(bet)) {
                System.out.println(colors.TEXT_RED + "That is not a valid input");

            } else {
                System.out.println(colors.TEXT_BRIGHT_WHITE + "Your bet is " + colors.TEXT_BRIGHT_GREEN + bet + colors.TEXT_BRIGHT_WHITE + " Chips");
                return bet;

            }

        }
    }

    public static void execBet(int bet) {
        if (checksum.bet(bet)) {
            Main.money -= bet;
            return;
        } else {
            throw new RuntimeException("Unable to execute bet");
        }
    }


}
