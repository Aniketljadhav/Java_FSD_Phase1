package OOPS;

class Employee {
	float salary = 40000;
}

class Programmer extends Employee {
	int bonus = 10000;
	
	public void printSalary() {
		System.out.println("Base salary "+ salary);
		System.out.println(bonus);
	}
}





public class Inheritance{

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.printSalary();
	}
}
