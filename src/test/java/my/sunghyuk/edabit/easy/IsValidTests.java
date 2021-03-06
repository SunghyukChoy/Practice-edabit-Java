package my.sunghyuk.edabit.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsValidTests {
	@Test 
	public void test1() {
		assertEquals(true, Challenge.isValid("59001"));
	}
	
	@Test 
	public void test2() {
		System.out.println("No non-digits allowed.");
		assertEquals(false, Challenge.isValid("853a7"));
	}
	
	@Test 
	public void test3() {
		System.out.println("No spaces allowed.");
		assertEquals(false, Challenge.isValid("732 32"));
	}
	
	@Test 
	public void test4() {
		System.out.println("No sequences of length greater than 5.");
		assertEquals(false, Challenge.isValid("788876"));
	}
	
	@Test 
	public void test5() {
		System.out.println("No letters allowed.");
		assertEquals(false, Challenge.isValid("a923b"));
	}
	
	@Test 
	public void test6() {
		System.out.println("No non-digits allowed.");
		assertEquals(false, Challenge.isValid("5923!"));
	}
	
	@Test 
	public void test7() {
		System.out.println("No letters and no sequences of length greater than 5.");
		assertEquals(false, Challenge.isValid("59238aa"));
	}
	
	@Test 
	public void test8() {
		assertEquals(true, Challenge.isValid("88231"));
	}

	@Test 
	public void test9() {
		assertEquals(true, Challenge.isValid("06609"));
	}

	@Test 
	public void test10() {
		assertEquals(false, Challenge.isValid("-6609"));
	}

	@Test 
	public void test11() {
		assertEquals(false, Challenge.isValid("0x123"));
	}
}