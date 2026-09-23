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
  blackjack.java   Blackjack game
  coinflip.java    Coin Flip game
  slots.java       Slots (WIP)
  russia.java      Russian Roulette (WIP)
  checksum.java    Bet and balance validation
  colors.java      ANSI color constants for terminal output
  test.fxml        Early JavaFX layout for a future graphical blackjack UI
assets/Large/      Playing card images (all suits, card backs, jokers)
```

## Roadmap

- Finish Slots and Russian Roulette
- Build a JavaFX graphical UI for Blackjack using the card images in `assets/`

## License

This project is under the [MIT License](LICENSE).
