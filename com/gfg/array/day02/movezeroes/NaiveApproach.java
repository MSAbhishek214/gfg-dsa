package com.gfg.array.day02.movezeroes;

/**
 * Given an array of integers arr[], move all the zeros to the end of the array
 * while maintaining the relative order of all non-zero elements.
 * 
 * Examples:
 * 
 * Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
 * Output: [1, 2, 4, 3, 5, 0, 0, 0]
 * Explanation: There are three 0s that are moved to the end.
 * 
 * Input: arr[] = [10, 20, 30]
 * Output: [10, 20, 30]
 * Explanation: No change in array as there are no 0s.
 * 
 * Input: arr[] = [0, 0]
 * Output: [0, 0]
 * Explanation: No change in array as there are all 0s.
 * [Naive Approach] Using Temporary Array - O(n) Time and O(n) Space
 * The idea is to create a temporary array of same size as the input array
 * arr[].
 * 
 * First, copy all non-zero elements from arr[] to the temporary array.
 * Then, fill all the remaining positions in temporary array with 0.
 * Finally, copy all the elements from temporary array to arr[].
 */
public class NaiveApproach {

    public static void pushZerosToEnd(int[] arr) {
        // get the size of arr
        int size = arr.length;

        // create a temp array
        int[] temp = new int[size];

        // track the index of temp array
        int j = 0;

        // Loop through each element in arr and copy any non zero element to temp
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }

        // assign value of temp back to arr and discard temp
        for (int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
