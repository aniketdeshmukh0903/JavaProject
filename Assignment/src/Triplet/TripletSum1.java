package Triplet;
import java.util.Arrays;
public class TripletSum1 {

    public static int findTriplets(int[] arr, int N, int X) {
        Arrays.sort(arr); // Step 1: Sort array
        int count = 0;

        for (int i = 0; i < N - 2; i++) {
            int left = i + 1, right = N - 1; // initialize two pointers

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == X) {
                    count++;

                    // Move left and right to find other triplets
                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (currentSum < X) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
        
    }

    public static void main(String[] args) {
        // Example input
        int[][] testCases = {
            {1, 2, 3, 4, 5, 6, 7}, // Test 1: Array
            {2, 5, 8, -6, 0, 5, 10, 11, -3} // Test 2: Array
        };

        int[] targets = {12, 10}; //target sums

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i];
            int N = arr.length; // Size of the array
            int X = targets[i]; // Target sum
            int result = findTriplets(arr, N, X); // Find triplets
            System.out.println(result); // Output the result
        }
    }
}

