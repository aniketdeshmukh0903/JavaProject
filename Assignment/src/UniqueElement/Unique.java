package UniqueElement;

public class Unique {

    public static int findUnique(int[] arr) {
        int answer = 0;
        for (int num : arr) {
            answer ^= num;  
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 6, 2};
        int uniqueNumber = findUnique(arr);
        System.out.println("The unique number is: " + uniqueNumber);  // Output: 1
    }
}
