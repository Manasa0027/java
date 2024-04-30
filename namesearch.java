package week7;

import java.util.Scanner;
public class namesearch 
{
	public static void main(String[] args) 
	{
        java.util.ArrayList<String> namesList = new java.util.ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");
        namesList.add("Emma");
        System.out.println("Initial list of names:");
        printNames(namesList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a name to search for: ");
        String searchName = scanner.nextLine();
        boolean found = searchName(namesList, searchName);
        if (found)
        {
            System.out.println("Name " + searchName + " found in the list.");
        } 
        else 
        {
            System.out.println("Name " + searchName + " not found in the list.");
        }

        scanner.close();
    }
    public static void printNames(java.util.ArrayList<String> namesList) 
    {
        for (String name : namesList)
        {
            System.out.println(name);
        }
    }
    public static boolean searchName(java.util.ArrayList<String> namesList, String searchName) 
    {
        for (String name : namesList)
        {
            if (name.equals(searchName))
            {
                return true;
            }
        }
        return false;
    }
}

    