package LoopJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		Map hm2 = new HashMap();
		
		HashMap<Integer,String> hm3 = new HashMap<Integer,String>();
		
//		hm3.put(101, "John");    //{101=John, 102=Rock, 103=Scott, 104=David, 105=Scott}

//		hm3.put(102, "Rock");
//		hm3.put(103, "Scott");
//		hm3.put(104, "David");
//		hm3.put(105, "Scott");
		
		hm3.put(101, "John");
		hm3.put(102, "Rock");
		hm3.put(103, "Scott");
		hm3.put(104, "David");
		hm3.put(103, "Scott");
		
		System.out.println(hm3);
		
		System.out.println("Size of hashMap " +hm3.size());
		
//		remove pair
		
		hm3.remove(102);
		System.out.println("After Removing Pair - "+hm3);
		
		//access the value of the key
		System.out.println(hm3.get(101));
		
		//get all the keys from hashmap
		System.out.println(hm3.keySet());
		
		//get all the values key and set both
		System.out.println(hm3.entrySet());
		
		
		//Reading Data From hashMap
		//Using For each
		
		for(int i:hm3.keySet())
		{
			System.out.println(i +"      " + hm3.get(i));
		}
		
		//Using Iterator
		Iterator<Entry<Integer, String>> it = hm3.entrySet().iterator();
		
		while(it.hasNext())
		{
//			System.out.println(it.next());
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"--   " + entry.getValue());
		}
//		mySet.clear();
//		System.out.println("After removing Element - " +mySet); 
		





	}

}
