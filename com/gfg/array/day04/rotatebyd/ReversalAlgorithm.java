package com.gfg.array.day04.rotatebyd;

/**
 * [Expected Approach 2] Using Reversal Algorithm - O(n) Time and O(1) Space
 * The idea is based on the observation that if we left rotate the array by d
 * positions, the last (n - d) elements will be at the front and the first d
 * elements will be at the end.
 * 
 * Reverse the subarray containing the first d elements of the array.
 * Reverse the subarray containing the last (n - d) elements of the array.
 * Finally, reverse all the elements of the array.
 */
public class ReversalAlgorithm {

    /**
     * Rotate arr by d positions
     * @param arr
     * @param d
     * @return void
     */
    private static void rotateArr(int[] arr, int d) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length; // size of arr
        d = ((d % n) + n) % n; // handle cases where d > n and d < 0
        reverse(arr, 0, d - 1); // reverse first d elements
        reverse(arr, d, n - 1); // reverse last n - d elements
        reverse(arr, 0, n - 1); // reverse all elements
    }

    /**
     * Reverse elements in arr from index i to j
     * @param arr
     * @param start
     * @param end
     * @return void
     */
    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
