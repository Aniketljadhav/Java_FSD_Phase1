package multithreding;

public class Extendthread extends Thread {

	
	public void run() {
		System.out.println("Thread is running ...");
	}
	
	public static void main(String[] args) {
	
		Extendthread t1 = new Extendthread();
		
		
		
		t1.start();
				

	}

}