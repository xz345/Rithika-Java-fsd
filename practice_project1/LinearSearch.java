package practice_project1;

public class LinearSearch {
    public static int ls(int[] arr, int target) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == target) {
                return x;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int index = ls(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}