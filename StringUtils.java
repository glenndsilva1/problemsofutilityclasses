package util;

public class StringUtils {
	public static int lengthof(String a) throws Exception {
		int strlength = 0;
		if (a != null) {
			strlength = a.length();
		}
		if (strlength == 0) {
			throw new Exception("Str length not equal to zero");
		}
		return strlength;
	}

	public static boolean checkregid(String a) {
		int strlength = 0;
		boolean islength = false;

		if(a != null) {
		  strlength = a.length();
		}

		if(strlength >= 15){
		  islength = true;
		}
		return islength;
	}

	public static void main(String args[]) {
		boolean valid = StringUtils.checkregid("Glenn");
		System.out.println(valid);
	}
}
