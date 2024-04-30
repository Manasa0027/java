package week7;

import java.util.Scanner;
public class matrixsearch 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements one by one for matrix:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {

                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to search for: ");
        int key = sc.nextInt();
        boolean found = searchElement(matrix, key);
        if (found) 
        {
            System.out.println("Element " + key + " found in the matrix.");
        } 
        else 
        {
            System.out.println("Element " + key + " not found in the matrix.");
        }
        sc.close();
    }
    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static boolean searchElement(int[][] matrix, int key) {
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                if (element == key)
                {
                    return true; 
                }
            }
        }
        return false;
    }
}





    