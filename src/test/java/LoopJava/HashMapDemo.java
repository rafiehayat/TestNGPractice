package LoopJava;

import java.util.HashMap;
import java.util.Map;

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



	}

}
