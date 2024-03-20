import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class slots {
    public static int bet1 = 0;

    public static void initial() throws InterruptedException {
        Scanner sysin = new Scanner(System.in);

        System.out.println(colors.TEXT_BRIGHT_WHITE + "You have picked Slots, are you sure?");

        String Choice2 = sysin.nextLine();
        if (Choice2.equals("y")) {
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


        }
    }
}
