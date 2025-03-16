package aniket;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

       
        int largest = numbers[0];
        int secondLargest = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}
