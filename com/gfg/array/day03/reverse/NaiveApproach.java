package com.gfg.array.day03.reverse;

/**
 * Reverse an array arr[]. Reversing an array means rearranging the elements
 * such that the first element becomes the last, the second element becomes
 * second last and so on.
 * Examples:
 * 
 * Input: arr[] = [1, 4, 3, 2, 6, 5]
 * Output: [5, 6, 2, 3, 4, 1]
 * Explanation: The first element 1 moves to last position, the second element 4
 * moves to second-last and so on.
 * 
 * Input: arr[] = [4, 5, 1, 2]
 * Output: [2, 1, 5, 4]
 * Explanation: The first element 4 moves to last position, the second element 5
 * moves to second last and so on.
 * 
 * [Naive Approach] Using a temporary array - O(n) Time and O(n) Space
 * The idea is to use a temporary array to store the reverse of the array.
 * 
 * Create a temporary array of same size as the original array.
 * Now, copy all elements from original array to the temporary array in reverse
 * order.
 * Finally, copy all the elements from temporary array back to the original
 * array.
 */
public class NaiveApproach {

    static void reverseArray(int[] arr) {
        // size of arr
        int size = arr.length;

        // temp array to hold the reversed arr
        int[] temp = new int[size];

        // loop through all elements in reverse order and copy them to temp
        for (int i = size - 1; i >= 0; i--) {
            temp[size - i - 1] = arr[i];
        }

        // copy temp back to arr
        for (int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
