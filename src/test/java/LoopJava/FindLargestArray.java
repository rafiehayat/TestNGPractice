package LoopJava;

public class FindLargestArray {

	public static void main(String[] args) {
int a[] = {10, 50, 30, 90, 40};
        
        int max = a[0]; 
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        System.out.println("The largest number is: " + max);
	}

}
