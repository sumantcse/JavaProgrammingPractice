package ArraysPractice;

import java.util.ArrayList;

public class InsertionandDeletionSimulation {

	public static void main(String[] args) {
//		{10, 20, 30, 40, 50}
		int[] arr = new int[6];  // Size 6 for one extra space
        int n = 5; // Current number of elements

        // Step 1: Initialize array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.print("Initial Array: ");
        printArray(arr, n);

        // Step 2: Insert 25 at index 2 (shifting elements right)
        int insertIndex = 2;
        int insertValue = 25;

        for (int i = n; i > insertIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[insertIndex] = insertValue;
        n++; // Increase element count

        System.out.print("After Inserting 25 at index 2: ");
        printArray(arr, n);

        // Step 3: Delete element at index 4 (shifting left)
        int deleteIndex = 4;
        for (int i = deleteIndex; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // Decrease element count

        System.out.print("After Deleting element at index 4: ");
        printArray(arr, n);
    }

    // Utility function to print array up to n elements
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

