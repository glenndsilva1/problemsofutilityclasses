package util;

/*
 Utility classes often come with several issues. Consider the following example: if a utility method that enforces a minimum length 
 constraint is used by multiple clients, any change in the minimum length requirement—such as increasing it from 15 to 20 characters—can 
 lead to issues across all client code. This would necessitate extensive retesting of all client code. Additionally, 
 if some clients still need the original 15-character constraint, you would have to create a separate method for this requirement, 
 leading to unnecessary complexity and maintenance overhead. Furthermore, if this utility class is packaged in a JAR file, developers 
 may struggle to locate and modify it, as it might not be easily discoverable through standard search methods. Utility classes can also be
 rigid and difficult to test, posing a significant risk to the codebase. A more flexible and manageable approach is to use composable decorators instead.
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
