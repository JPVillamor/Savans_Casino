import java.util.*;
public class Blackjack {
	private static Deck deck52 = new Deck();
	private static ArrayList<String> houseHand = new ArrayList<String>(); //don't forget to clear these!!!
	private static ArrayList<String> playerHand = new ArrayList<String>();
	private static int playerChips;
	private static int playerBet;
	private static int playerHandVal;
	private static int houseHandVal;

	public static void buyChips() {
		System.out.println("How many chips would you like to start with? ");
		Scanner buyer = new Scanner(System.in);
		playerChips = buyer.nextInt();
	}

	public static void bet() {
		System.out.println("Your chips: " + playerChips);
		System.out.println("How much would you like to bet? ");
		do {
			Scanner makeBet = new Scanner(System.in);
			playerBet = makeBet.nextInt();
		} while (playerBet > playerChips);
	}

	public static void deal() {
		playerHand.add(deck52.getNextCard());
		playerHand.add(deck52.getNextCard());
		houseHand.add(deck52.getNextCard());
		houseHand.add(deck52.getNextCard());
		display();
	}

	public static void menu() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("W. STAY");
		System.out.println("A. HIT");
		System.out.println("S. SPLIT");
		System.out.println("D. DOUBLE DOWN");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.print(">");
		Scanner playerMove = new Scanner(System.in);
		char move = playerMove.nextChar(); //NOV 24 2018 21:31
	}

	public static void display() {
		//show current status of everything
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("House's Cards: ");
		if (houseHand.size() == 2) {
			System.out.println("~ " + houseHand.get(0));
			System.out.println("~ [???]");
		} else {
			for (int i = 0; i < houseHand.size(); i++) {
				System.out.println("~ " + houseHand.get(i));
			}	
		}
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Your Chips: " + playerChips);
		System.out.println("Current Bet: " + playerBet);
		System.out.println("Your Cards: ");
		for (int i = 0; i < playerHand.size(); i++) {
			System.out.println("~ " + playerHand.get(i));
		}
		System.out.println("+++++++++++++++++++++++++++");
	}

	public static void main(String[] args) {
		/*main will hold the Big Loop
		buyChips()
		make deck
		loop while playerChips > 0:
			shuffle
			reset place=0 in deck
			place bet
			deal()
			player menu() for hand, display only valid moves
				doubleDown()
				hit()
				split()
				stay()
				quit
			House()
			announce outcome()
			continue
		*/
		buyChips();
		while (playerChips > 0) {
			deck52.shuffle();
			bet();
			deal();
		}
	}
}
