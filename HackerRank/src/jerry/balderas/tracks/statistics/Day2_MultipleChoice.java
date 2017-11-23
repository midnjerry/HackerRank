package jerry.balderas.tracks.statistics;

public class Day2_MultipleChoice {

	/*
	 * Question 1: Basic Probability
	 * 
	 * Task 
     * In a single toss of 2 fair (evenly-weighted) six-sided dice, find the 
     * probability that their sum will be at most 9.
     * 
     * Probabilty of die landing on a number = 1/6
     * Probablity of 2 dies landing on specific numbers = 1/6 * 1/6
     * There are some cases where one die can make another die roll moot.  For example, if
     * Die A rolls a 1, then it doesn't matter what number Die B lands on.  1 + 6 (max value) <= 9.
     * 
     * We need to find the probabilities of all valid combinations then add together.  
     * 
     * Die A     Die B
     * 1  1/6 *  6/6  (1 + any roll <= 9)
     * 2  1/6 *  6/6  (2 + any roll <= 9)
     * 3  1/6 *  6/6  (3 + any roll <= 9)
     * 4  1/6 *  5/6  (4 + 1,2,3,4,5 <= 9)
     * 5  1/6 *  4/6  (5 + 1,2,3,4   <= 9)
     * 6  1/6 *  3/6  (6 + 1,2,3     <= 9)
     * -------------------------------------  
     * Sum:   1/2 + 5/36 + 4/36 + 3/36 = 1/2 + 12/36 = 1/2 + 1/3 = 5/6           
	 */
	
	/*
	 * Question 2: More Dice
	 * 
	 * Task 
     * In a single toss of 2 fair (evenly-weighted) six-sided dice, find the probability that 
     * the values rolled by each die will be different and the two dice have a sum of 6.
     * 
     * Same concept as problem 1.  Find probablity of all combinations that equal 6 but not equal.
     * 
     * Die A     Die B
     * 1         5      (1 + 5 = 6)             1/6  *  1/6  
     * 2         4      (2 + 4 = 6)             1/6  *  1/6
     * 3         3  (3 equals 3 so don't use) 
     * 4         2       (1 + 5 = 6)            1/6  *  1/6
     * 5         1       (1 + 5 = 6)            1/6  *  1/6
     * 6         -  (impossible for sum to be 6) 
     * ----------------------------------------------------------------  
     *                                          Sum:    4/36 =  1/9 
	 */
	
	/*
	 * Question 3: Compound Event Probability
	 * 
	 * Task 
     * There are 3 urns labeled X, Y, and Z. 
     *
	 * Urn X contains 4 red balls and 3 black balls.
	 * Urn Y contains 5 red balls and 4 black balls.
     * Urn Z contains 4 red balls and 4 black balls. 
     * 
     * One ball is drawn from each of the 3 urns. What is the probability that, 
     * of the 3 balls drawn, 2 are red and 1 is black?
     * 
     * Same concept as problem 1 and 2.  Find probablity of all combinations that
     * meet objective then add.
     * 
     * Urn X     Urn Y     Urn Z   Urn X     Urn Y     Urn Z
     * RED       RED       BLACK   4/7    *  5/9    *  4/8  =   80/504
     * RED       BLACK     RED     4/7    *  4/9    *  4/8  =   64/504
     * BLACK     RED       RED     3/7    *  5/9    *  4/8  =   60/504
     * ----------------------------------------------------------------  
     *                                                    Sum: 204/504 = 17/42
	 */
	
}
