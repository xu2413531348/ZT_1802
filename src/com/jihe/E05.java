package com.jihe;

public class E05 {
 static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		// foreach遍历并修改数组中的元素，可以吗？不可以
	 for(String mgys:strs) {
		 mgys="ddd";
	 }
	 System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
	 //for遍历并修改数组中的元素，可以吗？可以
	 for(int i=0;i<strs.length;i++) {
		 strs[i]="ddd";
	 }
	 System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
	}

}
