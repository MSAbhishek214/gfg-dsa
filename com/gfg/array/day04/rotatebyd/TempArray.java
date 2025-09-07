package com.gfg.array.day04.rotatebyd;

/**
 * [Better Approach] Using Temporary Array - O(n) Time and O(n) Space
 * This problem can be solved using the below idea:
 * 
 * The idea is to use a temporary array of size n, where n is the length of the
 * original array. If we left rotate the array by d positions, the last n - d
 * elements will be at the front and the first d elements will be at the end.
 * 
 * Copy the last (n - d) elements of original array into the first n - d
 * positions of temporary array.
 * Then copy the first d elements of the original array to the end of temporary
 * array.
 * Finally, copy all the elements of temporary array back into the original
 * array.
 */
public class TempArray {

    private static void rotateArr(int[] arr, int d) {
        // size of arr
        int n = arr.length;

        // handle cases where d > n
        d = d % n;

        // temp arr to store final rotated arr
        int[] temp = new int[n];

        // Loop through temp arr and place last n - d elements into it
        for (int i = 0; i < n - d; i++) {
            temp[i] = arr[d + i];
        }

        // Loop through temp arr and place first d elements into it
        for (int i = 0; i < d; i++) {
            temp[n - d + i] = arr[i];
        }

        // Loop through to copy temp to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        // Print the rotated array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
