package jh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.SynchronousQueue;
public class gongjulei {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list, "赵","钱","孙","李","周");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("排序后:"+list);
		Collections.sort(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("自然排序后:"+list);
		Collections.shuffle(list);
		System.out.println("随机排序后:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("首尾交换后:"+list);
		Collections.reverse(list);
		
		ArrayList<Integer> list2=new ArrayList<>();
		Collections.addAll(list2, -3,9,2,8,5);
		System.out.println("集合中的元素"+list2);
		System.out.println("集合中最大值元素"+Collections.max(list2));;
		System.out.println("集合中最小值元素"+Collections.max(list2));;
		Collections.replaceAll(list2, 8, 0);
		System.out.println("集合中的元素"+list2);
		System.out.println("替换后集合中的元素");
		Collections.sort(list2);
		System.out.println("自然排序后:"+list2);
		System.out.println("自然排序后，通过二分查找元素9的下标是:"+Collections.binarySearch(list2, 9));
	
	}
}


