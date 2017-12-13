package week05_cor;
import org.junit.*;
import static org.junit.Assert.*;

public class AverageTest {
	int result;
	
	@Before 
	public void setUp() throws Exception {
		result = 0;
	}
	
	@After 
	public void tearDown() throws Exception {
		// do nothing
	}
	
	@Test
	public void testTwoNumbers() {
		int[] array = new int[] {100,200};
		result = Average.calculate(array);
		assertEquals((100+200)/2, result);
	}

	@Test
	public void testThreeNumbers() {
		int[] array = new int[] {100,200,300};
		result = Average.calculate(array);
		assertEquals((100+200+300)/3, result);
	}
	
	@Test
	public void testBugOne() {
		// Find a bug in the code for calculate
		// and prove its existence by designing a test
		// that triggers it.
		
		// HINT: requirement implies array of ANY size
		
		
		int[] array = new int[] {};
		result = Average.calculate(array);
		assertEquals(0/0, result);
		
		//Cannot divide by zero
	
	}
	
	@Test
	public void testBugTwo() {
		// Find a different bug in the code for calculate
		// and prove its existence by designing a test
		// that triggers it.

		// HINT: requirement implies array with ANY integers
		
		int[] array = new int[] { 8};
		result = Average.calculate(array);
//		System.out.print(result);
		assertEquals(8/1, result);
		
		//long integer, out of range bug
		
		
	}
	
}