package LoopJava;

public class Employee {
	
	int id;
	String Name;
	String Job;
	int Salary;
	
	void Display()
	{
		System.out.println(id);
		System.out.println(Name);
		System.out.println(Job);
		System.out.println(Salary);

	}

	public static void main(String[] args) {
		
		Employee Emp1 = new Employee();
		Emp1.id = 101;
		Emp1.Name = "Rafie";
		Emp1.Job = "Tech Support";
		Emp1.Salary = 30000;
		Emp1.Display();
		
		Employee Emp2 = new Employee();
		Emp2.Name = "Rosy";
		Emp2.id = 101;
		Emp2.Job = "Tech Support";
		Emp2.Salary = 30000;
		Emp2.Display();
		
	

	}

}
