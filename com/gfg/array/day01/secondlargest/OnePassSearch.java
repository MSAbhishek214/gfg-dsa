package com.gfg.array.day01.secondlargest;
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
 * One Pass Search: The idea is to keep track of the largest and second largest
 * element while
 * traversing the array. Initialize largest and secondLargest with -1. Now, for
 * any index i,
 * 
 * If arr[i] > largest, update secondLargest with largest and largest with
 * arr[i].
 * Else If arr[i] < largest and arr[i] > secondLargest, update secondLargest
 * with arr[i].
 */
public class OnePassSearch {

    public static int getSecondLargest(int[] arr) {
        // Initialize largest and secondLargest
        int largest = -1;
        int secondLargest = -1;

        // loop through each element to assign largest and second largest in one pass
        for (int i = 0; i < arr.length; i++) {
            // First check if element is greater than largest, if yes, first assign
            // secondLargest to largest and element to largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }
}
