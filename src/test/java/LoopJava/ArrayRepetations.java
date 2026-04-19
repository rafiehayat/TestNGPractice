package LoopJava;

public class ArrayRepetations {

	public static void main(String[] args) {
		int a [] = {100,200,300,400,200,500,200,600,200};
		int searchelement = 200;
		int count = 0;
		
//		for(int i = 0; i<=a.length-1;i++)
//		{
//			if(a[i]==searchelement)
//			{
//				count++;
//			}
//		}
//		System.out.println("The Element "  + searchelement + " is repeated " + count + " times");
		
		
		for(int value:a )
		{
			if(value==searchelement)
			{
				count++;
			}
		}
		System.out.println("The Element "  + searchelement + " is repeated " + count + " times");
		
		
		

	}

}
