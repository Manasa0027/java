package week7;

public class transpose 
{
	public static void main(String[] args) 
	{
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);
    }
    public static int[][] transposeMatrix(int[][] matrix) 
    {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++) 
            {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
    public static void printMatrix(int[][] matrix) 
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


    