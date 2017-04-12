package aboutConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: wuke 
 * @date  : 2017��4��12�� ����10:31:58
 * Title  : TestConcurrentHashMap
 * Description : 
 */
public class TestConcurrentHashMap {

	private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		new Thread("Thread1") {
			@Override
			public void run() {
				map.put(3, 33);
			}
		};
		
		new Thread("Thread2") {
			@Override
			public void run() {
				map.put(4, 44);
			}
		};
		
		new Thread("Thread3") {
			@Override
			public void run() {
				map.put(7, 77);
			}
		};
		
		System.out.println(map);
	}

}
