package com.gfg.array.day03.reverse;

/**
 * [Expected Approach - 1] Using Two Pointers - O(n) Time and O(1) Space
 * The idea is to maintain two pointers: left and right, such that left points
 * at the beginning of the array and right points to the end of the array.
 * 
 * While left pointer is less than the right pointer, swap the elements at these
 * two positions. After each swap, increment the left pointer and decrement the
 * right pointer to move towards the center of array. This will swap all the
 * elements in the first half with their corresponding element in the second
 * half.
 */
public class TwoPointers {
    private static void reverseArray(int[] arr) {
        // size of arr
        int size = arr.length;
        
        // index trackers for left and right of arr
        int left = 0; int right = size - 1;

        // Loop through arr until left < right
        for (int i = 0; i < size; i++) {
            if (left < right) {
                //swap end values
                int temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                // increment left and decrement right
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}
