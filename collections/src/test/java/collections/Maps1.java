package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps1 {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
			map.put("Ap", "Amaravathi");
		 	map.put("India", "Delhi");
	      	map.put("USA", "Washington");
	        map.put("UK", "London");//duplicate key
	        map.put("UK", "New London");
	        
	     System.out.println(map);
	     
	    System.out.println(map.get("India"));
	    
	    map.remove("USA");
	    System.out.println(map);
	    
	    System.out.println(map.containsKey("UK"));
	    
	    System.out.println(map.containsValue("London"));
	    
	    System.out.println(map.size());
	    
	    System.out.println(map.isEmpty());
	    
	    System.out.println(map.keySet());
	    
	   System.out.println(map.values());
	   
	   
	   for(Map.Entry<String,String> entry:map.entrySet()) {
		   
		   System.out.println(entry.getKey() + "=> " + entry.getValue());
	   }
		
	}

}
