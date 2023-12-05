package practice_project4;

import java.util.*;
public class MatrixMultiplication
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        // Input the dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        // Input the dimensions of the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Columns of the first matrix must be equal to the rows of the second matrix.");
            return;
        }

        // Initialize the matrices
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];

        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsA; j++) 
            {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rowsB; i++) 
        {
            for (int j = 0; j < colsB; j++) 
            {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsB; j++)
            {
                for (int k = 0; k < colsA; k++) 
                {
                    resultMatrix[i][j] = resultMatrix[i][j] +matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsB; j++) 
            {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
	}
}

