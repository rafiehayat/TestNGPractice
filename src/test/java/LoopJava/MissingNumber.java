package LoopJava;

public class MissingNumber {
    public static void main(String[] args) {
        // Array is missing '4' (Range 1 to 5)
        int a[] = {1, 2, 4, 5}; 
        int n = 5; // The total count of numbers there should be
        
        // 1. Calculate Expected Sum
        int expectedSum = (n * (n + 1)) / 2;
        
        // 2. Calculate Actual Sum
        int actualSum = 0;
        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }
        
        // 3. Find the difference
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
