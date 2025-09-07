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
 * Two Pass Search: The approach is to traverse the array twice. In the first
 * traversal, find the maximum element. In the second traversal, find the
 * maximum element ignoring the one we found in the first traversal.
 */

public class TwoPassSearch {

    public static int getSecondLargest(int[] arr) {
        // declare and assign largest and secondLargest values
        int largest = -1;
        int secondLargest = -1;

        // Loop through each element and find largest value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Loop through arr again to find secondLargest value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
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
