package jerry.balderas.tracks.statistics;

public class Day3_MultipleChoice {
}

/*
 * Question 1: Conditional Probability
 * 
 * Task 
 * Suppose a family has 2 children, one of which is a boy. What is the probability that both children are boys?
 * 
 * This question is confusing.  It's based on semantics.  If the question was: Suppose a family has 2 children,
 * the FIRST being a boy, what is the probability that the second child is a boy?  This is intuitively 1/2 since
 * a child can only be a boy or a girl.
 * 
 * The task doesn't state it like this, though.  It states that ONE of the children will be a boy, which is either
 * the first or the second.  So let's look at the probabilities for each event that takes place.  
 * 
 * Child 1   Child 2
 * Girl      Girl       (1/2 * 1/2)   = 1/4
 * Boy       Girl       (1/2 * 1/2)   = 1/4           
 * Boy       Boy        (1/2 * 1/2)   = 1/4
 * Girl      Boy        (1/2 * 1/2)   = 1/4
 * --------------------------------------------
 * There are 3 scenarios where one child is a boy all with equal probability.
 * There is only one scenario where both children are boys.
 * The probability is therefore 1/3.
 * 
 */

/*
 * 
 * Question 2: Cards of the Same Suit
 *
 * Task  
 * You draw 2 cards from a standard 52-card deck without replacing them. What is the probability that 
 * both cards are of the same suit?
 *
 * The probability of drawing a card of a particular suit is 13 / 52. (There are 13 cards of each suit in a 52 card deck, 
 * 13 * 4 = 52)
 *
 * Since there are only 52 cards in the deck and each card has one of 4 suits, then we don't care what the first
 * card is.  We only care that the second card matches the suit of the first one.
 *   
 * One card was removed from the deck leaving 51.  Since a card was drawn from a particular suit, there are only
 * 12 left of those in the deck.
 * 
 * Drawing a second card that matches the suit of the first therefore has a probability of 12/51.  
 * 
 */
	
/*
 * Question 3: Drawing Marbles
 * 
 * Task 
 * A bag contains 3 red marbles and 4 blue marbles. Then, 2 marbles are drawn from the bag, at random, 
 * without replacement. If the first marble drawn is red, what is the probability that the second marble is blue? 
 *
 * If the first marble drawn is red, then there are 2 red marbles and 4 blue marbles remaining in the bag.
 * 
 * The probability of the second marble being blue is therefore 4 / (2 + 4) = 2/3
 *  
 */

