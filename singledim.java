package week7;

import java.util.Scanner;
public class singledim 
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
        int sum=findSum(arr);
        System.out.println("sum of array element "+sum);
	}
	public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
	}
}
        





    