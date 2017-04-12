package aboutHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author: wuke 
 * @date  : 2016年12月13日 上午10:14:54
 * Title  : PrintHashMap
 * Description : 如果仅需要键(keys)或值(values)使用方法二
 *               如果你使用的语言版本低于java 5，或是打算在遍历时删除entries，必须使用方法三
 *               否则使用方法一(键值都要)
 */
public class PrintHashMap {
	public static void main(String[] args) {		
		Map<String, Integer> map = null;
		map = new HashMap<String, Integer>();
		
		map.put("Wu", 23);
		map.put("Liu", 23);
		
		// for each, Java 5 引入
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println("KEY = " + entry.getKey() + ", VALUE = " + entry.getValue());
		}
		
		// 如果只需要map中的键或者值，你可以通过keySet或values来实现遍历，而不是用entrySet
		// 该方法比entrySet遍历在性能上稍好（快了10%），而且代码更加干净
		for(String key : map.keySet()) {
			System.out.println("KEY = " + key);
		}
		for(Integer value : map.values()) {
			System.out.println("VALUE = " + value);
		}
		
		// 老版本 java 中唯一遍历 map 的方式。好处是：可以在遍历时调用 iterator.remove() 来删除 entries，下面的两个方法则不能
		// 根据 javadoc 的说法，如果在 for each 遍历中尝试使用此方法，结果是不可预测的		
		Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			
			System.out.println("KEY = " + entry.getKey() + ", VALUE = " + entry.getValue());
			
			//iter.remove();
		}
		
		// 通过键找值遍历 效率低
		// 作为方法一的替代，这个代码看上去更加干净；但实际上它相当慢且无效率
		// 因为从键取值是耗时的操作（与方法一相比，在不同的Map实现中该方法慢了20%~200%）
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("KEY = " + key + ", VALUE = " + value);
		}
	}
}
