public class Deck {
	String[] cards;
	private static int place = 0;

	Deck() {
		String[] SUITS = {
			"Clubs", "Diamonds", "Hearts", "Spades"
		};

		String[] RANKS = {
			"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Jack", "Queen", "King", "Ace"
		};

		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}
		
		cards = deck;
	}
	
	public void shuffle() {
		// shuffle
		for (int i = 0; i < 52; i++) {
			int r = i + (int) (Math.random() * (52-i));
			String temp = cards[r];
			cards[r] = cards[i];
			cards[i] = temp;
		}
		place = 0;
	}
	
	public void dealAll() {
		// print shuffled deck
		for (int i = 0; i < 52; i++) {
			System.out.println((i+1) + ": " + cards[i]);
		}
	}

	public String getNextCard() {
		String nextCard = cards[place];
		place++;
		return nextCard;
	}
}
