package app;

public class StringUtil {

	public static boolean isEmpty(String s) {
		if(s == null) {
			return true;
		}
		s = s.trim();
	
		return s.length() == 0;
	}
	
	public static String reverse(String s) {
		if(s == null) {
			return s;
		}
		StringBuilder rs = new StringBuilder(s);
		rs.reverse();
		return rs.toString();
	}

}
