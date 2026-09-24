import java.util.*;
import java.util.Scanner;

import static java.util.Collections.shuffle;

public class Blackjack {
    private static final int decks = 1;
    static List<Integer> playerhand = new ArrayList<>();
    static List<Integer> dealerhand = new ArrayList<>();

    static int currentcard = 0;

    public static void initial(Scanner sysin) throws InterruptedException {
        System.out.println(Colors.TEXT_BRIGHT_WHITE + "You have picked BlackJack, are you sure?");

        String choice = sysin.nextLine();
        if (choice.equals("y")) {
            bet(sysin);
        } else Main.gamemode(sysin);
    }


    public static void bet(Scanner sysin) throws InterruptedException {
        int bet = Misc.getBet(sysin);
        backjack(bet, decks, sysin);
    }

    public static void playagain(int bet, Scanner sysin) throws InterruptedException {
        System.out.println("Current Balance " + Colors.TEXT_BRIGHT_GREEN + Main.money + " chips" + Colors.TEXT_BRIGHT_WHITE);
        System.out.println("Press enter to continue");
        String playagain = sysin.nextLine();
        if (playagain.isEmpty()){
            if (Checksum.bet(bet)) {

                backjack(bet, decks, sysin);
            } else Main.gamemode(sysin);
        }
        else {
            initial(sysin);
        }
    }
    public static void backjack(int bet, int decks, Scanner sysin) throws InterruptedException {
        playerhand.clear();
        dealerhand.clear();
        currentcard = 0;
        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i <= decks; i++) {
            Collections.addAll(cards, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52);
        }
        Main.money = Main.money - bet;
        shuffle(cards);
        dealcards(cards);
        System.out.println("Dealer : | " + displaycard(dealerhand.get(1)) + " | []");

        while (true) {
            int cardval = 0;

            System.out.print("You : | ");
            for (int i = 0; i <= playerhand.size() - 1; i++) {
                System.out.print(displaycard(playerhand.get(i)) + " | ");
                cardval = cardval + cardvalue(playerhand.get(i));

            }

            if (cardval > 21) {
                cardval = cardval - (10 * Collections.frequency(playerhand, 1)) - (10 * Collections.frequency(playerhand, 14)) - (10 * Collections.frequency(playerhand, 27)) - (10 * Collections.frequency(playerhand, 40));
            }

            System.out.println();
            System.out.println("Card Value : " + Colors.TEXT_BRIGHT_YELLOW + cardval + Colors.TEXT_BRIGHT_WHITE);

            if (cardval > 21) {
                playerhand.clear();
                dealerhand.clear();
                currentcard = 0;
                System.out.println(Colors.TEXT_BRIGHT_RED + "Bust" + Colors.TEXT_BRIGHT_WHITE);
                break;
            }
            String choice = sysin.nextLine();
            if (choice.contains("hit")) {
                addcard(playerhand, cards);
            } else {
                while (true) {
                    int dealercardval = 0;

                        for (int i = 0; i <= dealerhand.size() - 1; i++) {
                            dealercardval = dealercardval + cardvalue(dealerhand.get(i));

                        }
                        if (dealercardval < 17) {
                            addcard(dealerhand, cards);
                        } else {
                            System.out.print("Dealer : | ");
                            for (int i = 0; i <= dealerhand.size() - 1; i++) {

                                System.out.print(displaycard(dealerhand.get(i)) + " | ");


                            }
                            System.out.println();
                            System.out.println("Dealer Card Value : " + Colors.TEXT_BRIGHT_YELLOW + dealercardval + Colors.TEXT_BRIGHT_WHITE);
                            System.out.println();
                            if (cardval == 21) {
                                System.out.println(Colors.TEXT_BRIGHT_YELLOW + "Blackjack" + Colors.TEXT_BRIGHT_WHITE);
                                Main.money = Main.money + bet * 3;
                            }else if (dealercardval > 21 || dealercardval < cardval) {
                                System.out.println(Colors.TEXT_BRIGHT_GREEN + "Win" + Colors.TEXT_BRIGHT_WHITE);
                                Main.money = Main.money + bet * 2;
                            } else if (dealercardval == cardval) {
                                System.out.println(Colors.TEXT_RESET + "Push" + Colors.TEXT_BRIGHT_WHITE);
                                Main.money = Main.money + bet;
                            } else if (dealercardval == 21) {
                                System.out.println(Colors.TEXT_BRIGHT_RED + "Dealer Blackjack" + Colors.TEXT_BRIGHT_WHITE);
                            } else System.out.println(Colors.TEXT_BRIGHT_RED + "Lose" + Colors.TEXT_BRIGHT_WHITE);
                            System.out.println();
                            break;

                        }

                    }
                    break;
                }


            }
        playagain(bet, sysin);

    }

        private static void dealcards(List<Integer> cards) {
            addcard(playerhand, cards);
            addcard(dealerhand, cards);
            addcard(playerhand, cards);
            addcard(dealerhand, cards);


        }

        private static String displaycard(int card) {
            String suit = null;
            String facecard = null;
            if (card <= 13) {
                suit = "Clubs";
            } else if (card <= 26) {
                suit = "Diamonds";
                card = card - 13;
            } else if (card <= 39) {
                suit = "Hearts";
                card = card - 13 * 2;
            } else if (card <= 52) {
                suit = "Spades";
                card = card - 13 * 3;
            }
            if (card > 10 || card == 1) {
                switch (card) {
                    case 1 -> facecard = "Ace";
                    case 11 -> facecard = "Jack";
                    case 12 -> facecard = "Queen";
                    case 13 -> facecard = "King";
                }
            } else facecard = String.valueOf(card);
            return facecard + " of " + suit;
        }

        private static int cardvalue(int card) {
            int value = 0;
            if (card > 13 && card <= 26) {
                card = card - 13;
            } else if (card > 13 && card <= 39) {
                card = card - 13 * 2;
            } else if (card > 13 && card <= 52) {
                card = card - 13 * 3;
            }

            if (card > 10) {
                switch (card) {
                    case 11, 13, 12 -> value = 10;
                }
            } else if (card == 1) {
                value = 11;


            } else value = card;

            return value;
        }

        private static void addcard(List<Integer> hand, List<Integer> cards) {
            hand.add(cards.get(currentcard));
            currentcard++;

    }
}
