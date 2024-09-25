package UniqueElement;

public class PairSum {

    public static int findPairs(int[] arr, int N, int num) {
        int count = 0;

        // Using a nested loop to find pairs
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == num) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Hardcoded input for multiple test cases
        int[][] testCases = {
            {1, 3, 6, 2, 5, 4, 3, 2, 4}, // Test case 1: Array
            {2, 8, 10, 5, -2, 5} // Test case 2: Array
        };

        int[] targets = {7, 10}; // Corresponding target sums

        // Processing each test case
        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i];
            int N = arr.length; // Size of the array
            int num = targets[i]; // Target sum
            int result = findPairs(arr, N, num); // Find pairs
            System.out.println("Test case " + (i + 1) + ": " + result + " pair(s) found.");
        }
    }
}
