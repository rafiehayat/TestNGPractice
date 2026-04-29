package LoopJava;

public class TypeCastingObjectDemo {

	public static void main(String[] args) {

//		//Ex1
//		Object o = new String("Welcome");
//		StringBuffer sb = (StringBuffer) o;    // Rule1 - yes rule 2 - - yes  rule3 --failed
//		  
//		//ex2
//		String s = new String("Welcome");
//		StringBuffer sb1 = (StringBuffer) s ;  //rule1 - failed
//		
//		//ex3
//		Object o1 = new String("Welcome");
//		StringBuffer sb2 = (StringBuffer) o1;   // rule1 - yes   rule2 yes   rule3 - failed
//		
//		//ex4
//	    Object o2 = new String("Welcome");
//	    StringBuffer sb3 = (String) o2;      //rule1 - passed    rule2- failed
//	    
//	    //ex5
//	    String s1 = new String("Welcome");
//	    StringBuffer sb4 = (String) s1;       //rule1 - passed    rule2- failed
//	    
//	    //ex6
//	    Object o3 = new String("Welcome");
//	    StringBuffer sb5 = (StringBuffer) o3;     // rule1 - yes   rule2 yes   rule3 - failed
	    
	    
	    //ex7
	    Object o4 = new String("Welcome");
	    String s2 = (String) o4;       //rule1 - passed    rule2- passed   rule3 - passed
	    
	    
	    System.out.println(s2);
		
	}

}
