package LoopJava;


class Animal {}
class Dog extends Animal {}
class Cat extends Animal{}

public class TypecastingDemo {

	public static void main(String[] args) {
		// Cat ct = (Cat) an;
		// A ,  B ,   C ,  D
		// Rule 1 - conversion is valid or not 
		//the type of 'd' and 'c' must have relationship (either parent to child or child to parent)
		Animal an = new Dog();
		Animal an2 = new Cat();
		
		Cat ct = (Cat) an ;
		
		Dog dg = new Dog();
	//	Cat ct2 = (Cat) dg;    -- conversion is not valid as per rule 1 
		
		// Rule 2 - Assignment is valid or not
		// 'c' must be same or child of 'a'
		
//		Animal an3 = new Dog();
//		Cat ct3 = (Cat) an3;    // valid as per rule 2
//		
//		Animal an4 = new Dog();
//		Cat ct4 = (Dog) an4;    // Invalid as per rule 2 
		
		//rule3
		// the underlying object type of 'd' must be either same or child of 'c'
		
//		Animal an5 = new Dog();
//		Cat ct5 = (Cat) an;      // invalid as per rule 3
		
		// rule1 , rule 2 ,rule3 
		Animal an6 = new Dog();
		Dog dg2 = (Dog) an;     // rule1 - yes    rule2 - yes  rule3 - yes

		
	}

}
