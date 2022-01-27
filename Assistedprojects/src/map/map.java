package map;
import java.util.*;
import java.util.Map.Entry;
public class map {

	public static void main(String[] args) {
		
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"aniket");    
	      hm.put(2,"ravi");    
	      hm.put(3,"abhi");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for (Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Ani");  
	      ht.put(5,"adi");  
	      ht.put(6,"nayan");  
	      ht.put(7,"sk");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for (Iterator<Entry<Integer, String>> iterator = ht.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> n = iterator.next();
			System.out.println(n.getKey()+" "+n.getValue());
		}
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"paras");    
	      map.put(9,"aj");    
	      map.put(10,"mauli");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> l = iterator.next();
			System.out.println(l.getKey()+" "+l.getValue());
		}    
	      
	   }  
}

