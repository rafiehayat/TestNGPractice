package LoopJava;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		
		
		/* Do While Loop */
//		do{
//		  System.out.println(i);
//		  i++;
//		}while(i<=9);
		
//		for(int i=1;i<=10; i++)
//		{
//			System.out.println(i);
//		}
		
		int a [] = {100,200,300,400,500,600};
		int searchelement = 800;
		
		boolean status = false;
		
		for (int i =0; i<=a.length-1; i++)
		{
			if(a[i]== searchelement)
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
