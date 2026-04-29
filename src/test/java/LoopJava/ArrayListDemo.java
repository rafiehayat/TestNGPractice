package LoopJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
//		List MyList = new ArrayList();
//		ArrayList <String> al = new ArrayList<String>();
		
		al.add(100);
		al.add(10.5);
		al.add("Welcome");
		al.add('A');
		al.add(true);
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		al.add("Welcome to Array");
		System.out.println(al);
		
		al.add(2,"Added in 2nd");
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		
//		for(int i=0; i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
//		for(Object x:al)
//		{
//			System.out.println(x);
//
//		}
		
		
		//Using Iterator
		
		Iterator it =  al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("is ArrayList Empty or not -  "+ al.isEmpty());
		
		
		//Remove all elements from ArrayList
		
		
//		al.clear();
//		System.out.println("All Elements Cleared"+al);

		
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add("Welcome");
		
		System.out.println(al);

		
		al.removeAll(al2);
		System.out.println(al);

		


		

		
		
		


	}

}
