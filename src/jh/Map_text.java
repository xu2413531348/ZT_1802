package jh;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Map_text {

	public static void main(String[] args) {
		HashMap <String,String>hmap=new HashMap<String,String>();
		hmap.put("1", "jack");
		hmap.put("2", "Rose");
		hmap.put("3", "Pete");
		System.out.println(hmap);
		
		if (hmap.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
		System.out.println("这个双列集合包中键1的值是"+hmap.get("1"));
		}
		//将双列集合Map变成单列键的对象集合使用keySet()方法
		//将双列集合Map变成单列值的对象集合使用values()方法
	System.out.println("这个双列集合中所有键的集合是"+hmap.keySet());
	System.out.println("这个双列集合中所有键的集合是"+hmap.values());
	//将键为1的值改成Andy
	hmap.replace("1", "Andy");
	System.out.println(hmap);
	//删除键1对应的键key值+value=对entry
	hmap.remove("1");
	System.out.println(hmap);
	
	System.out.println("用键集遍历双列集合的键和值");
	//将双列集合Map变成单列的键对象集合使用keySet()方法
	Set<String> jianji=hmap.keySet();
	Iterator<String> diedai=jianji.iterator();
	while (diedai.hasNext()) {
		Object key = (Object) diedai.next();
		Object value=hmap.get(key);
		System.out.println(key+":"+value);
	}
	
	
	
	System.out.println("用键值对集遍历双列集合的键和值");
	//将双列集合Map变成单列的键对象集合使用keySet()方法
	Set<?> jianzhiduiji=hmap.entrySet();
	Iterator<?> diedai2=jianzhiduiji.iterator();
	while (diedai2.hasNext()) {
		@SuppressWarnings("unchecked")
		Map.Entry<String,String> jianzhidui=(Map.Entry<String,String>) diedai2.next();
		Object key = jianzhidui.getKey();
		Object value=jianzhidui.getValue();
		System.out.println(key+":"+value);
	}
	
	System.out.println("用foreach键值对集遍历双列集合的键和值");
	hmap.forEach((key,value)->System.out.println(key+":"+value));
	System.out.println("用foreach键值对集遍历双列集合的所有值");
	Collection<String>  zhiji=hmap.values();
	zhiji.forEach(value->System.out.println(value));
	
	
	
	HashMap<String,String> hmap2=new LinkedHashMap<String,String>();
	hmap2.put("3", "jack");
	hmap2.put("1", "Rose");
	hmap2.put("2", "Pete");
	System.out.println(hmap2);
	
	}	
}