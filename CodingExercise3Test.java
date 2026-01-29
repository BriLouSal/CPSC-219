import static org.junit.Assert.*;

import org.junit.Test;

public class CodingExercise3Test {

	@Test
	public void test_isAlphabetic_lowerCase() {
		boolean expected = true;

		boolean actual = CodingExercise3.isAlphabetic('a');
		assertEquals("Checking if a is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('b');
		assertEquals("Checking if b is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('f');
		assertEquals("Checking if f is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('h');
		assertEquals("Checking if h is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('i');
		assertEquals("Checking if i is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('n');
		assertEquals("Checking if n is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('q');
		assertEquals("Checking if q is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('r');
		assertEquals("Checking if r is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('s');
		assertEquals("Checking if s is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('u');
		assertEquals("Checking if u is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('w');
		assertEquals("Checking if w is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('y');
		assertEquals("Checking if y is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('z');
		assertEquals("Checking if z is a alphabetic", expected, actual);
	}

	@Test
	public void test_isAlphabetic_upperCase() {
		boolean expected = true;

		boolean actual = CodingExercise3.isAlphabetic('A');
		assertEquals("Checking if A is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('C');
		assertEquals("Checking if C is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('D');
		assertEquals("Checking if D is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('H');
		assertEquals("Checking if H is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('J');
		assertEquals("Checking if J is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('L');
		assertEquals("Checking if L is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('P');
		assertEquals("Checking if P is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('q');
		assertEquals("Checking if Q is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('S');
		assertEquals("Checking if S is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('X');
		assertEquals("Checking if X is a alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('Z');
		assertEquals("Checking if Z is a alphabetic", expected, actual);
	}

	@Test
	public void test_isAlphabetic_digits() {
		boolean expected = false;

		boolean actual = CodingExercise3.isAlphabetic('1');
		assertEquals("Checking if 1 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('2');
		assertEquals("Checking if 2 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('3');
		assertEquals("Checking if 3 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('4');
		assertEquals("Checking if 4 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('5');
		assertEquals("Checking if 5 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('6');
		assertEquals("Checking if 6 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('7');
		assertEquals("Checking if 7 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('8');
		assertEquals("Checking if 8 is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('9');
		assertEquals("Checking if 9 is alphabetic", expected, actual);
	}

	@Test
	public void test_isAlphabetic_symbols() {
		boolean expected = false;

		boolean actual = CodingExercise3.isAlphabetic('@');
		assertEquals("Checking if @ is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('{');
		assertEquals("Checking if { is alphabetic", expected, actual);
		actual = CodingExercise3.isAlphabetic('$');
		assertEquals("Checking if $ is alphabetic", expected, actual);
	}

	@Test
	public void test_reverse_12345() {
		long expected = 54321;
		long actual = CodingExercise3.reverse(12345);
		
		assertEquals("testing 12345", expected, actual);
	}
	
	@Test
	public void test_reverse_0() {
		long expected = 0;
		long actual = CodingExercise3.reverse(0);
		
		assertEquals("testing 0", expected, actual);
	}

	@Test
	public void test_reverse_876543() {
		long expected = 345678;
		long actual = CodingExercise3.reverse(876543);
		
		assertEquals("testing 876543", expected, actual);
	}
	
	@Test
	public void test_reverse_veryLongNumber() {
		long expected = Long.MAX_VALUE;
		//long expected = 9223372036854775807L;
		long actual = CodingExercise3.reverse(7085774586302733229L);
		
		assertEquals("testing maximum long value", expected, actual);
	}

	@Test
	public void test_reverse_ShortNumber() {
		long expected = 41;
		long actual = CodingExercise3.reverse(14);
		
		assertEquals("testing 41", expected, actual);
	}

	@Test
	public void test_mostFrequentChar_upperAndLowerCase() {
		char expected = 's';
		char actual = CodingExercise3.mostFrequentChar("This is first test");

		assertEquals("In 'This is first test' lower case 's' appears most frequent.", expected, actual);
	}

	@Test
	public void test_mostFrequentChar_emptyString() {
		char expected = ' ';
		char actual = CodingExercise3.mostFrequentChar("");

		assertEquals("Expected space as most frequent char for empty string.", expected, actual);
	}

	@Test
	public void test_mostFrequentChar_stringWithNumbers() {
		char expected = '1';
		char actual = CodingExercise3.mostFrequentChar("123456789012345678901");

		assertEquals("Testing 123456789012345678901.", expected, actual);
	}

	@Test
	public void test_mostFrequentChar_allCharactersAppearOnce() {
		char expected = 'a';
		char actual = CodingExercise3.mostFrequentChar("aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ");

		assertEquals("All characters appear same amount of times, expecting first encountered", expected, actual);
	}

}
