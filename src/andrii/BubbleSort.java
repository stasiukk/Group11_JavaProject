package andrii;

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] arr) {

        //adding some code


        /*
        1.Create outer loop to track the number of passes(iterations). Allow to iterate through all elements.
        2.Create inner loop to compare right element to the left element,
         and on each iteration do not check the last element under index i, as they are already sorted.
        3.Create a condition to compare if right element is greater that left
        4.If condition is true: create variable to temporary store inner loop left element for swapping
        5.Swap elements: left to right, and right to left.
         */

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

    }//end of method

    //main method
    public static void main(String[] args) {
        int[] myArray = {5, 3, 8, 4, 2};

        BubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}

