package LoopJava;


class Animal {}
class Dog extends Animal {}
class Cat extends Animal{}

public class TypecastingDemo {

	public static void main(String[] args) {
		
		// Rule 1 - conversion is valid or not 
		//the type of 'd' and 'c' must have relationship (either parent to child or child to parent)
		Animal an = new Dog();
		Animal an2 = new Cat();
		
		Cat ct = (Cat) an ;
		
		Dog dg = new Dog();
	//	Cat ct2 = (Cat) dg;    -- conversion is not valid as per rule 1 
		
		// Rule 2 - Assignment is valid or not
		// 'c' must be same or child of 'a'
		
		Animal an3 = new Dog();
		Cat ct3 = (Cat) an3;
		
	}

}
