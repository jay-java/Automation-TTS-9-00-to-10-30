package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P025_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");//entry
		map.put(2, "c++");
		map.put(3, "java");
		map.put("python", 4);
		map.put(1.34, "ruby");
		map.put(45, false);
		System.out.println(map);
		map.put(1, "dart");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : " +entry.getValue());
		}
	}
	
}
