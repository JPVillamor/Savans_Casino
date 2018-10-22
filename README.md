# Savans_Casino

End: 
	One of the players takes all the money
Means: 
	the pot gets filled with bet money, then is EMPTIED when someone wins a hand.
	Betting mechanism adds money to pot
	Poker hands feature decides who wins the pot
	The flop, turn, and river are dealt. (We need a dealer, obv)
		remember to burn a card before each.
Beginning:
	Players start with equal chips
	Players are dealt their hand. 2 cards from the deck
	the deck is just 52 numbers
		1-13 	Clubs
		14-26	Diamonds
		27-39	Hearts
		40-52	Spades
		lowest is 2, highest is ace
	the deck has to be shuffled!
	
Classes:
	Player
		money
		buyIn()
		check()
		call()
		raise()
		fold()
	Opponent
		money
		buyIn()
		check()
		call()
		raise()
		fold()
	Dealer
		shuffle()
		deal()
	Game
		wakeUpTheDealer()
		turn
		pot
	Deck
		[however we choose to organize the cards]
