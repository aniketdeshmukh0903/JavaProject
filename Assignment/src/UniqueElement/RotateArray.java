package UniqueElement;
import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        // Sample input data
        int t = 2; // Number of test cases
        int[][] testCases = {
            {7, 1, 2, 3, 4, 5, 6, 7, 2}, // Test case 1: N=7, array, D=2
            {4, 1, 2, 3, 4, 2} // Test case 2: N=4, array, D=2
        };

        // List to hold results for each test case
        List<String> results = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int N = testCases[i][0]; // Size of the array
            int[] arr = new int[N];

            // Fill the array from the test case data
            for (int j = 0; j < N; j++) {
                arr[j] = testCases[i][j + 1]; // Read elements from the array
            }

            int D = testCases[i][N + 1]; // Number of elements to rotate
            if (N == 0) {
                results.add(""); // Handle empty array case
                continue;
            }

            D = D % N; // Effective rotation
            if (D == 0) {
                results.add(Arrays.toString(arr).replaceAll("[\\[\\],]", "")); // No rotation needed
                continue;
            }

            // Rotate the array
            int[] rotated = new int[N];
            System.arraycopy(arr, D, rotated, 0, N - D); // Copy from D to end
            System.arraycopy(arr, 0, rotated, N - D, D); // Copy from start to D

            // Prepare the result for this test case
            StringBuilder result = new StringBuilder();
            for (int num : rotated) {
                result.append(num).append(" ");
            }
            results.add(result.toString().trim());
        }

        // Print all results for each test case
        for (String res : results) {
            System.out.println(res);
        }
    }
}
