package EduBridge;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class sortArray {
	
	public static List<Integer> sortBasedOnFrequencyAndIndex(List<Integer> list) {
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for (int i = 0; i < list.size(); i++) {
	      map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
	      System.out.println();
	    }
	    
	    Collections.sort(list, (n1, n2) ->  {
	        int freq1 = map.get(n1);
	        int freq2 = map.get(n2);
	        
	        if(freq1 != freq2) {
	          return freq1 - freq2;
	        } 
	        
	        return list.indexOf(n2) - list.indexOf(n1);
	    });
	    
	    return list;
	  }
	
	

	  public static void main(String[] args) {
	    //Integer arr[] = {5,5,4,6,4};
	    List<String> list = Arrays.asList("5","4","5","6","6");    
	    //System.out.println(sortArray.sortBasedOnFrequencyAndIndex(list));
	    String convertedList = String.join(",", list);
	    String final1 = convertedList.replaceAll("," , " ");
	    System.out.println(final1);
	    
	 
	  }


}
