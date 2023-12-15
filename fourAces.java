import java.util.HashMap;
import java.util.Map;

public class fourAces {
    private static final int cards = 52; // cards in each deck
    private static final int deckAmount = 100000; // amount of decks
    private static final int whichAce = 4; // nth ace

    public static void main(String[] args) {
        Map<Integer, Integer> positionFrequency = new HashMap<>();

        for (int deckNumber = 0; deckNumber < deckAmount; deckNumber++) {
            int[] deck = new int[cards];
            int deckSize = cards;

            // Deck creator
            for (int i = 0; i < cards; i++) {
                deck[i] = i;
            }

            // Deck shuffler
            for (int i = 0; i < cards; i++) {
                int num = (int) (Math.random() * deckSize);
                int temp = deck[num];
                deck[num] = deck[deckSize - 1];
                deck[deckSize - 1] = temp;
                deckSize--;
            }

            // nth ace locator
            int aceCount = 0;
            for (int i = 0; i < cards; i++) {
                if (isAce(deck[i])) {
                    aceCount++;
                    if (aceCount == whichAce) {
                        positionFrequency.put(i + 1, positionFrequency.getOrDefault(i + 1, 0) + 1);
                        break;
                    }
                }
            }
        }

        int mostFrequentPosition = -1;
        int maxFrequency = -1;
        
        for (Map.Entry<Integer, Integer> entry : positionFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentPosition = entry.getKey();
            }
        }

        // Print highest frequency
        System.out.println("The most likely position of the fourth ace is: " + mostFrequentPosition);

        // Print all frequencies
        System.out.println("\nFrequency of each position");
        System.out.println("===========================");
        for (Map.Entry<Integer, Integer> entry : positionFrequency.entrySet()) {
            System.out.println("Position " + entry.getKey() + ": " + entry.getValue());
        }
    }

    private static boolean isAce(int card) {
        return card == 0 || card == 13 || card == 26 || card == 39;
    }
}
