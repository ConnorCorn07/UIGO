# UIGO
U(nderground) I(llegal) G(ambling) O(pperation)

A terminal-based casino game written in Java. You start with **100 chips** and pick a game from a colorful ANSI-text menu. Try not to lose it all.

> All chips are fake. No real money is involved.

## Games

| Game | Command | Status |
|------|---------|--------|
| Blackjack | `bj` | Playable |
| Coin Flip | `cf` | Playable |
| Slots | `s` | Playable YAY! |
| Russian Roulette | `r` | Work in progress (intro only) |

Type the command at the menu (`s`, `bj`, `cf`, or `r`). Anything else shows an error and re-shows the menu.

### Blackjack
- Played against a dealer with a shuffled deck.
- Type `hit` to draw a card. Type anything else to stand.
- Aces count as 11, or as 1 if you would otherwise bust.
- The dealer draws until they reach at least 17.
- Payouts: **Win** pays 1:1. **Blackjack** (21) pays 2:1. **Push** returns your bet.
- Press Enter after a hand to play again with the same bet.

### Coin Flip
- Call `h` (Heads), `t` (Tails), or `s` (Side).
- Heads/Tails pay 1:1.
- Landing on the side has about a 1 in 6000 chance and pays **500x**.
- Press Enter after a flip to flip again with the same bet.

### Slots
- Place your bet.
- Press `enter` to roll.
- Getting 3 of the same color pays out **8x**.
- Press Enter roll again with the same bet.
- If your balance can no longer cover that bet, it'll tell you and end the session instead of quitting silently.

### Russian Roulette
- Still work in progress: currently only plays the intro and takes your bet.
- Your max bet is capped at 1/10th of your balance (minimum 1 chip).

## Requirements

- **Java 17 or newer.** The code uses `Random.nextInt(origin, bound)` and switch expressions.
- A terminal that supports ANSI color codes. Most modern terminals do, including Windows Terminal and the IntelliJ run console.

## Running

### From IntelliJ IDEA
Open the project folder and run `src/Main.java`.

### From the command line
```sh
javac -d out src/*.java
java -cp out Main
```

## Project Structure

```
src/
  Main.java        Entry point, game menu, and player balance
  Blackjack.java   Blackjack game
  Coinflip.java    Coin Flip game
  Slots.java       Slots (WIP)
  Russia.java      Russian Roulette (WIP)
  Checksum.java    Bet and balance validation
  Misc.java        Shared bet-prompt and bet-execution helpers
  Colors.java      ANSI color constants for terminal output
  test.fxml        Early JavaFX layout for a future graphical blackjack UI
assets/Large/      Playing card images (all suits, card backs, jokers)
```

## Roadmap

- Finish Slots and Russian Roulette

## License

This project is under the [MIT License](LICENSE).
