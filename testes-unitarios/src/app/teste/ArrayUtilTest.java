package app.teste;

import org.junit.Assert;


import app.ArrayUtil;

public class ArrayUtilTest {
	@org.junit.Test
	public void testReverse() {
		Integer[] numbers = {1,2,3,4,5};
		ArrayUtil.reverse(numbers);
		
		Integer[] expected = {5,4,3,2,1};
		
		Assert.assertArrayEquals(expected, numbers);
	}

}
