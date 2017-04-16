package aboutHashMap;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author: wuke
 * @date : 2016年7月27日 下午5:12:06 Title : TestHash2 Description :
 */
public class TestHash {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("语文", 1);
		map.put("数学", 2);
		map.put("英语", 3);
		map.put("历史", 4);
		map.put("政治", 5);
		map.put("地理", 6);
		map.put("生物", 7);
		map.put("化学", 8);
		map.put("俄语", 9);
		map.put("西班牙语", 10);
		map.put("德语", 11);
		map.put("C语言", 12);

		map.put("计算机组成原理", 13);
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		String a = "数学";
		String b = "化学";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		String c = "1g6hd3w";
		System.out.println(c.hashCode());
	}
}
