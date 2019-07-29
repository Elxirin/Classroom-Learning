package capgemini.strings;

public class SimpleString {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2  = "JAVA";
		String s3 = new String("JAVA");
		
		//char[] value = new char[] {'J', 'A', 'V', 'A'};
		char[] value = {'J', 'A', 'V', 'A'};
		String s4 = new String(value);
		String s5 = new String(s4);
		
		if(s1 == s2) { //values are same and memory locations are also same
			System.out.println("s1==s2");
		}
		
		if(s1 != s2){ //values are same but different memory locations
			System.out.println("s1 != s3");
		}
		
		System.out.println("s1 equals s2 " + (s1.equals(s2))); //true
		System.out.println("s1 equals s3 " + (s1.equals(s2))); //true
		
		System.out.println("Length of String s2 : " + s2.length());
		System.out.println("Index of v : " + s2.indexOf('v'));
		System.out.println("s2 in uppercase : " + s2.toUpperCase());
		System.out.println("Character at position 2 is : " + s2.charAt(1));
		// Using concatenation to prevent long lines.
		String longStr= "This could have been " +
		"a very long line that would have " +
		"wrapped around. But string concatenation " +
		"prevents this.";
		System.out.println(longStr);
	}
}
