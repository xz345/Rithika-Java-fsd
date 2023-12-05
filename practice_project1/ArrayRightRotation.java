package practice_project1;

public class ArrayRightRotation {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int steps = 5;

		// Display the original array
		System.out.println("Original Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		// Right rotate the array by 'steps'
		rightRotateArray(arr, steps);

		// Display the rotated array
		System.out.println("\nRotated Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void rightRotateArray(int[] arr, int steps) {
		int length = arr.length;
		//steps = steps % length; // Handle cases where steps are greater than the array length
		int[] temp = new int[steps];

		// Copy the last 'steps' elements to a temporary array
		for (int i = 0; i < steps; i++) {
			temp[i] = arr[length - steps + i]; 
		}

		// Shift the remaining elements to the right
		for (int i = length - 1; i >= steps; i--) {
			arr[i] = arr[i - steps];
		}

		// Copy the temporary array back to the original array
		for (int i = 0; i < steps; i++) {
			arr[i] = temp[i];
		}
	}
}


