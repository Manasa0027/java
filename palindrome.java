package week7;

import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        char[] charArray = inputString.toCharArray();
        boolean isPalindrome = checkPalindrome(charArray);
        if (isPalindrome) 
        {
            System.out.println("The entered string is a palindrome.");
        } 
        else 
        {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }
    public static boolean checkPalindrome(char[] charArray) 
    {
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) 
        {
            if (charArray[left] != charArray[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


	    