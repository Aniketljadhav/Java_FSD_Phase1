package Constroctor;
class BookInfo{
	int id;
	String name;

	void Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class constructorDemo {
public static void main(String[] args) {

	BookInfo book1=new BookInfo();
	BookInfo book2=new BookInfo();
	book1.display();
	book2.display();
		}
}
