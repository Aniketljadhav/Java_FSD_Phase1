package innerclass;
public class localinnerclass {

private String msg=" Local Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	localinnerclass  ob=new localinnerclass ();  
	ob.display();  
	}
}