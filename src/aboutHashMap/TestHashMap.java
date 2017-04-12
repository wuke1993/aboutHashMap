package aboutHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wuke 
 * @date  : 2016年12月19日 上午10:02:29
 * Title  : testHashMap
 * Description : 
 */
public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String, String>();
		
		hs.put("aa", "aaa");
		hs.put("bb", "bbb");
		
		for(Map.Entry<String, String> entry : hs.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		hs.put("aa", "aaaa");
		
		for(Map.Entry<String, String> entry : hs.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
