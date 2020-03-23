package Epam_TDD_and_JunitTask.check_A_InString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class deleteAFromFirst2PositionsTest {

	@Test
	void testCase1() {
		deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
		String actual= deleteAFromFront.delete("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void testCase2() {
		deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
		String actual= deleteAFromFront.delete("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void testCase3() {
		deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
		String actual= deleteAFromFront.delete("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void testCase4() {
		deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
		String actual= deleteAFromFront.delete("AABAA");
		assertEquals("BAA",actual);
	}
	@Test
	void testCase5() {
			deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
			String actual= deleteAFromFront.delete("BACD");
			assertEquals("BCD",actual);	
	}
	@Test
	void testCase6() {
			deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
			String actual= deleteAFromFront.delete("DADA");
			assertEquals("DDA",actual);	
	}
	@Test
	void testCase7() {
			deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
			String actual= deleteAFromFront.delete("ADAA");
			assertEquals("DAA",actual);	
	}
	@Test
	void testCase8() {
			deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
			String actual= deleteAFromFront.delete("DBCA");
			assertEquals("DBCA",actual);	
	}
	@Test
	void testCase9() {
			deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
			String actual= deleteAFromFront.delete("AAAAA");
			assertEquals("AAA",actual);	
	}
	@Test
	void testCase10() {
			deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
			String actual= deleteAFromFront.delete("AA");
			assertEquals("",actual);	
	}
	@Test
	void testCase11() {
			deleteAFromFirst2Positions deleteAFromFront = new deleteAFromFirst2Positions();
			String actual= deleteAFromFront.delete("A");
			assertEquals("",actual);	
	}

}
