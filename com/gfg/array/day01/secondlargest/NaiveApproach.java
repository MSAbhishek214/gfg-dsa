package com.gfg.array.day01.secondlargest;


import java.util.Arrays;

/**
 * Given an array of positive integers arr[] of size n, the task is to find
 * second largest distinct element in the array.
 * 
 * Note: If the second largest element does not exist, return -1.
 * 
 * Examples:
 * 
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest
 * element is 34.
 * 
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest
 * element is 5.
 * 
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 there is no second
 * largest element.
 * 
 * Naive Approach: The idea is to sort the array in non-decreasing order. Now,
 * we know that the largest element will be at index n - 1. So, starting from
 * index (n - 2), traverse the remaining array in reverse order. As soon as we
 * encounter an element which is not equal to the largest element, return it as
 * the second largest element in the array. If all the elements are equal to the
 * largest element, return -1.
 */
class NaiveApproach {

    public static int getSecondLargest(int[] arr) {
        // get the size of array arr
        int size = arr.length;

        // Sort arr
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /**
         * Loop from size-2 index until index 0.
         * if you find any element not equal to last index, u got second largest element
         */
        for (int i = size - 2; i >= 0; i--) {
            // Check if element is not equal to last element
            if (arr[i] != arr[size - 1]) {
                return arr[i]; // return second largest
            }
        }

        return -1; // This will basically run if all elements were equal
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }
}
