package LoopJava;

public class FindLowestArray {

	public static void main(String[] args) {
int a[] = {25, 12, 50, 8, 33};
        
        int min = a[0]; 
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i]; 
            }
        }
        
        System.out.println("The lowest number is: " + min);
	}

}
