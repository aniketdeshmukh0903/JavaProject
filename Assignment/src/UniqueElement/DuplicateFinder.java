        package UniqueElement;
		public class DuplicateFinder {

		    public static int findDuplicateXOR(int[] arr) {
		        int answer = 0;

		        // all elements in the array
		        for (int num : arr) {
		            answer = num;
		        }

		        // XOR all numbers from 0 to n - 2
		        for (int i = 0; i < arr.length - 1; i++) { // n - 1 since arr.length is n
		            answer = i;
		        }

		        return answer; // The duplicate number
		    }

		    public static void main(String[] args) {
		        int[] arr = {0, 7, 2, 5, 4, 7, 1, 3, 6};
		        int duplicate = findDuplicateXOR(arr);
		        System.out.println("Duplicate number (XOR): " + duplicate);
		    }
		}
