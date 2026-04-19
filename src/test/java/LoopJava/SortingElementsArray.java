package LoopJava;

import java.util.Arrays;

public class SortingElementsArray {

	public static void main(String[] args) {
int a[] = {500, 200, 100, 400, 300};
        
        // Outer loop: controls how many times we pass through the array
        for (int i = 0; i < a.length - 1; i++) {
            // Inner loop: performs the actual comparisons and swaps
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap elements using a temporary variable
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted Array: " + Arrays.toString(a));
	}

}
