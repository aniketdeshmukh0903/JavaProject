package studyeasy;

public class UniqueNumber {
    public static void main(String[] args) {
        // Example input data
        int[][] testCases = {
            {5, 2, 4, 7, 2, 7}, // Test case 1
            {7, 2, 3, 1, 6, 3, 6, 2} // Test case 2
        };

        // Number of test cases
        int t = testCases.length;

        for (int i = 0; i < t; i++) {
            // First element is the size of the array
            int n = testCases[i][0];
            int uniqueNumber = 0;

            // Iterate through the rest of the elements in the array
            for (int j = 1; j <= n; j++) {
                uniqueNumber ^= testCases[i][j];
            }

            // Output the unique number for the current test case
            System.out.println(uniqueNumber);
        }
    }
}
