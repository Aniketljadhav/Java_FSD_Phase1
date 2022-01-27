package OOPS;

public class Car {
	String brand; 
    String model; 
     String color; 
    public Car(String brand, String model, String color) 
    { 
        this.brand = brand; 
        this.model = model; 
        this.color = color; 
    } 
    public String getbrand() 
    { 
        return brand; 
    } 
    public String getmodel() 
    { 
        return model; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return( "this is my car "+ this.getbrand()+ ".\nits model and color are " + this.getmodel()+" and "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Car scott = new Car("TATA","Harriar",  "black"); 
        System.out.println(scott.toString()); 
    } 
}
