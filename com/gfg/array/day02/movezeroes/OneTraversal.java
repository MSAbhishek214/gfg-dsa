package com.gfg.array.day02.movezeroes;

/**
 * [Expected Approach] One Traversal
 * The idea is similar to the previous approach where we took a pointer, say
 * count to track where the next non-zero element should be placed. However, on
 * encountering a non-zero element, instead of directly placing the non-zero
 * element at arr[count], we will swap the non-zero element with arr[count].
 * This will ensure that if there is any zero present at arr[count], it is
 * pushed towards the end of array and is not overwritten.
 */
public class OneTraversal {

    static void pushZerosToEnd(int[] arr) {
        // Get size of arr
        int size = arr.length;

        // Get a counter to track non zero element
        int count = 0;

        /**
         * Loop through each element and check if there is a non zero element
         * If there is, swap it with the element at index count
         * if not, update loop but not count
         * This ensures count always points to index where non zero element needs to be
         * swapped with zero
         */
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
