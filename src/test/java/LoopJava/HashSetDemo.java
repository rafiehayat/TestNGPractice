package LoopJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet mySet = new HashSet();    // Heterogenous Data is Allowed
//		Set mySet2 = new HashSet();
//		HashSet <String> mySet3 = new HashSet <String>();
		
		mySet.add(100);
		mySet.add(10.5);
		mySet.add("Welcome");
		mySet.add('A');
		mySet.add(true);
		mySet.add(100);
		mySet.add(null);
		mySet.add(null);
		
		System.out.println(mySet);    //[null, A, 100, 10.5, Welcome, true]
		
		
		mySet.remove(100);
		System.out.println("After removing Element" +mySet);    //[null, A, 10.5, Welcome, true]
		
		// Inserting Element -- Not Possible
		
		//Access Specific Elelent -- Not Possible
		
		//Covert hashSet to ArrayList 
		
		ArrayList al = new ArrayList(mySet);
		System.out.println("ArrayList Element"+al);
		System.out.println(al.get(2));
		
		//Read all the elements using for Each
		
//		for(Object x:mySet)
//		{
//			System.out.println(x);
//		}
		
		Iterator<Object> it = mySet.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		mySet.clear();
		System.out.println("After removing Element - " +mySet);   

		
		

		


		

	}

}
