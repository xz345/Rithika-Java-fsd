package practice_project3;

import java.util.*;
public class SumInRange 
{
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of elements
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Please enter a valid number of elements (n > 0)");
	            return;
	        }

	        int[] arr = new int[n];

	        // Input the elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Input the range L and R
	        System.out.print("Enter the range (L and R) where 0 <= L <= R <= n-1: ");
	        int L = scanner.nextInt();
	        int R = scanner.nextInt();

	        if (L < 0 || R < L || R >= n) {
	            System.out.println("Invalid range. Please ensure 0 <= L <= R <= n-1.");
	            return;
	        }

	        // Calculate the sum of elements in the specified range
	        int sum = 0;
	        for (int i = L; i <= R; i++) {
	            sum += arr[i];
	        }
	        	
	        System.out.println("The sum of elements in the range [" + L + ", " + R + "] is: " + sum);

	       
	    }
}
