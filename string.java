package week7;

public class string
{
	public class StringExample 
	{
	    public static void main(String[] args) 
	    {
	        String str = "Hello, World!";
	        int length = str.length();
	        System.out.println("Length of the string: " + length);
	        String upperCaseStr = str.toUpperCase();
	        System.out.println("Uppercase string: " + upperCaseStr);
	        String substring = str.substring(7);
	        System.out.println("Substring from index 7: " + substring);
	        String newStr = str.concat(" Goodbye!");
	        System.out.println("Concatenated string: " + newStr);
	        int index = str.indexOf('o');
	        System.out.println("Index of 'o': " + index);
	        String replacedStr = str.replace('o', 'a');
	        System.out.println("String after replacement: " + replacedStr);
	    }
	}

}
