package week7;

import java.util.Scanner;
public class descendord 
{
	 public static void main(String[] args) 
	 {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String inputString = sc.nextLine();
	        char[] charArray = inputString.toCharArray();
	        sortDescending(charArray);
	        System.out.println("Characters in descending order:");
	        for (char c : charArray) 
	        {
	            System.out.print(c + " ");
	        }

	        sc.close();
	    }
	    public static void sortDescending(char[] charArray) 
	    {
	        for (int i = 0; i < charArray.length - 1; i++) 
	        {
	            for (int j = i + 1; j < charArray.length; j++) 
	            {
	                if (charArray[i] < charArray[j]) 
	                {
	                    char temp = charArray[i];
	                    charArray[i] = charArray[j];
	                    charArray[j] = temp;
	                }
	            }
	        }
	    }
	
}



   