import java.util.Random;
import java.util.Scanner;

public class Coinflip {
    public static String HoT = "";
    public static String Flip = "";
    public static int bet1 = 0;
    public static void initial(Scanner sysin) throws InterruptedException{
        System.out.println(Colors.TEXT_GOLD + "You have picked Coin Flip, are you sure?");

        String Choice1 = sysin.nextLine();
        if (Choice1.contains("y")){
            bet(sysin);
        } else Main.gamemode(sysin);
    }
    public static void bet(Scanner sysin) throws InterruptedException {
        bet1 = Misc.getBet(sysin);

        System.out.println(Colors.TEXT_BRIGHT_WHITE + "Choose your coin: " + Colors.TEXT_GOLD + "Heads (h)" + Colors.TEXT_BLUE + " | " + Colors.TEXT_CYAN + "Tails (t)" + Colors.TEXT_BLUE + " | " + Colors.TEXT_RED + "Side (s, x500 odds)");
        String Choice1 = sysin.nextLine();
        if (Choice1.contains("h")){
            System.out.println("You have picked Heads. Lets play!");
            Thread.sleep(150);
            HoT = "Heads";
            cf(sysin);
        } else if (Choice1.contains("t")){
            System.out.println("You have picked Tails. Lets play!");
            Thread.sleep(150);
            HoT = "Tails";
            cf(sysin);
        } else if (Choice1.contains("s")){
            System.out.println("You have picked the Side. Lets play!");
            Thread.sleep(150);
            HoT = "Side";
            cf(sysin);
        } else{
            System.out.println(Colors.TEXT_RED + "That is invalid. Quitting");
            Main.gamemode(sysin); }
    }
    public static void cf(Scanner sysin) throws InterruptedException {

        String Heads = Colors.TEXT_GOLD + "Heads" + Colors.TEXT_RESET;
        String Tails = Colors.TEXT_CYAN + "Tails" + Colors.TEXT_RESET;
        String Side = Colors.TEXT_BRIGHT_RED + "It landed on its fucking side" + Colors.TEXT_RESET;

        Random odds = new Random();
        int flip = odds.nextInt(0, 12000);
        if (flip >= 11998) {
            Thread.sleep(65);
            System.out.println(Side);
            Flip = "Side";

            if (Flip.equals(HoT)){
                Main.money =  (bet1 * 500) + Main.money;
                System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have " + Colors.TEXT_GOLD + "won! Your money is " + Colors.TEXT_BRIGHT_GREEN + Main.money);
            } else {
                Main.money = Main.money - bet1;
                System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have" + Colors.TEXT_RED +" lost." + Colors.TEXT_BRIGHT_RED + " Womp Womp." + Colors.TEXT_BRIGHT_WHITE+ " Your money is " + Colors.TEXT_BRIGHT_GREEN + Main.money);
            }

            //bet
        } else if(flip > 5999) {
            Thread.sleep(65);
            System.out.println(Heads);
            Flip = "Heads";

            if (Flip.equals(HoT)){
                Main.money = Main.money + bet1;
                System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have " + Colors.TEXT_GOLD + "won! Your money is " + Colors.TEXT_BRIGHT_GREEN + Main.money);
            }else {
                Main.money = Main.money - bet1;
                System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have" + Colors.TEXT_RED +" lost." + Colors.TEXT_BRIGHT_RED + " Womp Womp." + Colors.TEXT_BRIGHT_WHITE+ " Your money is " + Colors.TEXT_BRIGHT_GREEN + Main.money);
            }

        } else{
            Thread.sleep(65);
            System.out.println(Tails); Flip = "Tails";
            if (Flip.equals(HoT)){
                Main.money = Main.money + bet1;
                System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have " + Colors.TEXT_GOLD + "won! Your money is " + Colors.TEXT_BRIGHT_GREEN + Main.money);
            }else {
                Main.money = Main.money - bet1;
                System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have" + Colors.TEXT_RED +" lost." + Colors.TEXT_BRIGHT_RED + " Womp Womp." + Colors.TEXT_BRIGHT_WHITE+ " Your money is " + Colors.TEXT_BRIGHT_GREEN + Main.money);
            }

        }

        if (Main.money < 0.1 & bet1 > 24.9){
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "");
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "");
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "");
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "");
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "");
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "");
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ""); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ".."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "..."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "...."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "....."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "......"); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "......."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "........"); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "........."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + ".........."); Thread.sleep(150);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "The casino has taken all of your money. Your life is worthless now.");
            Thread.sleep(1000);
            System.out.println(Colors.TEXT_BG_RED + Colors.TEXT_BLACK + "You have died");

            return;
        }

        if (Main.money < 0.1){System.out.println(Colors.TEXT_RED + "You have lost. Womp Womp."); return;}

        System.out.println("Do you want to change your bets?"); String playagain = sysin.nextLine();

        if (playagain.isEmpty()){
            cf(sysin);
        }
        else {
            initial(sysin);
        }
    }
}
