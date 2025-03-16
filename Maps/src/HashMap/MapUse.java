package HashMap;

import java.util.HashMap;
import java.util.Set;


public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>(); 
		map.put("abc", 1);
		map.put("def", 2);
		
		System.out.println(map.size());
		
		if(map.containsKey("abc")) {
			System.out.println("Has abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("Hasabc1");
		}
		
		if(map.containsKey(2)) {
			System.out.println("has value 2");
		}
		
		int v=0;
		if(map.containsKey("abc1")) {
			v=map.get("abc1");
		}
		System.out.println(v);
		
		int s=map.remove("abc");
		System.out.println(s);
		
		Set<String> keys=map.keySet();
		for(String str:keys) {
			System.out.println(str);
		}
		
	}

}
