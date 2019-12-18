package jh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class Customcomparator implements Comparator<Object>{
	@Override
	public int compare(Object o1,Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}
}

public class Bct_2 {

	public static void main(String[] args) {
		Map<String, String> tmap=new TreeMap<String, String>(new Customcomparator());
		tmap.put("2", "john");
		tmap.put("1", "lucy");
		tmap.put("3", "smith");
		tmap.put("5", "Amanda");
		tmap.put("4", "aimee");
		System.out.println("用键集遍历双列集合的键和值");
		
		Set<String> jianji=tmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}

	}

}
