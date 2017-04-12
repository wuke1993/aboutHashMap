package aboutHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author: wuke 
 * @date  : 2016年10月29日 下午7:15:13
 * Title  : AnagramMultipleNumber
 * Description : “异位构词”，一个数和它的倍数之间互为“同分异构”
 */
public class AnagramMultipleNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int sum = 0;
		sum = sumOfAnagram(N);
		
		System.out.println(sum);
	}
	

	static int sumOfAnagram(int N) {
		int sum = 0;
		int digit = 0;
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		
		// calculate all the digits of N, and store them and their own apper times in HashMap
		int tem = N;
		while(tem > 0) {
			digit = tem % 10;
			if(hs.containsKey(digit))
				hs.put(digit, hs.get(digit) + 1);
			else 
				hs.put(digit, 1);
			tem /= 10; 
		}
		
		HashMap<Integer, Integer> hss = new HashMap<Integer, Integer>();
		for(int i = 2; i <= 9; i++) {		
			//hss = hs;
			int tag = 1;
			for(Entry<Integer, Integer> entry : hs.entrySet()){
				hss.put(entry.getKey(), entry.getValue());
			}
			
			int temp = i * N;
			if(temp <= 9999999) {
				// calculate all the digits of M, and store them and their own apper times in HashMap
				while(temp > 0) {
					digit = temp % 10;
					
					if(hss.containsKey(digit))
						hss.put(digit, hss.get(digit) - 1);
					temp /= 10; 
				}
				
				// judge the values of the HashMap is or not all zero
				for(Entry<Integer, Integer> entry : hss.entrySet()){
					if(entry.getValue() != 0)
						tag = 0;
				}
				
				if(tag == 1)
				    sum++;
			}
		}
		
		return sum;
	}
}



