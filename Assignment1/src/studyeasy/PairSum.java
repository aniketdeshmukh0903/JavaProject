package studyeasy;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample input directly in the code
        int[][] testCases = {
            {1, 3, 6, 2, 5, 4, 3, 2, 4},
            {2, 8, 10, 5, -2, 5}
        };
        int[] sums = {7, 10};

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i];
            int X = sums[i];
            int pairCount = countPairs(arr, X);
            System.out.println(pairCount);
        }
        
        scanner.close();
    }

    public static int countPairs(int[] arr, int X) {
        int pairCount = 0;
        int N = arr.length;

        // Check each pair in the array
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == X) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }
}
