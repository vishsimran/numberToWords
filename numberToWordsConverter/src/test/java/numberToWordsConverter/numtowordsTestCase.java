package numberToWordsConverter;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;
import java.util.Scanner;

public class numtowordsTestCase {

	@Test
	public void testnumberlessthanzero() {

		numtowords nm = new numtowords();
		assertEquals("minus five", nm.numberToWord(-5));

	}

	@Test
	public void testunitnumber() {
		numtowords n = new numtowords();
		String s = n.numberToWord(1);
		assertEquals("one", s);

	}

	@Test
	public void testtens() {
		numtowords n = new numtowords();

		String s = n.numberToWord(21);
		assertEquals("twenty-one", s);

	}

	@Test
	public void test3() {
		numtowords n = new numtowords();

		String s = n.numberToWord(105);
		assertEquals("one hundred five", s);

	}

	@Test
	public void test4() {
		numtowords n = new numtowords();
		String s = n.numberToWord(56945781);
		assertEquals("fifty-six million nine hundred forty-five thousand seven hundred eighty-one", s);

	}

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testPrintMessage() {
		numtowords n = new numtowords();

	}

}
