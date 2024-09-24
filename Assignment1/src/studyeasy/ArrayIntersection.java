package studyeasy;

import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
        // Hardcoded test cases
        int[][] testCasesArr1 = {
            {2, 6, 8, 5, 4, 3}, // First array
            {1, 2, 2, 1},       // Second array
            {10, 20, 30, 40},   // Third array
        };

        int[][] testCasesArr2 = {
            {2, 3, 4, 7},      // First test case for arr2
            {2, 3},            // Second test case for arr2
            {30, 40, 50},      // Third test case for arr2
        };

        // Process each test case
        for (int i = 0; i < testCasesArr1.length; i++) {
            System.out.println("Intersection for test case " + (i + 1) + ":");
            intersection(testCasesArr1[i], testCasesArr2[i]);
            System.out.println(); // New line for better readability
        }
    }

    public static void intersection(int[] arr1, int[] arr2) {
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        // Traverse both arrays to find the intersection
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++; // Move to the next element in arr1
            } else if (arr1[i] > arr2[j]) {
                j++; // Move to the next element in arr2
            } else {
                // If both elements are equal, print the element
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}
