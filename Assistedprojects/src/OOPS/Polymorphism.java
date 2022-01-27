package OOPS;

class Sum {
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return (a+b+c);
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		System.out.println(Sum.add(10, 4));
		System.out.println(Sum.add(4, 7, 8));
		
		
	}
}
