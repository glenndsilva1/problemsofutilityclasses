package util;

/*
   Utility Classes have lot of issues take the example of the below code multiple clients can potentially call this method say tomorrow the length of minimum characters 
   is changed to 20 then all the client code will have issues and we need to retest all the client code secondly if some of the clients still want to use say 15 we have to 
   create another method to check those characters that will be a huge burder and all the more if this code is placed in a jar file the developer will not have a clue 
   as he would not find it in normal search also utility classes are unbreakable and hard to test thats why they are a major threat to the code base and one should 
   really be careful a good alternative is to use composible decorators 
*/

public class StringUtils {
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
