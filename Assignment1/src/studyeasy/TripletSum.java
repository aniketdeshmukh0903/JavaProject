package studyeasy;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        // Hardcoded test cases
        int[][] testCases = {
            {1, 2, 3, 4, 5, 6, 7},  // First test case array
            {2, -5, 8, -6, 0, 5, 10, 11, -3} // Second test case array
        };
        int[] sums = {12, 10}; // Corresponding sums for each test case

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i];
            int X = sums[i];
            int tripletCount = countTriplets(arr, X);
            System.out.println(tripletCount);
        }
    }

    public static int countTriplets(int[] arr, int X) {
        int tripletCount = 0;
        int N = arr.length;

        // Sort the array to use the two-pointer technique
        Arrays.sort(arr);

        // Iterate through each element and use two pointers to find triplets
        for (int i = 0; i < N - 2; i++) {
            int left = i + 1; // Start pointer
            int right = N - 1; // End pointer

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == X) {
                    tripletCount++;
                    left++;
                    right--;
                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return tripletCount;
    }
}
