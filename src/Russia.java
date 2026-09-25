import java.util.Random;
import java.util.Scanner;

public class Russia {

    protected static final int winPayout = 2;
    protected static final int losePayout = 10;

    public static void initial(Scanner sysin) throws InterruptedException{

        System.out.println(Colors.TEXT_RED + "Russian Roulette");
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "We will load the bullets in a random order. 5 are blanks. One is not");
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "Every time you pull the trigger, your bet is doubled,");
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "But if the round goes off, your lose 10x your bet");
        Thread.sleep(500);
        System.out.println("Would you like to continue");



        String Choice1 = sysin.nextLine();
        if (Choice1.contains("y")){
            int max = Main.GetBalance() / 10;
            if (max > 0) {
                russiaGame(sysin, Misc.getBet(sysin, max));
            }
            System.out.println(Colors.TEXT_RED + "You don't have enough chips to play this game");
            Main.gamemode(sysin);
        } else Main.gamemode(sysin);
    }

    private static void russiaGame(Scanner sysin, int bet) {
        if (bet*losePayout > Main.GetBalance()) {
            System.out.println(Colors.TEXT_RED + "You don't have enough chips left to cover that bet.");
            return;
        }
        Misc.execBet(bet*losePayout);

        Random random = new Random();
        int round = random.nextInt(0, 6);
        for (int i = 0; i <= round; i++) {
            if (i == round) {
                System.out.println("*Boom* You lost " + Colors.TEXT_RED + bet*losePayout + Colors.TEXT_BRIGHT_WHITE + " Chips to medical bills");
                break;
            } else {
                System.out.print("*Click* Winnings : ");
                System.out.println(bet * (int) Math.pow(winPayout, i + 1));
                if (!sysin.nextLine().isEmpty()) {
                    Main.AddBalance((int) (bet*losePayout + bet*Math.pow(winPayout, i + 1)));
                    System.out.println("Win " + Main.GetBalance());
                    break;
                }
            }

        }


    }
}
