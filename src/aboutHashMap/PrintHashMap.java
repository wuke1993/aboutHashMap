package aboutHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author: wuke 
 * @date  : 2016��12��13�� ����10:14:54
 * Title  : PrintHashMap
 * Description : �������Ҫ��(keys)��ֵ(values)ʹ�÷�����
 *               �����ʹ�õ����԰汾����java 5�����Ǵ����ڱ���ʱɾ��entries������ʹ�÷�����
 *               ����ʹ�÷���һ(��ֵ��Ҫ)
 */
public class PrintHashMap {
	public static void main(String[] args) {		
		Map<String, Integer> map = null;
		map = new HashMap<String, Integer>();
		
		map.put("Wu", 23);
		map.put("Liu", 23);
		
		// for each, Java 5 ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println("KEY = " + entry.getKey() + ", VALUE = " + entry.getValue());
		}
		
		// ���ֻ��Ҫmap�еļ�����ֵ�������ͨ��keySet��values��ʵ�ֱ�������������entrySet
		// �÷�����entrySet�������������Ժã�����10%�������Ҵ�����Ӹɾ�
		for(String key : map.keySet()) {
			System.out.println("KEY = " + key);
		}
		for(Integer value : map.values()) {
			System.out.println("VALUE = " + value);
		}
		
		// �ϰ汾 java ��Ψһ���� map �ķ�ʽ���ô��ǣ������ڱ���ʱ���� iterator.remove() ��ɾ�� entries�������������������
		// ���� javadoc ��˵��������� for each �����г���ʹ�ô˷���������ǲ���Ԥ���		
		Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			
			System.out.println("KEY = " + entry.getKey() + ", VALUE = " + entry.getValue());
			
			//iter.remove();
		}
		
		// ͨ������ֵ���� Ч�ʵ�
		// ��Ϊ����һ�������������뿴��ȥ���Ӹɾ�����ʵ�������൱������Ч��
		// ��Ϊ�Ӽ�ȡֵ�Ǻ�ʱ�Ĳ������뷽��һ��ȣ��ڲ�ͬ��Mapʵ���и÷�������20%~200%��
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("KEY = " + key + ", VALUE = " + value);
		}
	}
}
