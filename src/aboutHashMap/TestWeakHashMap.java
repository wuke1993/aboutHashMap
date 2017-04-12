package aboutHashMap;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author: wuke 
 * @date  : 2016年12月13日 上午10:03:50
 * Title  : TestWeakHashMap
 * Description : 
 */
public class TestWeakHashMap {

	public static void main(String[] args) {
		Map<String, String> map = null;
		map = new WeakHashMap<String, String>();
		
		map.put("WuHan", "HuBei");
		map.put("Xian", "ShannXi");
		
		System.gc();
		
		System.out.println(map);
		
		map.put("FoShan", "GuangDong");
		map.put("JiLin", "JiLin");
		System.out.println(map);
	}

}
