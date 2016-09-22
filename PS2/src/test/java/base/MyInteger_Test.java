package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		MyInteger n = new MyInteger(3);
		
		assertFalse(n.isEven());
		
		assertTrue(n.isOdd());
		
		MyInteger a= new MyInteger(17);
		assertTrue(a.isPrime());
		
		assertFalse(MyInteger.isEven(3));
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isOdd(6));
		assertTrue(MyInteger.isOdd(5));
		assertFalse(MyInteger.isPrime(2));
		assertTrue(MyInteger.isPrime(7));
		
		
		
		
	}

}
