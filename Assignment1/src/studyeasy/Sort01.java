package studyeasy;

public class Sort01 {
    public static void main(String[] args) {
        // Hardcoded test cases
        int[][] testCases = {
            {0, 1, 1, 0, 1, 0, 1}, // First test case
            {1, 0, 1, 1, 0, 1, 0, 1}, // Second test case
            {0, 1, 0, 1, 0} // Third test case
        };

        // Process each test case
        for (int[] arr : testCases) {
            sortArray(arr);

            // Print the sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line for the next test case
        }
    }

    public static void sortArray(int[] arr) {
        int zeroIndex = 0; // Pointer for the position of 0s

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // Swap the current element with the element at zeroIndex
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;
                zeroIndex++; // Move the pointer for the next position of 0s
            }
        }
    }
}
