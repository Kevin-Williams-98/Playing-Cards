package proj2;
import cardgames.*;
/** Title : Project dos - Working with the card class.
 * Description : This project is able to output 3 random cards drawn from a deck name the card the suit if there are any pairs the highest value and the sum of the card 
 * values.
 * Based on the sum it also determines if the player wins or not. If their sum is greater than or equal to 25 they win. The program is also able to display cards based on 
 * input. The code of lines to display random cards from the deck has been commented out so that the input portion could be tested.
 * the 
 * @author Kevin Williams
 *
 */
public class Project2 {
	public static void main(String[] args)
	{
		GUI theWindow = new GUI();
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		//Card card1 = theDeck.dealCard();
		Card card1 = new Card(23);
		System.out.println("Card 1 is: " + card1.toString());
		//Card card2 = theDeck.dealCard();
		Card card2 = new Card(0);
		System.out.println("Card 2 is: " + card2.toString());

		// Dealing another card
		//Card card3 = theDeck.dealCard();
		Card card3 = new Card(37);
		// displaying card information on screen
		System.out.println("Card 3 is: " + card3.toString());

		theWindow.showCard(card1);
		theWindow.showCard(card2);

		// adding card to window
		theWindow.showCard(card3);

		// Complex condition to test all senarios 
		if ((card1.getValue() == card2.getValue())||((card1.getValue()==card3.getValue())||((card2.getValue()) == (card3.getValue())))) 

			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		// If statement to determine and display highest value
		if ((card1.getValue()) >= (card2.getValue()) && ((card1.getValue() >= (card3.getValue()))))

			System.out.println("The highest value is " + card1.getValue());
		else 
			if ((card2.getValue()) >= (card1.getValue()) && ((card2.getValue() >= (card3.getValue()))))

				System.out.println("The highest value is " + card2.getValue());
			else
				System.out.println("The highest value is " + card3.getValue());

		System.out.println("The sum is " + (card1.getPointValue()+card2.getPointValue()+card3.getPointValue()));

		if (((card1.getPointValue()+ card2.getPointValue()+card3.getPointValue()))>= 25)

			System.out.println("Player wins");
		else 
			System.out.println("Computer wins");
	}
}
