package spring.DI;

import java.util.*;

public class CollectionDi {

	List<String> valueList;
	Map map;
	Properties pro;

	public List<String> getValueList() {
		return valueList;
	}

	public Map getMap() {
		return map;
	}

	public Properties getPro() {
		return pro;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public void setValueList(List<String> valueList) {
		this.valueList = valueList;
	}

	
/*	public void start() {
		Iterator iterator = map.keySet().iterator();
	    while (iterator.hasNext()) {
	        String key = (String) iterator.next();
	        System.out.print("key="+key);
	        System.out.println(" value="+map.get(key));
	    }
        System.out.println("-------------------------------------------");

	    for (Map.Entry<Object, Object> entry : pro.entrySet()) {
	    	   System.out.println("Key:" + entry.getKey() + " / "+ "Value:"
	    	     + entry.getValue());
	    	  }
	}
*/
	
	
	
}
