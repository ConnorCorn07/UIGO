import java.util.Random;
import java.util.Scanner;

public class Slots {

    public static void initial(Scanner sysin) throws InterruptedException {


        System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have picked Slots, are you sure?");

        String Choice2 = sysin.nextLine();
        if (Choice2.equals("y")) {
            int bet = Misc.getBet(sysin);
            while (true) {
                if (!slotsGame(sysin, bet)) {
                    break;
                }
            }
        }
        Main.gamemode(sysin);
    }

    public static boolean slotsGame(Scanner sysin, int bet) {
        if (bet > Main.GetBalance()) {
            System.out.println(Colors.TEXT_RED + "You don't have enough chips left to cover that bet.");
            return false;
        }
        Misc.execBet(bet);
        System.out.println();
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "Balance : " + Colors.TEXT_BRIGHT_GREEN + Main.GetBalance() + Colors.TEXT_BRIGHT_WHITE + " Chips");
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "Current bet : " + Colors.TEXT_BRIGHT_GREEN + bet + Colors.TEXT_BRIGHT_WHITE + " Chips");

        Random random = new Random();
        int[] roll = new int[3];
        for (int i = 0; i < 3; i++) {
           roll[i] = random.nextInt(0, 3);

        }

        for (int i = 0; i < 3; i++) {
           switch (roll[i]) {
               case 0:
                   System.out.print(Colors.TEXT_BRIGHT_RED + "[]");
                   break;
               case 1:
                   System.out.print(Colors.TEXT_BRIGHT_GREEN + "[]");
                   break;
               case 2:
                   System.out.print(Colors.TEXT_BRIGHT_CYAN + "[]");
                   break;
           }
        }
        System.out.println(Colors.TEXT_BRIGHT_WHITE);
        if (roll[0] == roll[1] && roll[1] == roll[2]) {
           System.out.println();
           System.out.println(Colors.TEXT_BRIGHT_GREEN + "+" + bet*9 + Colors.TEXT_BRIGHT_WHITE + " Chips" );
           Main.AddBalance(bet*9);
           System.out.println("New Balance : " + Colors.TEXT_BRIGHT_GREEN + Main.GetBalance() + Colors.TEXT_BRIGHT_WHITE + " Chips");
        }

        System.out.println("Press Enter to spin again");
        return sysin.nextLine().isEmpty();

    }

}
