package com.gfg.array.day04.rotatebyd;

/**
 * Rotate an Array by d - Counterclockwise or Left
 * 
 * comments
 * Given an array of integers arr[] of size n, the task is to rotate the array
 * elements to the left by d positions.
 * 
 * Examples:
 * 
 * Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
 * Output: {3, 4, 5, 6, 1, 2}
 * Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and
 * after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}
 * 
 * Input: arr[] = {1, 2, 3}, d = 4
 * Output: {2, 3, 1}
 * Explanation: The array is rotated as follows:
 * 
 * After first left rotation, arr[] = {2, 3, 1}
 * After second left rotation, arr[] = {3, 1, 2}
 * After third left rotation, arr[] = {1, 2, 3}
 * After fourth left rotation, arr[] = {2, 3, 1}
 * [Naive Approach] Rotate one by one - O(n * d) Time and O(1) Space
 * In each iteration, shift the elements by one position to the left in a
 * circular fashion (the first element becomes the last). Perform this operation
 * d times to rotate the elements to the left by d positions.
 */
public class NaiveApproach {

    private static void rotateArr(int[] arr, int d) {
        // size of arr
        int size = arr.length;

        // Loop through arr d times
        for (int i = 0; i < d; i++) {
            // Copy first value of rotated array
            int first = arr[0];
            // Loop through arr until size - 1 and shift elements to left
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            // After shifting all elements, copy first value to last index
            arr[size - 1] = first;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
