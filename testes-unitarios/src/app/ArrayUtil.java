package app;

public class ArrayUtil {
	public static void reverse(Object[] array) {
		Object[] obj = new Object[array.length];	
		int j,i;
		for(i = array.length - 1, j = 0; i >= 0; i--, j++ ) {
			obj[j] = array[i]; 
		}
		
		for(i = 0; i < array.length; i++) {
			array[i] = obj[i];
		}
	}
	

}
