package week7;

import java.util.Scanner;

public class ascenord
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] arr = new int[N]; 

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Elements of the array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array elements after sorting in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}