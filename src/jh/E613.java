package jh;

import java.util.Comparator;
import java.util.TreeSet;
class Mycomparator implements Comparator<Object>{

	@Override//比较字符的长度，如果长度相同，则不允许进入TreeSet
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.length()-s2.length();
		
	}
	
}
public class E613 {

	public static void main(String[] args) {
		//在构造TreeSet时，指明要用到的比较器
		TreeSet<String> tSet=new TreeSet<String>(new Mycomparator());
		tSet.add("jack");
		tSet.add("jack");
		tSet.add("Eva");
		tSet.add("Serena");
		tSet.add("Rose");
		System.out.println(tSet);
		
	}

}
