import java.util.Random;
import java.util.Scanner;

public class russia {
    public static int bet1 = 0;
    public static void initial() throws InterruptedException{
        Scanner sysin = new Scanner(System.in);
        System.out.println(colors.TEXT_RED + "You have picked Russian Roulette, are you sure?");

        String Choice1 = sysin.nextLine();
        if (Choice1.contains("y")){
            bet();
        } else Main.gamemode();
    }
    public static void bet() throws InterruptedException {
        Scanner sysin = new Scanner(System.in);

        System.out.println(colors.TEXT_BRIGHT_WHITE + "Place your bets");
        Thread.sleep(150);
        System.out.println(colors.TEXT_BRIGHT_WHITE + "You have $" + colors.TEXT_BRIGHT_GREEN + Main.money);
        bet1 = Integer.parseInt(sysin.nextLine());
        if (bet1 > Main.money) {
            Thread.sleep(100);

            System.out.println(colors.TEXT_RED + "That is not a valid input");
            bet();
        } else {
            Thread.sleep(100);

            System.out.println(colors.TEXT_BRIGHT_WHITE + "Your bet is $" + colors.TEXT_BRIGHT_GREEN + bet1);
            System.out.println(colors.TEXT_BRIGHT_WHITE + "Lets blow your head off!");
            rule();
        }
    }
    public static void rule() throws InterruptedException {

        System.out.println(colors.TEXT_BRIGHT_WHITE + "You are betting $" + colors.TEXT_BRIGHT_GREEN + bet1);
        Thread.sleep(500);
        System.out.println(colors.TEXT_BRIGHT_WHITE + "You have a 1 in 6 chance of dying for a chance of doubling your money");
        Thread.sleep(1250);
        System.out.println("We will load the bullets in a random order. 5 are blanks. One is not, ");
        Thread.sleep(1500);

    }
}
