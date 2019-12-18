package jh;

import java.util.TreeSet;

public class E11 {

	public static void main(String[] args) {
		//创建TreeSet集合
		TreeSet<Integer> tS=new TreeSet<Integer>();
		//向集合TreeSet中添加元素
		tS.add(3);
		tS.add(9);
		tS.add(1);
		tS.add(21);
		System.out.println("创建的TreeSet集合为:"+tS);
		//获取首尾元素
		System.out.println("TreeSet集合首元素为:"+tS.first());
		System.out.println("TreeSet集合尾部元素为:"+tS.last());
		//比较并获取元素
		System.out.println("集合中小于或等于9的最大的一个元素为:"+tS.floor(9));
		System.out.println("集合中大于10的最小的一个元素为:"+tS.higher(10));
		System.out.println("集合中大于100的最小的一个元素为:"+tS.higher(100));
		//删除元素
		Object first=tS.pollFirst();
		System.out.println("删除的第一个元素是:"+first);
		System.out.println("删除第一个元素后TreeSet集合变为:"+tS);
	}

}
