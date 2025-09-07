package com.gfg.array.day03.reverse;

/**
 * [Expected Approach - 2] By Swapping Elements - O(n) Time and O(1) Space
 * The idea is to iterate over the first half of the array and swap each element
 * with its corresponding element from the end. So, while iterating over the
 * first half, any element at index i is swapped with the element at index (n -
 * i - 1).
 */
public class HalfSwap {
    private static void reverseArray(int[] arr) {
        // size of arr
        int size = arr.length;

        // loop through each element and swap it with its end partner and stop at half length of array
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5, 7 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}
