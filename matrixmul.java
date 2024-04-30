package week7;

public class matrixmul 
{
	public static void main(String[] args) 
	{
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Result of matrix multiplication:");
        printMatrix(result);
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
    {
        int n = matrix1.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < n; k++) 
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
    public static void printMatrix(int[][] matrix) 
    {
        int n = matrix.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



    