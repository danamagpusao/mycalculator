import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void testNfactorial1() {
		MyCalculator calc = new MyCalculator();
		float actual = calc.nfactorial(0);
		assertEquals("0! = 1", actual, actual, 0.0);
	}
	
	@Test
	public void testNfactorial2() {
		MyCalculator calc = new MyCalculator();
		float actual = calc.nfactorial(-1);
		assertEquals("(-1)! = undefined", actual, 1, 0.0);
	}

	@Test
	public void testBinarySearch1() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		float actual = calc.binarySearch(arr,0);
		assertEquals("{9,8,7,6,5,4,3,2,1,0} index of 0 = -1", actual, -1, 0.0); //return -1
	}
	
	@Test
	public void testBinarySearch2() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		float actual = calc.binarySearch(arr,0);
		assertEquals("{9,8,7,6,5,4,3,2,1,0} index of 0  = 0", actual, 0, 0.0); //return 0
	}
	
	@Test
	public void testBinarySearch3() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		float actual = calc.binarySearch(arr,10);
		assertEquals("{9,8,7,6,5,4,3,2,1,0} index of 10  = -1", actual, -1, 0.0); //return -1
	}
	@Test
	public void testBinarySearch4() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {9,4,2,3,1,6,7,3,5,8};
		float actual = calc.binarySearch(arr,2);
		assertEquals("{9,4,2,3,1,6,7,3,5,8} index of 2  = 2", actual, -1, 0.0); //return 2
	}
	
	


}
