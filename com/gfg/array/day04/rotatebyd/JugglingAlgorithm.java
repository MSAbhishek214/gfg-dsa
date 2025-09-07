package com.gfg.array.day04.rotatebyd;

/**
 * [Expected Approach 1] Using Juggling Algorithm - O(n) Time and O(1) Space
 * The idea is to use Juggling Algorithm which is based on rotating elements in
 * cycles. Each cycle is independent and represents a group of elements that
 * will shift among themselves during the rotation. If the starting index of a
 * cycle is i, then next elements of the cycle can be found at indices (i + d) %
 * n, (i + 2d) % n, (i + 3d) % n ... and so on till we return to the original
 * index i.
 * 
 * So for any index i, we know that after rotation, the element that will occupy
 * this position is arr[(i + d) % n]. Consequently, for every index in the
 * cycle, we will place the element that should be in that position after the
 * rotation is completed.
 */
public class JugglingAlgorithm {

    private static void rotateArr(int[] arr, int d) {
        int n = arr.length; // size of arr
        d = d % n; // handle cases where d > n, wrap around
        int g = gcd(n, d); // Find gcd of the d and n

        // Loop g times
        for (int i = 0; i < g; i++) {
            int temp = arr[i];  // copy first value to avoid overwrite
            int j = i;  // this tracks running index of cycle
            
            while (true) {
                int k = (j + d) % n;    // Next index in cycle
                if (k == i) {
                    break;  // if k equals i then index completed juggling circle
                }
                
                arr[j] = arr[k];    // swap value with next index value
                j = k;
            }
            arr[j] = temp;  // copy first value at j position to complete cycle
        }
    }

    private static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
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
