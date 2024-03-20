import java.util.Random;
import java.util.Scanner;

public class coinflip {
    public static String HoT = "";
    public static String Flip = "";
    public static int bet1 = 0;
    public static void initial() throws InterruptedException{
        Scanner sysin = new Scanner(System.in);

        System.out.println(colors.TEXT_GOLD + "You have picked Coin Flip, are you sure?");

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
        if (!checksum.bet(bet1)) {
            Thread.sleep(100);

            System.out.println(colors.TEXT_RED + "That is not a valid input");
            bet();
        } else {
            Thread.sleep(100);

            System.out.println(colors.TEXT_BRIGHT_WHITE + "Your bet is $" + colors.TEXT_BRIGHT_GREEN + bet1);

            System.out.println(colors.TEXT_BRIGHT_WHITE + "Choose your coin: " + colors.TEXT_GOLD + "Heads (h)" + colors.TEXT_BLUE + " | " + colors.TEXT_CYAN + "Tails (t)" + colors.TEXT_BLUE + " | " + colors.TEXT_RED + "Side (s, x500 odds)");
            String Choice1 = sysin.nextLine();
            if (Choice1.contains("h")){
                System.out.println("You have picked Heads. Lets play!");
                Thread.sleep(150);
                HoT = "Heads";
                cf();
            } else if (Choice1.contains("t")){
                System.out.println("You have picked Tails. Lets play!");
                Thread.sleep(150);
                HoT = "Tails";
                cf();
            } else if (Choice1.contains("s")){
                System.out.println("You have picked the Side. Lets play!");
                Thread.sleep(150);
                HoT = "Side";
                cf();
            } else{
                System.out.println(colors.TEXT_RED + "That is invalid. Quitting");
                Main.gamemode(); }
        }
    }
    public static void cf() throws InterruptedException {
        Scanner sysin = new Scanner(System.in);


        String Heads = colors.TEXT_GOLD + "Heads" + colors.TEXT_RESET;
        String Tails = colors.TEXT_CYAN + "Tails" + colors.TEXT_RESET;
        String Side = colors.TEXT_BRIGHT_RED + "It landed on its fucking side" + colors.TEXT_RESET;

        Random odds = new Random();
        int flip = odds.nextInt(0, 12000);
        if (flip >= 11998) {
            Thread.sleep(65);
            System.out.println(Side);
            Flip = "Side";

            if (Flip.equals(HoT)){
                Main.money =  (bet1 * 500) + Main.money;
                System.out.println(colors.TEXT_BRIGHT_WHITE + "You have " + colors.TEXT_GOLD + "won! Your money is " + colors.TEXT_BRIGHT_GREEN + Main.money);
            } else {
                Main.money = Main.money - bet1;
                System.out.println(colors.TEXT_BRIGHT_WHITE + "You have" + colors.TEXT_RED +" lost." + colors.TEXT_BRIGHT_RED + " Womp Womp." + colors.TEXT_BRIGHT_WHITE+ " Your money is " + colors.TEXT_BRIGHT_GREEN + Main.money);
            }

            //bet
        } else if(flip > 5999) {
            Thread.sleep(65);
            System.out.println(Heads);
            Flip = "Heads";

            if (Flip.equals(HoT)){
                Main.money = Main.money + bet1;
                System.out.println(colors.TEXT_BRIGHT_WHITE + "You have " + colors.TEXT_GOLD + "won! Your money is " + colors.TEXT_BRIGHT_GREEN + Main.money);
            }else {
                Main.money = Main.money - bet1;
                System.out.println(colors.TEXT_BRIGHT_WHITE + "You have" + colors.TEXT_RED +" lost." + colors.TEXT_BRIGHT_RED + " Womp Womp." + colors.TEXT_BRIGHT_WHITE+ " Your money is " + colors.TEXT_BRIGHT_GREEN + Main.money);
            }

        } else{
            Thread.sleep(65);
            System.out.println(Tails); Flip = "Tails";
            if (Flip.equals(HoT)){
                Main.money = Main.money + bet1;
                System.out.println(colors.TEXT_BRIGHT_WHITE + "You have " + colors.TEXT_GOLD + "won! Your money is " + colors.TEXT_BRIGHT_GREEN + Main.money);
            }else {
                Main.money = Main.money - bet1;
                System.out.println(colors.TEXT_BRIGHT_WHITE + "You have" + colors.TEXT_RED +" lost." + colors.TEXT_BRIGHT_RED + " Womp Womp." + colors.TEXT_BRIGHT_WHITE+ " Your money is " + colors.TEXT_BRIGHT_GREEN + Main.money);
            }

        }

        if (Main.money < 0.1 & bet1 > 24.9){
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "");
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "");
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "");
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "");
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "");
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "");
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ""); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ".."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "..."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "...."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "....."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "......"); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "......."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "........"); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "........."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + ".........."); Thread.sleep(150);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "The casino has taken all of your money. Your life is worthless now.");
            Thread.sleep(1000);
            System.out.println(colors.TEXT_BG_RED + colors.TEXT_BLACK + "You have died");

            return;
        }

        if (Main.money < 0.1){System.out.println(colors.TEXT_RED + "You have lost. Womp Womp."); return;}

        System.out.println("Do you want to change your bets?"); String playagain = sysin.nextLine();

        if (playagain.isEmpty()){
            cf();
        }
        else {
            initial();
        }
    }
}

