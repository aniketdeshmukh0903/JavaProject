package aniket;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 2};

       
        int smallest = numbers[0];
        int secondsmallest = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondsmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondsmallest && numbers[i] != smallest) {
                secondsmallest = numbers[i];
            }
        }

        System.out.println("The second largest number is: " + secondsmallest);
    }
}
