// Graded out of 5 points.  Total points available: 9 points

public class CodingExercise2 {
	public static void main(String[] args){
		System.out.println("Result of isDigit('0'): " + isDigit('0'));
		System.out.println("Result of computePolynomial(0.0) (should be 5.717798): " + computePolynomial(0.0));
		System.out.println("Result of afterDecimal(-1876.764): " + afterDecimal(-1876.764));
		System.out.println("Result of count(\"This is a test\", \"sapqi\"): " + count("This is a test", "sapqi"));
		System.out.println("Result of smallestDigit(876543): " + smallestDigit(876543));
	}
	/**
	 * Checks if the argument aChar is a digit (between 0 and 9) or not.
	 *
	 * Worth 1.25 points
	 *
	 * @param aChar character to check
	 * @return true if the argument is a digit, return false otherwise.
	 */
	public static boolean isDigit(char aChar) {
		// The java.lang.Character.isDigit(char ch) is a
		
		return Character.isDigit(aChar);
	}

	/**
	 * Solves the polynomial 0.5(x-1)^2 – 4(11-x) + 10 for provided value x.
	 *
	 * Worth 1.25 points
	 *
	 * @param x value to use to solve polynomial
	 * @return value of polynomial at x
	 */
	public static double computePolynomial(double x){

		// Use quadratic fomrula, return double 
		return -1;
	}

	/**
	 * Returns number after the decimal point of the argument.  For example,
	 * if num is 143.987, return 0.987.
	 *
	 * Worth 1 point
	 *
	 * @param num to find decimal value from
	 * @return after decimal part of num
	 */
	public static double afterDecimal(double num){
		// We have to just return the decimal, so we can return the decimal
		return (num - (int) num) ;
	}

	/**
	 * The second argument contains a sequence of characters.  This function
	 * counts the total number of times these characters appear in the first argument.
	 * For example, the call count(“hello”, “hl”) should return 3 since 'hello' contains
	 * 1 h and 2 ls.  The result is NOT case-sensitive. In other words, count("hello", "hl")
	 * and count("Hello", "hl") will return the same result.
	 *
	 * Worth 3 points
	 *
	 * @param str the string that we want to count characters from
	 * @param chars the string that contains the characters we want to count in str
	 * @return the number of times that the characters in chars appear in str
	 */
	public static int count(String str, String chars) {
		return -1;
	}

	/**
	 * Finds the smallest digit in num.  For example, for number 76246, the smallest digit
	 * is 2.
	 *
	 * Worth 2.5 points
	 *
	 * @param num the number to find smallest digit from.
	 * @return the smallest digit in integer num
	 */
	public static int smallestDigit(int num){
		// We can do compare, or convert it into an array and then sort it into the samllest number, so therfore we can do is int -> Array -> int
		// 
		return -1;
	}
}
