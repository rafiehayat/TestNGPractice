package LoopJava;

public class ArrayMatch {

	public static void main(String[] args) {
		int a [] = {100,200,300,400,500,600};
		int searchelement = 500;
		
		boolean status = false;
		
//		for (int i =0; i<=a.length-1; i++)
//		{
//			if(a[i]== searchelement)
//			{
//				System.out.println("Element Matched");
//				status = true;
//				break;
//			}
//			
//		}
//		if(status==false)
//		{
//			System.out.println("Element not matched");
//		}
		
		for (int x:a)
		{
			if(x== searchelement)
				{
					System.out.println("Element Matched");
					status = true;
					break;
				}
		}
		if(status==false)
		{
			System.out.println("Element not matched");
		}
	}

}
