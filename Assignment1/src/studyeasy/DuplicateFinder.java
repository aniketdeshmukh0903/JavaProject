package studyeasy;

public class DuplicateFinder {
    public static void main(String[] args) {
        // Example input data
        int[][] testCases = {
            {9, 0, 7, 2, 5, 4, 7, 1, 3, 6}, // Test case 1
            {5, 0, 2, 1, 3, 1}, // Test case 2
            {7, 0, 3, 1, 5, 4, 3, 2} // Test case 3
        };

        // Number of test cases
        int t = testCases.length;

        for (int i = 0; i < t; i++) {
            // First element is the size of the array
            int n = testCases[i][0];
            int[] arr = new int[n];

            // Fill the array
            for (int j = 0; j < n; j++) {
                arr[j] = testCases[i][j + 1];
            }

            // Find and print the duplicate
            System.out.println(findDuplicate(arr));
        }
    }

    // Function to find duplicate in the array
    private static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Calculate the index based on the value
            int index = Math.abs(arr[i]);

            // If the value at that index is negative, it means we've seen it before
            if (arr[index] < 0) {
                return index; // Return the duplicate number
            } else {
                // Mark the value at that index as negative
                arr[index] = -arr[index];
            }
        }

        return -1; // This line is never reached since a duplicate is always present
    }
}
